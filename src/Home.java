
import cryptDecrypt.*;

import attaques.*;
import java.awt.Color;

/**
 *
 * @author Minfo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Home");
        this.jtxtArea.setEditable(false);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cesarItem = new javax.swing.JMenuItem();
        multiplicationItem = new javax.swing.JMenuItem();
        affineItem = new javax.swing.JMenuItem();
        hillItem = new javax.swing.JMenuItem();
        vigenereItem = new javax.swing.JMenuItem();
        concidenceIndexAttaque = new javax.swing.JMenu();
        bruteForceAttack = new javax.swing.JMenuItem();
        frequencyAttack = new javax.swing.JMenuItem();
        conicidenceIndexAttack = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtArea.setColumns(20);
        jtxtArea.setRows(5);
        jtxtArea.setText("Fonctionnement:\nComencer par choisir une options parmi celles qui se trouvent sur\nla bare de menus. Et cliquer sur la méthode que vous voulez \nutilisez.Respecter les champs de saisi, et le volume du texte \ndans le cas exigé.\n \n");
        jScrollPane1.setViewportView(jtxtArea);

        jMenu1.setText("Cryptographie");

        cesarItem.setText("Méthode de César");
        cesarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cesarItemActionPerformed(evt);
            }
        });
        jMenu1.add(cesarItem);

        multiplicationItem.setText("Multiplication");
        multiplicationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationItemActionPerformed(evt);
            }
        });
        jMenu1.add(multiplicationItem);

        affineItem.setText("Affine");
        affineItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineItemActionPerformed(evt);
            }
        });
        jMenu1.add(affineItem);

        hillItem.setText("Hill");
        hillItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hillItemActionPerformed(evt);
            }
        });
        jMenu1.add(hillItem);

        vigenereItem.setText("Vigenère");
        vigenereItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereItemActionPerformed(evt);
            }
        });
        jMenu1.add(vigenereItem);

        jMenuBar1.add(jMenu1);

        concidenceIndexAttaque.setText("      Cryptanalyse");

        bruteForceAttack.setText("Attaque exhaustive                            >");
        bruteForceAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bruteForceAttackActionPerformed(evt);
            }
        });
        concidenceIndexAttaque.add(bruteForceAttack);

        frequencyAttack.setText("Attaque par fréquence                      >");
        frequencyAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyAttackActionPerformed(evt);
            }
        });
        concidenceIndexAttaque.add(frequencyAttack);

        conicidenceIndexAttack.setText("Attaque par Indice de coincidence >");
        conicidenceIndexAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conicidenceIndexAttackActionPerformed(evt);
            }
        });
        concidenceIndexAttaque.add(conicidenceIndexAttack);

        jMenuBar1.add(concidenceIndexAttaque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void affineItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineItemActionPerformed
        // TODO add your handling code here:
        AffineVue fen=new AffineVue();
        fen.setVisible(true);
    }//GEN-LAST:event_affineItemActionPerformed

    private void cesarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cesarItemActionPerformed
        // TODO add your handling code here:
        CesarVue fen=new CesarVue();
        fen.setVisible(true);
    }//GEN-LAST:event_cesarItemActionPerformed

    private void vigenereItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereItemActionPerformed
        // TODO add your handling code here:
        VigenereVue fen=new VigenereVue();
        fen.setVisible(true);
        
    }//GEN-LAST:event_vigenereItemActionPerformed

    private void hillItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hillItemActionPerformed
        // TODO add your handling code here:
        HillVue fen=new HillVue();
        fen.setVisible(true);
    }//GEN-LAST:event_hillItemActionPerformed

    private void multiplicationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationItemActionPerformed
        // TODO add your handling code here:
        MultiplicationVue fen=new MultiplicationVue();
       fen.setVisible(true);
    }//GEN-LAST:event_multiplicationItemActionPerformed

    private void conicidenceIndexAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conicidenceIndexAttackActionPerformed
        // TODO add your handling code here:
        VigenereAttackVue fen=new VigenereAttackVue();
        fen.setVisible(true);
    }//GEN-LAST:event_conicidenceIndexAttackActionPerformed

    private void bruteForceAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bruteForceAttackActionPerformed
        // TODO add your handling code here:
        ExhaustiveAttackVue fen=new ExhaustiveAttackVue();
        fen.setVisible(true);
           
    }//GEN-LAST:event_bruteForceAttackActionPerformed

    private void frequencyAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyAttackActionPerformed
        // TODO add your handling code here:
        FrequencyAttackVue fen=new FrequencyAttackVue();
        fen.setVisible(true);
    }//GEN-LAST:event_frequencyAttackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem affineItem;
    private javax.swing.JMenuItem bruteForceAttack;
    private javax.swing.JMenuItem cesarItem;
    private javax.swing.JMenu concidenceIndexAttaque;
    private javax.swing.JMenuItem conicidenceIndexAttack;
    private javax.swing.JMenuItem frequencyAttack;
    private javax.swing.JMenuItem hillItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jtxtArea;
    private javax.swing.JMenuItem multiplicationItem;
    private javax.swing.JMenuItem vigenereItem;
    // End of variables declaration//GEN-END:variables
}