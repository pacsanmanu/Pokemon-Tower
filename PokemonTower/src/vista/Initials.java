package vista;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pokemon;
import controlador.Control;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Initials extends javax.swing.JFrame{
    Control controller;
    private Clip clip;
    
    public Initials(Control controller) throws IOException, SQLException {
        this.controller = controller;
        initComponents();
        this.setVisible(true);
        this.setTitle("Pokemon Tower");
        this.setLocationRelativeTo(null);
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        try {
            File musicFile = new File("src/audio/music.wav");
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(musicFile));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        if(controller.getUsername().equals("")){
            String userName;
            do {
                userName = JOptionPane.showInputDialog("Ingrese su nombre:");
            } while (userName == null || userName.trim().isEmpty());
            String sentencia = "INSERT INTO user (username) VALUES ('" + userName + "');";
            ResultSet resultSet = bd.Conexion.EjecutarSentencia("SELECT COUNT(*) FROM USER WHERE USERNAME = '"+ userName +"';");
            try {
                resultSet.next();
            } catch (SQLException ex) {
                Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
            }
            int count = 0;
            try {
                count = resultSet.getInt(1);
            } catch (SQLException ex) {
                Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(count < 1){
                if(!userName.equals("")){

                }
                bd.Conexion.EjecutarUpdate(sentencia);
                jOptionPane1.showMessageDialog(null, "Bienvenido " + userName);
            }else{
                jOptionPane1.showMessageDialog(null, "Bienvenido de nuevo " + userName);
            }
            
            controller.setUsername(userName);
        }
        ResultSet resultado = bd.Conexion.EjecutarSentencia("SELECT VICTORYNUM FROM USER WHERE USERNAME = '" + controller.getUsername() + "';");
        resultado.next();
        int victories = resultado.getInt("victoryNum");
        controller.setVictoryNum(victories);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        QueInicial = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(480, 730));
        setPreferredSize(new java.awt.Dimension(480, 730));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 730));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QueInicial.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        QueInicial.setForeground(new java.awt.Color(255, 255, 255));
        QueInicial.setText("¿Qué Pokemon inicial quieres escoger?");
        jPanel1.add(QueInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 55, -1, 44));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 111, 420, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 311, 420, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 514, 420, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 715, 420, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 125, 76));
        Icon icono3 = jLabel2.getIcon();
        Image imagen3 = ((ImageIcon) icono3).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono3 = new ImageIcon(imagen3);
        jLabel2.setIcon(nuevoIcono3);

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Charmander");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/squirtle.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 128, 79));
        Icon icono2 = jLabel3.getIcon();
        Image imagen2 = ((ImageIcon) icono2).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono2 = new ImageIcon(imagen2);
        jLabel3.setIcon(nuevoIcono2);

        jLabel4.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Squirtle");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bulbasaur.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 114, -1));
        Icon icono = jLabel5.getIcon();
        Image imagen = ((ImageIcon) icono).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(imagen);
        jLabel5.setIcon(nuevoIcono);

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bulbasaur");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/initials-background.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 477, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String sentencia = "SELECT * FROM POKEMON WHERE NAME = 'bulbasaur';";
        Pokemon bulbasaur = null;
        try {
            bulbasaur = controller.createPokemon(sentencia);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.addPokemon(bulbasaur);
        try {
            FightView level1 = new FightView(controller);
        } catch (IOException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String sentencia = "SELECT * FROM POKEMON WHERE NAME = 'squirtle';";
        Pokemon squirtle = null;
        try {
            squirtle = controller.createPokemon(sentencia);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.addPokemon(squirtle);
        try {
            FightView level1 = new FightView(controller);
        } catch (IOException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String sentencia = "SELECT * FROM POKEMON WHERE NAME = 'charmander';";
        Pokemon charmander = null;
        try {
            charmander = controller.createPokemon(sentencia);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.addPokemon(charmander);
        try {
            FightView level1 = new FightView(controller);
        } catch (IOException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Initials.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
