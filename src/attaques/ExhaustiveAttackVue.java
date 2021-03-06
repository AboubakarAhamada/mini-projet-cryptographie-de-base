 
package attaques;
import cryptDecrypt.*;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Minfo
 */
public class ExhaustiveAttackVue extends javax.swing.JFrame {

    /**
     * Creates new form ExhaustiveAttackVue
     */
    public ExhaustiveAttackVue() {
       
         initComponents();
         this.setTitle("Bute Force Attack");
         this.setResizable(false);
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCesarAttack = new javax.swing.JButton();
        jbMultAttack = new javax.swing.JButton();
        jbAffineAttack = new javax.swing.JButton();
        jbHillAttack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtHighArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtLowArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        KeyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCesarAttack.setBackground(new java.awt.Color(204, 204, 255));
        jbCesarAttack.setText("Cesar Attack");
        jbCesarAttack.setAutoscrolls(true);
        jbCesarAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCesarAttackActionPerformed(evt);
            }
        });

        jbMultAttack.setText("Multiplcation Attack");
        jbMultAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultAttackActionPerformed(evt);
            }
        });

        jbAffineAttack.setText("Affine Attack");
        jbAffineAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAffineAttackActionPerformed(evt);
            }
        });

        jbHillAttack.setText("Hill Attack");
        jbHillAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHillAttackActionPerformed(evt);
            }
        });

        jtxtHighArea.setColumns(20);
        jtxtHighArea.setRows(5);
        jScrollPane1.setViewportView(jtxtHighArea);

        jtxtLowArea.setColumns(20);
        jtxtLowArea.setRows(5);
        jScrollPane2.setViewportView(jtxtLowArea);

        jLabel1.setText("Clé(s) de cryptage :");

        jLabel2.setText("Mesage trouvé :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbMultAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAffineAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCesarAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbHillAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCesarAttack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMultAttack)
                        .addGap(4, 4, 4)
                        .addComponent(jbAffineAttack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbHillAttack)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeyLabel)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fermer)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fermer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAffineAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAffineAttackActionPerformed
        // TODO add your handling code here:
        int t[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        String texte=(String)(jtxtHighArea.getText()).toUpperCase();
        jtxtLowArea.setText("");
        for(int i=0;i<13;i++){
            
             for (int j=0;j<26;j++) {
                    
                      jtxtLowArea.append(AffineCode.affineDecrypt(texte,t[i],j)+" , clé= ("+t[i]+" ,"+j+")"+"\n");
             }
             
             int rep=JOptionPane.showConfirmDialog(null," Voulez vous continuer ?");
             
             if(rep!=0) break;      //si NON ou Anuller
             
            jtxtLowArea.setText("");
         }
        
    }//GEN-LAST:event_jbAffineAttackActionPerformed

    private void jbCesarAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCesarAttackActionPerformed
        // TODO add your handling code here:
        String texte=(String)(jtxtHighArea.getText()).toUpperCase();
        jtxtLowArea.setText("");
        for(int i=1;i<=25;i++){
                  
              jtxtLowArea.append(CesarCode.cesarDecrypt(texte,i)+" , clé= "+i+"\n");       
              
         }
    }//GEN-LAST:event_jbCesarAttackActionPerformed

    private void jbMultAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultAttackActionPerformed
        // TODO add your handling code here:
        int t[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        String texte=(String)(jtxtHighArea.getText()).toUpperCase();
        jtxtLowArea.setText("");
        for(int i=0;i<13;i++){
                  
              jtxtLowArea.append(MultiplicationCode.multiplicationDecrypt(texte,t[i])+" , clé= "+t[i]+"\n");       
              
         }
    }//GEN-LAST:event_jbMultAttackActionPerformed

    private void jbHillAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHillAttackActionPerformed
        // TODO add your handling code here:
        jtxtLowArea.setText("");
        String texte=jtxtHighArea.getText().toUpperCase();
        
    }//GEN-LAST:event_jbHillAttackActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_fermerActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KeyLabel;
    private javax.swing.JButton fermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAffineAttack;
    private javax.swing.JButton jbCesarAttack;
    private javax.swing.JButton jbHillAttack;
    private javax.swing.JButton jbMultAttack;
    private javax.swing.JTextArea jtxtHighArea;
    private javax.swing.JTextArea jtxtLowArea;
    // End of variables declaration//GEN-END:variables
}
