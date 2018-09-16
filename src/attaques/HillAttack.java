/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attaques;


//class Vecteur:
/**
 *
 * @author Minfo
 */
public class HillAttack {
    
     static int[] t = {1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25};

    static int pgdc(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return pgdc(b, r);
        }
    }

    //Fonction qui calcule l'inverse d'un nombre:
    static int inverse(int n) {

        int inv = 0;
        for (int i = 0; i < 12; i++) {
            if ((n * t[i]) % 26 == 1) {
                inv = t[i];
                break;
            } 
           
        }

        return inv;
    }

    /*
     *  cettte fonction RENVOIE LE det(A)SI ELLE EST INVERSIBLE MODULO 26
     * 0 SINON
     */
    static int inverseDet(int[][] A) {

        int detA = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        int invDet = 0;

        if (pgdc(detA, 26) == 1) {

            for (int i = 0; i < 12; i++) {
                if ((detA * t[i]) % 26 == 1) {
                    invDet = t[i];
                    break;
                }
            }
        }

        return invDet;

    }

    /*
     * FONCTION QUI DEVINE LA MATRICE DE CRYPTAGE:
     * elle rprend un chaine de 4 caractes et
     * retourne une matrice 2X2 entiers
     */
    static int[][] devineMatrice(String txt1, String txt2) {

        txt1=txt1.toUpperCase();
        txt2=txt2.toUpperCase();
        int x1, x2, x3, x4;
        int[][] M = new int[2][2];
        int a = txt1.charAt(0) - 64;
        int b = txt1.charAt(1) - 64;
        int c = txt1.charAt(2) - 64;
        int d = txt1.charAt(3) - 64;

        int e = txt2.charAt(0) - 64;
        int f = txt2.charAt(1) - 64;
        int g = txt2.charAt(2) - 64;
        int h = txt2.charAt(3) - 64;

        /*Il faut claculer les deux systemes X.A1=B1
         * et X.A2=B2
         * a*x1+b*x2=e mod(26) (1)
         * a*x3+b*x4=f mod(26) (2)
         *         ET
         * c*x1+d*x2=g mod(26) (3)
         * c*x3+d*x4=h mod(26) (4)
         * 
         * les (1)et(3) forment un systeme d'equations
         * les (2)et(4) forment un autre systeme d'equations
         * 
         * a*x1+b*x2=e mod(26) (1)
         * c*x1+d*x2=g mod(26) (3)
         *         ET
         * a*x3+b*x4=f mod(26) (2)
         * c*x3+d*x4=h mod(26) (4)
                
         */

        x1 = (e * d - g * b) * inverse(a * d - b * c);
        x2 = (e - a * x1) * inverse(b);

        x3 = (f * d - b * h) * inverse(a * d - b * c);
        x4 = (f - a * x2) * inverse(b);

        M[0][0] = (x1 + 26) % 26;
        M[0][1] = (x2 + 26) % 26;
        M[1][0] = (x3 + 26) % 26;
        M[1][1] = (x4 + 26) % 26;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                if(M[i][j]<0) M[i][j]+=26;
        }
            
        System.out.println("      La matrice clé est:     ");
        System.out.println("          " + M[0][0] + " " + M[0][1]);
        System.out.println("          " + M[1][0] + " " + M[1][1]);

        return M;
    }

    /*
     * FONCTION DE DECRYPTAGE:
     */
    static String decryptage(String texte, int[][] A) {


        texte = texte.toUpperCase();
        texte = texte.replace(" ", "Z");
        if (texte.length() % 2 == 1) {
            texte += "Z";
        }
        String claire = " ";
        Vect[] v = new Vect[texte.length()];

        int inv = inverseDet(A);
        int[][] invA = new int[2][2];

        if (inv == 0) {
            System.out.println("La matrice de chiffrement n'est pas inversible \n");
            return null;
        } else {

            //CALECUL DE L'INVERSE DE A MODULO 26.
            invA[0][0] = (A[1][1] * inv) % 26;
            invA[0][1] = 26 + (-A[0][1] * inv) % 26;
            invA[1][0] = 26 + (-A[1][0] * inv) % 26;
            invA[1][1] = (A[0][0] * inv) % 26;

            for (int i = 1; i < texte.length(); i++) {

                char c1 = texte.charAt(i - 1);
                char c2 = texte.charAt(i);
                int n1 = c1 - 64;
                int n2 = c2 - 64;

                if (Character.isLetter(c1) == false) {
                    claire += c1;
                    continue;
                }

                if (Character.isLetter(c2) == false) {
                    claire += c2;
                    continue;
                } else {
                    v[i] = new Vect(n1, n2);

                    int x = (invA[0][0] * v[i].x + invA[0][1] * v[i].y) % 26;
                    int y = (invA[1][0] * v[i].x + invA[1][1] * v[i].y) % 26;

                    //System.out.print("("+x+","+y+");"); 
                    char l1, l2;
                    l1 = (char) (x + 64);
                    l2 = (char) (y + 64);

                    claire += l1;
                    claire += l2;
                    i++;
                }
            }
        }
        return claire;
    }
    
}
class Vect {

    public Vect(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x, y;
}