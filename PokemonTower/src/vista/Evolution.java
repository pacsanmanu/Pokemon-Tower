package vista;

import controlador.Control;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import modelo.Pokemon;

public class Evolution extends javax.swing.JFrame {
    private Pokemon pokemon;
    private Control controller;
    
    public Evolution(Control controller, Pokemon pokemon) throws IOException, SQLException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        this.pokemon = pokemon;
        this.controller = controller;
        String message = "¡Tu " + pokemon.getName() + " ha evolucionado!";
        Text.setText(message);
        Pokemon.setIcon(controller.LabelSetImg(pokemon));
        Pokemon.setIcon(controller.ScaleIcon(Pokemon, 150, 150));
        pokemon.Evolve();
        Evolution.setIcon(controller.LabelSetImg(pokemon));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Enhorabuena.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Enhorabuena.setForeground(new java.awt.Color(255, 255, 255));
        Enhorabuena.setText("¡Enhorabuena!");
        jPanel1.add(Enhorabuena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 50));

        Text.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Tu charmander ha evolucionado a charmeleon");
        jPanel1.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 320, -1));

        Pokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bulbasaur.png"))); // NOI18N
        jPanel1.add(Pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, -1));

        Evolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ivysaur.png"))); // NOI18N
        jPanel1.add(Evolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, 180));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/evolution-background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            FightView fight = new FightView(controller);
        } catch (IOException ex) {
            Logger.getLogger(Evolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Evolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
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
