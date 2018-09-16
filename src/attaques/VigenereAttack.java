package attaques;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class VigenereAttack {

    public static int caesar_findGap(String filename) throws IOException {
        // Tableau des fréquences (Code ASCII, Fréquence)
        int frequences[] = new int[26];
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String message = in.readLine();

        // Calcul des fréquences des lettres
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < message.length(); j++) {
                if (message.charAt(j) == (char) i) {
                    frequences[i - 97]++;
                }
            }
        }

        int highestIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (frequences[i] > frequences[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\nLettre la plus fréquente : '" + (char) (highestIndex + 97) + "', correspond donc au 'e'");

        // On récupère la valeur du décalage
        int decalage = ((int) 'z' - (int) 'a') - ((((int) 'z' - (int) 'a') - highestIndex) + ((int) 'e' - (int) 'a'));
        if (decalage < 0) {
            decalage += 26;
        }
        System.out.println("Décalage trouvé : " + decalage);

        return decalage + 97;
    }

    

    public static String cryptanalysis(String ciphertext) throws IOException {
        // Cassage de la longueur de la clé en calculant l'indice de coincidence
        // On fait en force brute en testant pour chaque longueur de clé possible
        int I = 0;
        boolean unfound = true;
        ArrayList<String> createdFiles = new ArrayList<String>();

        // Pour chaque taille de clé possible, mettre jusqu'à la taille totale du texte
        while (unfound && I < ciphertext.length()) {
            createdFiles.clear();
            I++;
            // Tableau où seront stocké les indices de coincidence
            float ic[] = new float[I];

            // Pour chaque "partition"
            for (int i = 0; i < I; i++) {
                // Pour une taille de clé, on divise le texte en sous textes qu'on stocke dans des fichiers
                String generatedFilename = "workingfileskey" + I + "part" + i + ".txt";
                createdFiles.add(generatedFilename);

                FileWriter out = new FileWriter(generatedFilename, false);
                for (int j = 0; j < ciphertext.length(); j++) {
                    if (j % I == i) {
                        out.write(ciphertext.charAt(j));
                    }
                }

                out.close(); // On vide le buffer
                
                // Pour chaque texte créé on stocke l'indice de coincidence calculé
                BufferedReader in = new BufferedReader(new FileReader(generatedFilename));
                String subtext = in.readLine();

                // Boucle pour calculer la fréquence
                for (int j = 97; j <= 122; j++) {
                    int frequency = 0;

                    for (int k = 0; k < subtext.length(); k++) {
                        if (subtext.charAt(k) == (char) j) {
                            frequency++;
                        }
                    }

                    ic[i] += (float) (Math.pow(frequency, 2) / (Math.pow(subtext.length(), 2)));
                }

                in.close();
            }

            // Taux d'erreur en %
            double tolerance = 15;
            boolean isGoodLength = true;
            System.out.println("Test pour la taille : " + I);

            for (int i = 0; i < ic.length; i++) {
                System.out.println((0.075 + (0.075 * tolerance / 100) + " " + ic[i] + " " + (0.075 - (0.075 * tolerance / 100))));
                if (0.075 + (0.075 * tolerance / 100) < ic[i] || 0.075 - (0.075 * tolerance / 100) > ic[i]) {
                    isGoodLength = false;
                }
            }

            // Si tous les indices correspondent, c'est certainement la bonne clé ! On la calcule et on la propose
            if (isGoodLength) {
                System.out.println("La clé est certainement de taille " + I);
                unfound = false;
            }

            // Si la taille de la clé ne parait pas être bonne, on continue
        }

        String key = "";
        for (int i = 0; i < createdFiles.size(); i++) {
            key += (char) caesar_findGap(createdFiles.get(i));
        }

        return key;
    }

    
    
}