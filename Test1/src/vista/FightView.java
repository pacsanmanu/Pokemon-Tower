package vista;
import controlador.*;
import java.io.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import modelo.*;
import javax.swing.*;
import javax.sound.sampled.Clip;

public class FightView extends javax.swing.JFrame {
    private Pokemon myPokemon;
    private Pokemon enemy;
    private int deadPokemons;
    private Control controller;
    private Clip clip;
    
    public FightView(Control control) throws IOException, SQLException {
        controller = control;
        initComponents();
        this.myPokemon = null;
        this.enemy = null;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        // Music
        try {
            File musicFile = new File("src/audio/fight.wav");
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(musicFile));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // End of music
        controller.healPokemons();
        myPokemon = controller.getPokemon(0);
        MyPokemon.setIcon(controller.LabelSetImg(myPokemon));
        MyPokemon.setIcon(controller.ScaleIcon(MyPokemon, 200, 200));
        MyPokemonHP.setText("<html>" + myPokemon.getName().toUpperCase() + "   " + "<font color='#83FF00'>"+ myPokemon.getCurrentLife() + " / " + myPokemon.getLife() +"</font></html>");
        enemy = controller.createRandomPokemon(control.getPowerLevel());
        Enemy.setIcon(controller.LabelSetImg(enemy));
        Enemy.setIcon(controller.ScaleIcon(Enemy, 200, 200));
        EnemyHP.setText("<html>" + enemy.getName().toUpperCase() + "   " + "<font color='#83FF00'>"+ enemy.getCurrentLife() + " / " + enemy.getLife() +"</font></html>");
        Attack1.setText(myPokemon.getMovements().get(0).getName());
        Attack2.setText(myPokemon.getMovements().get(1).getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        Enemy = new javax.swing.JLabel();
        MyPokemon = new javax.swing.JLabel();
        MyPokemonHP = new javax.swing.JLabel();
        EnemyHP = new javax.swing.JLabel();
        Attack1 = new javax.swing.JButton();
        Attack2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jOptionPane1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jOptionPane1.setMaximumSize(new java.awt.Dimension(600, 120));
        jOptionPane1.setMinimumSize(new java.awt.Dimension(600, 120));
        jOptionPane1.setPreferredSize(new java.awt.Dimension(600, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, 190));

        MyPokemon.setBackground(new java.awt.Color(51, 153, 255));
        MyPokemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander.png"))); // NOI18N
        jPanel1.add(MyPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 180));

        MyPokemonHP.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        MyPokemonHP.setForeground(new java.awt.Color(255, 255, 255));
        MyPokemonHP.setText("PS: ");
        jPanel1.add(MyPokemonHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, -1));

