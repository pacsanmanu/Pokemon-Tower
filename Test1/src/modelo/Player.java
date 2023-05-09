package modelo;

import java.util.ArrayList;
import java.util.HashSet;

public class Player {
    private String username;
    private ArrayList<Pokemon> team;
    private int captureProbability;
    
    public Player(){
        team = new ArrayList<Pokemon>();
        captureProbability = 40;
    }
    
    public void addPokemon(Pokemon p){
        team.add(p);
    }
    
    public ArrayList<Pokemon> getPokemons(){
        return this.team;
    }
    
    public void setCaptureProbability(int probability){
        this.captureProbability = probability;
    }
    
    public void increaseCaptureProbability(){
        int probability = 10;
        this.captureProbability = this.captureProbability + probability;
    }
    
    public int getCaptureProbability(){
        return this.captureProbability;
    }
    
    public void increaseCompletedLevels(){
        for(Pokemon p : team){
            if(p.getEvolution() != null){
                p.setCompletedLevels(p.getCompletedLevels() + 1);
            }
        }
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
