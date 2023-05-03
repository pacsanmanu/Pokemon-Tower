package vista;

import controlador.Control;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import modelo.Pokemon;

public class Defeated extends javax.swing.JFrame {
    private Control controller;
    private Pokemon pokemon;
    
    public Defeated(Control controller, Pokemon pokemon) throws IOException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        this.controller = controller;
        this.pokemon = pokemon;
        String defeat = "Has derrotado a " + pokemon.getName();
        Text1.setText(defeat);
        Pokemon.setIcon(controller.LabelSetImg(pokemon));
        Pokemon.setIcon(controller.ScaleIcon(Pokemon, 200, 200));
        controller.increaseCompletedLevels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Pokemon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Text1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("¿Quieres capturarlo?");
        jPanel1.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, 70));

        Pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caterpie.png"))); // NOI18N
        jPanel1.add(Pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 210, 190));

        jButton1.setText("Si");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 80, -1));

        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 80, -1));

        Text1.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Has derrotado a pikachu");
        jPanel1.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capture-background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean evolve = false;
        int random = (int)(Math.random() * 100);
        if(random < controller.getCaptureProbability()){
            controller.addPokemon(pokemon);
            jOptionPane1.showMessageDialog(null, "Has capturado a " + pokemon.getName());
        }else{
            jOptionPane1.showMessageDialog(null, "No has podido capturar a " + pokemon.getName());
        }
        controller.setCaptureProbability(35);
        for(Pokemon p : controller.getTeam()){
            if(p.getCompletedLevels() >= 2){
                try {
                    Evolution evolution = new Evolution(controller, p);
                    evolve = true;
                    this.setVisible(false);
                    break;
                } catch (IOException ex) {
                    Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(!evolve){
            try {
                FightView fight = new FightView(controller);
                this.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean evolve = false;
        jOptionPane1.showMessageDialog(null, "Has decidido no capturar a " + pokemon.getName());
        controller.increaseCaptureProbability();
        for(Pokemon p : controller.getTeam()){
            if(p.getCompletedLevels() >= 2){
                try {
                    Evolution evolution = new Evolution(controller, p);
                    evolve = true;
                    this.setVisible(false);
                    break;
                } catch (IOException ex) {
                    Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(!evolve){
            try {
                FightView fight = new FightView(controller);
                this.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Defeated.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pokemon;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel Text1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
