package vista;

import java.awt.*;
import javax.swing.*;
import controlador.Control;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.ImportView;

public class Landing extends javax.swing.JFrame {
    Control controller;

    public Landing() throws IOException {
        controller = new Control();
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
    }
    
    public Landing(Control control) throws IOException {
        controller = control;
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionPane = new javax.swing.JOptionPane();
        addpokemon = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Door = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(484, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addpokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addpokemons.png"))); // NOI18N
        addpokemon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpokemonMouseClicked(evt);
            }
        });
        getContentPane().add(addpokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, -1, -1));

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
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoorMouseClicked
        try {
            this.dispose();
            Initials initials = new Initials(controller);
        } catch (IOException ex) {
            Logger.getLogger(Landing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Landing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DoorMouseClicked

    private void addpokemonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpokemonMouseClicked
        ImportView importPokes = new ImportView();
        this.dispose();
    }//GEN-LAST:event_addpokemonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel Door;
    private javax.swing.JLabel Logo;
    private javax.swing.JOptionPane OptionPane;
    private javax.swing.JLabel addpokemon;
    // End of variables declaration//GEN-END:variables
}
