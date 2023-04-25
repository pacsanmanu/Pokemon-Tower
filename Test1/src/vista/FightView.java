package vista;
import controlador.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import modelo.*;
import javax.swing.*;

public class FightView extends javax.swing.JFrame {
    /**
     * Creates new form Combat
     */
    public FightView(Control control) throws IOException, SQLException {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Control controller = control;
        Pokemon myPokemon = controller.getPokemon(0);
        MyPokemon.setIcon(controller.LabelSetImg(myPokemon));
        MyPokemon.setIcon(controller.ScaleIcon(MyPokemon, 200, 200));
        MyPokemonHP.setText("HP: " + myPokemon.getCurrentLife() + " / " + myPokemon.getLife());
        Pokemon enemy = controller.createRandomPokemon(0);
        Enemy.setIcon(controller.LabelSetImg(enemy));
        Enemy.setIcon(controller.ScaleIcon(Enemy, 200, 200));
        EnemyHP.setText("HP: " + enemy.getCurrentLife() + " / " + enemy.getLife());
        Attack1.setText(myPokemon.getMovements().get(0).getName());
        Attack2.setText(myPokemon.getMovements().get(1).getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Enemy = new javax.swing.JLabel();
        MyPokemon = new javax.swing.JLabel();
        MyPokemonHP = new javax.swing.JLabel();
        EnemyHP = new javax.swing.JLabel();
        Attack1 = new javax.swing.JButton();
        Attack2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        MyPokemon.setBackground(new java.awt.Color(51, 153, 255));
        MyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander.png"))); // NOI18N

        MyPokemonHP.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        MyPokemonHP.setText("PS: ");

        EnemyHP.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        EnemyHP.setText("PS: ");

        Attack1.setText("jButton1");
        Attack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack1ActionPerformed(evt);
            }
        });

        Attack2.setText("jButton1");
        Attack2.setActionCommand("");
        Attack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MyPokemonHP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Enemy, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EnemyHP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Attack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Attack2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(EnemyHP)
                .addGap(29, 29, 29)
                .addComponent(Enemy, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(MyPokemonHP)
                .addGap(42, 42, 42)
                .addComponent(MyPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(Attack1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Attack2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Attack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack1ActionPerformed
       
    }//GEN-LAST:event_Attack1ActionPerformed

    private void Attack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack2ActionPerformed
        
    }//GEN-LAST:event_Attack2ActionPerformed

    public void UpdateView(Pokemon myPokemon, Pokemon enemy){
        MyPokemonHP.setText("HP: " + myPokemon.getCurrentLife() + " / " + myPokemon.getLife());
        EnemyHP.setText("HP: " + enemy.getCurrentLife() + " / " + enemy.getLife());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attack1;
    private javax.swing.JButton Attack2;
    private javax.swing.JLabel Enemy;
    private javax.swing.JLabel EnemyHP;
    private javax.swing.JLabel MyPokemon;
    private javax.swing.JLabel MyPokemonHP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
