package vista;

import controlador.Control;
import java.io.IOException;
import modelo.Pokemon;

public class Defeated extends javax.swing.JFrame {
    private Control controller;
    private Pokemon pokemon;
    
    public Defeated(Control controller, Pokemon pokemon) throws IOException {
        initComponents();
        this.controller = controller;
        this.pokemon = pokemon;
        String defeat = "Has derrotado a " + pokemon.getName() + "\n\n¿Quieres capturarlo?";
        Text.setText(defeat);
        Pokemon.setIcon(controller.LabelSetImg(pokemon));
        Pokemon.setIcon(controller.ScaleIcon(Pokemon, 200, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Pokemon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Has derrotado a pikachu");
        jPanel1.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));

        Pokemon.setText("jLabel2");
        jPanel1.add(Pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jButton1.setText("Si");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capture-background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int random = (int)(Math.random() * 100);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pokemon;
    private javax.swing.JLabel Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
