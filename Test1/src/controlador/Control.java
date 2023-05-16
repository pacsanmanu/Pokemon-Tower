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
        username = "";
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
        Pokemon poke = Pokemon.createRandomPokemon(power);
        return poke;
    }
    
    public Pokemon createPokemon(String sentencia) throws SQLException{
        Pokemon poke = Pokemon.createPokemon(sentencia);
        return poke;
    }
    
    public ImageIcon LabelSetImg(Pokemon p) throws IOException {
        Utils util = new Utils();
        ImageIcon img = util.LabelSetImg(p);
        return img;
    }
    
    public ImageIcon FrameSetImg(String imageName) throws IOException{
        Utils util = new Utils();
        ImageIcon img = util.FrameSetImg(imageName);
        return img;
    }
    
    public ImageIcon ScaleIcon(javax.swing.JLabel label, int width, int height){
        Utils util = new Utils();
        ImageIcon img = util.ScaleIcon(label, width, height);
        return img;
    }
    
    public void healPokemons(){
        this.player.healPokemons();
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
    
    public void resetPowerLevel(){
        this.powerLevel = 1;
    }
    
    public void clearTeam(){
        player.clearTeam();
    }
}

