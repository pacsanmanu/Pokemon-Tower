package modelo;

import java.util.ArrayList;

public class Player {
    private ArrayList<Pokemon> team;
    private int captureProbability;
    
    public Player(){
        team = new ArrayList<Pokemon>();
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
    
    public void increaseCaptureProbability(int probability){
        this.captureProbability = this.captureProbability + probability;
    }
    
    public int getCaptureProbability(){
        return this.captureProbability;
    }
}
