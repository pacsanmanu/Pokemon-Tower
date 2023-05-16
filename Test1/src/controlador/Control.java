package controlador;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Movement;
import modelo.Player;
import modelo.Pokemon;
import utils.Utils;

public class Control {
    private Player player;
    private int powerLevel;
    private String username;
    private int victoryNum;

    public Control(){
        player = new Player();
        powerLevel = 1;
    }
    
    public void addPokemon(Pokemon p){
        player.addPokemon(p);
    }
    
    public int getTeamSize(){
        return this.player.getPokemons().size();
    }
    
    public ArrayList<Pokemon> getTeam(){
        return player.getPokemons();
    }
    
    public Pokemon getPokemon(int index){
        return player.getPokemons().get(index);
    }
    
    public Pokemon createRandomPokemon(int power)throws SQLException{
        int count = 0;
        String sentencia = "select count(*) from pokemon where power = " + power + ";";
        ResultSet resultado = bd.Conexion.EjecutarSentencia(sentencia);
        while(resultado.next()){
            count = resultado.getInt(1);
        }
        resultado.close();
        int random = (int)(Math.random() * count);
        sentencia = "SELECT * FROM pokemon where power = " + power + " LIMIT " + random + ", 1;";
        return createPokemon(sentencia);
    }
    
    public Pokemon createPokemon(String sentencia)throws SQLException{
        ResultSet resultado = bd.Conexion.EjecutarSentencia(sentencia);
        String name = "";
        int attack = 0;
        int life = 0;
        int speed = 0;
        String image = "";
        int power = 0;
        String evolution = "";
        String movement1_name = "";
        String movement2_name = "";
        while(resultado.next()){
            name = resultado.getString("name");
            attack = resultado.getInt("atack");
            life = resultado.getInt("life");
            speed = resultado.getInt("speed");
            image = resultado.getString("image");
            power = resultado.getInt("power");
            evolution = resultado.getString("evolution");
            movement1_name = resultado.getString("movement1");
            movement2_name = resultado.getString("movement2");
        }
        resultado.close();
        ResultSet movimiento1 = bd.Conexion.EjecutarSentencia("Select * from movement where name = '" + movement1_name + "';");
        String name_movimiento1 = "";
        int power_movimiento1 = 0;
        while(movimiento1.next()){
            name_movimiento1 = movimiento1.getString("name");
            power_movimiento1 = movimiento1.getInt("power");
        }
        movimiento1.close();
        Movement m1 = new Movement(name_movimiento1, power_movimiento1);
        
        ResultSet movimiento2 = bd.Conexion.EjecutarSentencia("Select * from movement where name = '" + movement2_name + "';");
        String name_movimiento2 = "";
        int power_movimiento2 = 0;
        while(movimiento2.next()){
            name_movimiento2 = movimiento2.getString("name");
            power_movimiento2 = movimiento2.getInt("power");
        }
        movimiento2.close();
        Movement m2 = new Movement(name_movimiento2, power_movimiento2);
        ArrayList<Movement> movements = new ArrayList<>();
        movements.add(m1);
        movements.add(m2);
        Pokemon initial = new Pokemon(name, attack, life, speed, image, movements, power, evolution);
        return initial;
    }
    
    public ImageIcon LabelSetImg(Pokemon p) throws IOException {
        BufferedImage img;
        img = ImageIO.read(new File("src/" + p.getImage()));
        // Create a ByteArrayOutputStream to write the image bytes to
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write the image bytes to the ByteArrayOutputStream
        ImageIO.write(img, "png", baos);
        // Get the byte array from the ByteArrayOutputStream
        byte[] imageBytes = baos.toByteArray();
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        //Para reescalar una imagen a otras dimensiones:
        return imageIcon;
    }
    
    public ImageIcon FrameSetImg(String imageName) throws IOException{
        BufferedImage img;
        img = ImageIO.read(new File("src/images/" + imageName));
        // Create a ByteArrayOutputStream to write the image bytes to
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write the image bytes to the ByteArrayOutputStream
        ImageIO.write(img, "png", baos);
        // Get the byte array from the ByteArrayOutputStream
        byte[] imageBytes = baos.toByteArray();
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        //Para reescalar una imagen a otras dimensiones:
        return imageIcon;
    }
    
    public ImageIcon ScaleIcon(javax.swing.JLabel label, int width, int height){
        Icon icono = label.getIcon();
        Image imagen = ((ImageIcon) icono).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(imagen);
        return nuevoIcono;
    }
    
    public void healPokemons(){
        for(Pokemon p : getTeam()){
            p.setCurrentLife(p.getLife());
        }
    }
    
    public int getCaptureProbability(){
        return player.getCaptureProbability();
    }
    
    public void increaseCaptureProbability(){
        player.increaseCaptureProbability();
    }
    
    public void setCaptureProbability(int probability){
        player.setCaptureProbability(probability);
    }
    
    public void increaseCompletedLevels(){
        player.increaseCompletedLevels();
    }
    
    public void increasePowerLevel(){
        this.powerLevel++;
    }
    
    public int getPowerLevel(){
        return this.powerLevel;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVictoryNum() {
        return victoryNum;
    }

    public void setVictoryNum(int victoryNum) {
        this.victoryNum = victoryNum;
    }
}

