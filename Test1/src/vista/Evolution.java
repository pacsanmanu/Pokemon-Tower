package vista;

import controlador.Control;
import java.io.IOException;
import java.sql.SQLException;
import modelo.Pokemon;

public class Evolution extends javax.swing.JPanel {
    private Pokemon pokemon;
    private Control controller;
    private Pokemon evolution;
    
    public Evolution(Pokemon pokemon, Control controller) throws IOException, SQLException {
        initComponents();
        this.setVisible(true);
        this.pokemon = pokemon;
        this.controller = controller;
        String message = "¡Tu " + pokemon.getName() + " ha evolucionado!";
        Text.setText(message);
        Pokemon.setIcon(controller.LabelSetImg(pokemon));
        String sentencia = "SELECT * FROM POKEMON WHERE NAME = " + pokemon.getEvolution() + ";";
        Pokemon evolution = controller.createPokemon(sentencia);
        Evolution.setIcon(controller.LabelSetImg(evolution));
        Pokemon.setIcon(controller.ScaleIcon(Pokemon, 200, 200));
        Evolution.setIcon(controller.ScaleIcon(Evolution, 200, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Enhorabuena = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        Pokemon = new javax.swing.JLabel();
        Evolution = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Enhorabuena.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Enhorabuena.setForeground(new java.awt.Color(255, 255, 255));
        Enhorabuena.setText("¡Enhorabuena!");
        add(Enhorabuena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 50));

        Text.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Tu charmander ha evolucionado a charmeleon");
        add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 320, -1));

        Pokemon.setText("jLabel1");
        add(Pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        Evolution.setText("jLabel1");
        add(Evolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/evolution-background.png"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.addPokemon(evolution);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Enhorabuena;
    private javax.swing.JLabel Evolution;
    private javax.swing.JLabel Pokemon;
    private javax.swing.JLabel Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
