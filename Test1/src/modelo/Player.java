package modelo;

import java.util.ArrayList;

public class Player {
    ArrayList<Pokemon> team;
    
    public Player(){
        team = new ArrayList<Pokemon>();
    }
    
    public void addPokemon(Pokemon p){
        team.add(p);
    }
    
    public ArrayList<Pokemon> getPokemons(){
        return this.team;
    }
}
