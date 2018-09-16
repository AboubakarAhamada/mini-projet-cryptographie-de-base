package cryptDecrypt;


/**
 *
 * @author Minfo
 */
public class CesarVue extends javax.swing.JFrame {

    /**
     * Creates new form CesarVue
     */
    public CesarVue() {
        initComponents();
        this.setTitle("Cesar");
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

        jLabel1 = new javax.swing.JLabel();
        keyEnter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtLeftArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtRightArea = new javax.swing.JTextArea();
        jbCrypt = new javax.swing.JButton();
        jbDecrypt = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clé de cryptage:");

        keyEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyEnterActionPerformed(evt);
            }
        });

        jtxtLeftArea.setColumns(20);
        jtxtLeftArea.setRows(5);
        jScrollPane1.setViewportView(jtxtLeftArea);

        jtxtRightArea.setColumns(20);
        jtxtRightArea.setRows(5);
        jScrollPane2.setViewportView(jtxtRightArea);

        jbCrypt.setText("Crypter >>");
        jbCrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCryptActionPerformed(evt);
            }
        });

        jbDecrypt.setText("<< Decrypter");
        jbDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDecryptActionPerformed(evt);
            }
        });

        quitter.setText("Fermer");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        jLabel2.setText("Cyptage et décryptage par laméthode de César :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDecrypt))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(quitter)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keyEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrypt)
                    .addComponent(jbDecrypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyEnterActionPerformed
        // TODO add your handling code here:
        cesarKey=Integer.parseInt(keyEnter.getText());
        
    }//GEN-LAST:event_keyEnterActionPerformed

    private void jbCryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCryptActionPerformed
        // TODO add your handling code here:
        cesarKey=Integer.parseInt(keyEnter.getText());
        String texte=(String)(jtxtLeftArea.getText()).toUpperCase();
        String crypted=CesarCode.cesarCrypt(texte,cesarKey);
        jtxtRightArea.setText(crypted);
    }//GEN-LAST:event_jbCryptActionPerformed

    private void jbDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDecryptActionPerformed
        // TODO add your handling code here:
        cesarKey=Integer.parseInt(keyEnter.getText());
        String texte=(String)(jtxtRightArea.getText()).toUpperCase();
        String decrypted=CesarCode.cesarDecrypt(texte,cesarKey);
        jtxtLeftArea.setText(decrypted);
    }//GEN-LAST:event_jbDecryptActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_quitterActionPerformed

    
    int cesarKey;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCrypt;
    private javax.swing.JButton jbDecrypt;
    private javax.swing.JTextArea jtxtLeftArea;
    private javax.swing.JTextArea jtxtRightArea;
    private javax.swing.JTextField keyEnter;
    private javax.swing.JButton quitter;
    // End of variables declaration//GEN-END:variables
}
