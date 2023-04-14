package Main;

import java.awt.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pikachu = new javax.swing.JLabel();
        UserPic = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Door = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokemon/Power1/pikachu.gif"))); // NOI18N
        getContentPane().add(Pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 80, -1));

        UserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Essentials/user.png"))); // NOI18N
        getContentPane().add(UserPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 283, 450));
        Icon icono = UserPic.getIcon();
        Image imagen = ((ImageIcon) icono).getImage().getScaledInstance(120, 200, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(imagen);
        UserPic.setIcon(nuevoIcono);

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Essentials/banner.png"))); // NOI18N
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 270, 500));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Essentials/logo.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 370, 200));
        Icon iconoLogo = Logo.getIcon();
        Image imagenLogo = ((ImageIcon) iconoLogo).getImage().getScaledInstance(250, 160, Image.SCALE_SMOOTH);
        ImageIcon nuevoIconoLogo = new ImageIcon(imagenLogo);
        Logo.setIcon(nuevoIconoLogo);

        Door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Essentials/door.png"))); // NOI18N
        Door.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoorMouseClicked(evt);
            }
        });
        getContentPane().add(Door, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 180, 210));
        Icon dooricon = Door.getIcon();
        Image doorimage = ((ImageIcon) dooricon).getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        ImageIcon newdooricon = new ImageIcon(doorimage);
        Door.setIcon(newdooricon);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoorMouseClicked
        Initials initials = new Initials();
        initials.setVisible(true);
        dispose();
    }//GEN-LAST:event_DoorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel Door;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Pikachu;
    private javax.swing.JLabel UserPic;
    // End of variables declaration//GEN-END:variables
}
