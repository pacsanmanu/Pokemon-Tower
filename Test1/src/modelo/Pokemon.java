package modelo;

import java.util.ArrayList;
import controlador.Control;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    public int PokemonAttack(Movement m, Pokemon p){
        int remainingLife = 0;
        int damage = (this.getAttack() + m.getPower()) / 5;
        remainingLife = p.getCurrentLife() - damage;
        return remainingLife;
    }
    
    public void Evolve() throws SQLException{
        Control controller = new Control();
        if(this.getEvolution() != null){
            String sentencia = "SELECT * FROM POKEMON WHERE NAME = '" + this.getEvolution() +"';";
            Pokemon evolution = controller.createPokemon(sentencia);
            this.name = evolution.name;
            this.attack = evolution.attack;
            this.life = evolution.life;
            this.speed = evolution.speed;
            this.image = evolution.image;
            this.movements = evolution.movements;
            this.power = evolution.power;
            this.evolution = evolution.evolution;
            this.completed_levels = 0;
            this.current_life = evolution.current_life;
        }
    }
    
    public static Pokemon createPokemon(String sentencia)throws SQLException{
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
}
    