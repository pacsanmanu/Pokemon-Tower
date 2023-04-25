package vista;

import java.awt.*;
import javax.swing.*;

public class Landing extends javax.swing.JFrame {

    public Landing() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        Door = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(484, 900));
        setPreferredSize(new java.awt.Dimension(484, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 370, 200));
        Icon iconoLogo = Logo.getIcon();
        Image imagenLogo = ((ImageIcon) iconoLogo).getImage().getScaledInstance(300, 192, Image.SCALE_SMOOTH);
        ImageIcon nuevoIconoLogo = new ImageIcon(imagenLogo);
        Logo.setIcon(nuevoIconoLogo);

        Door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door.png"))); // NOI18N
        Door.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoorMouseClicked(evt);
            }
        });
        getContentPane().add(Door, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 180, 210));
        Icon dooricon = Door.getIcon();
        Image doorimage = ((ImageIcon) dooricon).getImage().getScaledInstance(60, 72, Image.SCALE_SMOOTH);
        ImageIcon newdooricon = new ImageIcon(doorimage);
        Door.setIcon(newdooricon);

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.png"))); // NOI18N
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoorMouseClicked
        Initials initials = new Initials();
        initials.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DoorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel Door;
    private javax.swing.JLabel Logo;
    // End of variables declaration//GEN-END:variables
}