        EnemyHP.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        EnemyHP.setForeground(new java.awt.Color(255, 255, 255));
        EnemyHP.setText("PS: ");
        jPanel1.add(EnemyHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, -1));

        Attack1.setText("jButton1");
        Attack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack1ActionPerformed(evt);
            }
        });
        jPanel1.add(Attack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 355, 136, 33));

        Attack2.setText("jButton1");
        Attack2.setActionCommand("");
        Attack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack2ActionPerformed(evt);
            }
        });
        jPanel1.add(Attack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 419, 136, 33));

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 542, 379, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battle-background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Attack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack1ActionPerformed
        String act1 = "";
        String act2 = "";
        if(myPokemon.getSpeed() >= enemy.getSpeed()){
            if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                enemy.setCurrentLife(myPokemon.PokemonAttack(myPokemon.getMovements().get(0), enemy));
                if(enemy.getCurrentLife() <= 0){
                        enemy.setCurrentLife(0);
                    }
                try {
                    UpdateView();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                act1 = "Tu " + myPokemon.getName() + " ha usado " + myPokemon.getMovements().get(0).getName();
                if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                    int random = (int)(Math.random() * 2);
                    myPokemon.setCurrentLife(enemy.PokemonAttack(enemy.getMovements().get(random), myPokemon));
                    if(myPokemon.getCurrentLife() <= 0){
                        myPokemon.setCurrentLife(0);
                    }
                    try {
                        UpdateView();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    act2 = "El " + enemy.getName() + " enemigo ha usado " + enemy.getMovements().get(random).getName();
                }
            }
            Text.setText(act1 + "\n" + act2);
        }else{
            if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                int random = (int)(Math.random() * 2);
                myPokemon.setCurrentLife(enemy.PokemonAttack(enemy.getMovements().get(random), myPokemon));
                if(myPokemon.getCurrentLife() <= 0){
                        myPokemon.setCurrentLife(0);
                    }
                try {
                    UpdateView();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                act1 = "El " + enemy.getName() + " enemigo ha usado " + enemy.getMovements().get(random).getName();
                if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                    enemy.setCurrentLife(myPokemon.PokemonAttack(myPokemon.getMovements().get(0), enemy));
                    if(enemy.getCurrentLife() <= 0){
                        enemy.setCurrentLife(0);
                    }
                    try {
                        UpdateView();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    act2 = "Tu " + myPokemon.getName() + " ha usado " + myPokemon.getMovements().get(0).getName();
                }
            }
            Text.setText(act1 + "\n" + act2);
        }
        
        if(myPokemon.getCurrentLife() == 0){
            // TO DO lógica cuando mi pokemon muera
            String dead = "Tu " + myPokemon.getName() + " ha sido debilitado.";
            String nextPokemon = "";
            deadPokemons++;
            if(controller.getTeamSize() > deadPokemons){
                myPokemon = controller.getPokemon(deadPokemons);
                nextPokemon = "Has sacado a " + myPokemon.getName();
            }
            Text.setText(dead + "\n" + nextPokemon);
            try {
                UpdateView();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            if(controller.getTeamSize() == deadPokemons){
                try {
                    End end = new End();
                } catch (IOException ex) {
                    Logger.getLogger(FightView.class.getName()).log(Level.SEVERE, null, ex);
                }
                clip.stop();
                this.dispose();
            }
        }else if(enemy.getCurrentLife() == 0){
            if(controller.getPowerLevel() == 11){
                try {
                    Victory victory = new Victory(controller);
                } catch (IOException ex) {
                    Logger.getLogger(FightView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                Defeated capture = new Defeated(controller, enemy);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                controller.increasePowerLevel();
            }
            clip.stop();
            this.dispose();
        }
    }//GEN-LAST:event_Attack1ActionPerformed

    private void Attack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack2ActionPerformed
        String act1 = "";
        String act2 = "";
        if(myPokemon.getSpeed() >= enemy.getSpeed()){
            if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                enemy.setCurrentLife(myPokemon.PokemonAttack(myPokemon.getMovements().get(1), enemy));
                if(enemy.getCurrentLife() <= 0){
                    enemy.setCurrentLife(0);
                }
                try {
                    UpdateView();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                act1 = "Tu " + myPokemon.getName() + " ha usado " + myPokemon.getMovements().get(1).getName();
                if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                    int random = (int)(Math.random() * 2);
                    myPokemon.setCurrentLife(enemy.PokemonAttack(enemy.getMovements().get(random), myPokemon));
                    if(myPokemon.getCurrentLife() <= 0){
                        myPokemon.setCurrentLife(0);
                    }
                    try {
                        UpdateView();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    act2 = "El " + enemy.getName() + " enemigo ha usado " + enemy.getMovements().get(random).getName();
                }
            }
            Text.setText(act1 + "\n" + act2);
        }else{
            if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                int random = (int)(Math.random() * 2);
                myPokemon.setCurrentLife(enemy.PokemonAttack(enemy.getMovements().get(random), myPokemon));
                if(myPokemon.getCurrentLife() <= 0){
                    myPokemon.setCurrentLife(0);
                }
                try {
                    UpdateView();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                act1 = "El " + enemy.getName() + " enemigo ha usado " + enemy.getMovements().get(random).getName();
                if(myPokemon.getCurrentLife() > 0 && enemy.getCurrentLife() > 0){
                    enemy.setCurrentLife(myPokemon.PokemonAttack(myPokemon.getMovements().get(1), enemy));
                    if(enemy.getCurrentLife() <= 0){
                        enemy.setCurrentLife(0);
                    }
                    try {
                        UpdateView();
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    act2 = "Tu " + myPokemon.getName() + " ha usado " + myPokemon.getMovements().get(1).getName();
                }
            }
            Text.setText(act1 + "\n" + act2);
        }
        if(myPokemon.getCurrentLife() == 0){
            // TO DO lógica cuando mi pokemon muera
            String dead = "Tu " + myPokemon.getName() + " ha sido debilitado.";
            String nextPokemon = "";
            deadPokemons++;
            if(controller.getTeamSize() > deadPokemons){
                myPokemon = controller.getPokemon(deadPokemons);
                nextPokemon = "Has sacado a " + myPokemon.getName();
            }
            Text.setText(dead + "\n" + nextPokemon);
            try {
                UpdateView();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            if(controller.getTeamSize() == deadPokemons){
                try {
                    End end = new End();
                } catch (IOException ex) {
                    Logger.getLogger(FightView.class.getName()).log(Level.SEVERE, null, ex);
                }
                clip.stop();
                this.dispose();
            }
        }else if(enemy.getCurrentLife() == 0){
            if(controller.getPowerLevel() == 11){
                try {
                    Victory victory = new Victory(controller);
                } catch (IOException ex) {
                    Logger.getLogger(FightView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                Defeated capture = new Defeated(controller, enemy);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(FightView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                controller.increasePowerLevel();
            }
            clip.stop();
            this.dispose();
        }
    }//GEN-LAST:event_Attack2ActionPerformed

    public void UpdateView() throws IOException{
        MyPokemon.setIcon(controller.LabelSetImg(myPokemon));
        MyPokemon.setIcon(controller.ScaleIcon(MyPokemon, 200, 200));
        if(myPokemon.getCurrentLife() < myPokemon.getLife() / 3){
            MyPokemonHP.setText("<html>" + myPokemon.getName().toUpperCase() + "   " + "<font color='#FF1C1C'>"+ myPokemon.getCurrentLife() + " / " + myPokemon.getLife() +"</font></html>");   
        }else if(myPokemon.getCurrentLife() < myPokemon.getLife() / 2){
            MyPokemonHP.setText("<html>" + myPokemon.getName().toUpperCase() + "   " + "<font color='#FFFF1C'>"+ myPokemon.getCurrentLife() + " / " + myPokemon.getLife() +"</font></html>");
        }else{
            MyPokemonHP.setText("<html>" + myPokemon.getName().toUpperCase() + "   " + "<font color='#80FF00'>"+ myPokemon.getCurrentLife() + " / " + myPokemon.getLife() +"</font></html>");
        }
        if(enemy.getCurrentLife() < enemy.getLife() / 3){
            EnemyHP.setText("<html>" + enemy.getName().toUpperCase() + "   " + "<font color='#FF1C1C'>"+ enemy.getCurrentLife() + " / " + enemy.getLife() +"</font></html>");
        }else if(enemy.getCurrentLife() < enemy.getLife() / 2){
            EnemyHP.setText("<html>" + enemy.getName().toUpperCase() + "   " + "<font color='#FFFF1C'>"+ enemy.getCurrentLife() + " / " + enemy.getLife() +"</font></html>");
        }else{
            EnemyHP.setText("<html>" + enemy.getName().toUpperCase() + "   " + "<font color='#80FF00'>"+ enemy.getCurrentLife() + " / " + enemy.getLife() +"</font></html>");
        }
        Attack1.setText(myPokemon.getMovements().get(0).getName());
        Attack2.setText(myPokemon.getMovements().get(1).getName());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attack1;
    private javax.swing.JButton Attack2;
    private javax.swing.JLabel Enemy;
    private javax.swing.JLabel EnemyHP;
    private javax.swing.JLabel MyPokemon;
    private javax.swing.JLabel MyPokemonHP;
    private javax.swing.JTextArea Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
