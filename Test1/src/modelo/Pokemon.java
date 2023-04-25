package modelo;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int attack;
    private int life;
    private int speed;
    private String image;
    private ArrayList<Movement> movements;
    private int power;
    private String evolution;
    private int completed_levels;
    private int current_life;
    
    public Pokemon(String name, int attack, int life, int speed, String image, ArrayList<Movement> movements, int power, String evolution){
        this.name = name;
        this.attack = attack;
        this.life = life;
        this.speed = speed;
        this.image = image;
        this.movements = movements;
        this.power = power;
        this.evolution = evolution;
        this.completed_levels = 0;
        this.current_life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<Movement> getMovements() {
        return movements;
    }

    public void setMovements(ArrayList<Movement> movements) {
        this.movements = movements;
    }
    
    public int getPower(){
        return this.power;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public String getEvolution() {
        return evolution;
    }
    
    public void setCompletedLevels(int completedLevels){
        this.completed_levels = completedLevels;
    }
    
    public int getCompletedLevels(){
        return completed_levels;
    }
    
    public int getCurrentLife(){
        return current_life;
    }
    
    public void setCurrentLife(int current_life){
        this.current_life = current_life;
    }
    
    public void addMovement(Movement m){
        this.movements.add(m);
    }
    
    public void Attack(Pokemon p){
        
    }
}
    