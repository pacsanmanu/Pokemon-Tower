package vista;

import controlador.Control;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Victory extends javax.swing.JFrame {
    Control controller;

    public Victory(Control controller) throws IOException {
        this.controller = controller;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        poke1.setIcon(controller.LabelSetImg(controller.getPokemon(0)));
        poke2.setIcon(controller.LabelSetImg(controller.getPokemon(1)));
        if(controller.getTeam().size() > 2){
            poke3.setIcon(controller.LabelSetImg(controller.getPokemon(2)));
        }
        if(controller.getTeam().size() > 3){
            poke4.setIcon(controller.LabelSetImg(controller.getPokemon(3)));
        }
        if(controller.getTeam().size() > 4){
            poke5.setIcon(controller.LabelSetImg(controller.getPokemon(4)));
        }
        if(controller.getTeam().size() > 5){
            poke6.setIcon(controller.LabelSetImg(controller.getPokemon(5)));
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        poke3 = new javax.swing.JLabel();
        poke1 = new javax.swing.JLabel();
        poke2 = new javax.swing.JLabel();
        poke6 = new javax.swing.JLabel();
        poke4 = new javax.swing.JLabel();
        poke5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¿Quieres volver a jugar?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¡Enhorabuena!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));
        jPanel1.add(poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 110));
        jPanel1.add(poke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 110));
        jPanel1.add(poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 120, 110));
        jPanel1.add(poke6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 110));
        jPanel1.add(poke4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, 110));
        jPanel1.add(poke5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 120, 110));

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("¡Has derrotado a todos los Pokemon!");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jButton1.setText("No");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

        jButton2.setText("Si");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/victory-background.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Landing landing = new Landing();
        } catch (IOException ex) {
            Logger.getLogger(Victory.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel poke1;
    private javax.swing.JLabel poke2;
    private javax.swing.JLabel poke3;
    private javax.swing.JLabel poke4;
    private javax.swing.JLabel poke5;
    private javax.swing.JLabel poke6;
    // End of variables declaration//GEN-END:variables
}
