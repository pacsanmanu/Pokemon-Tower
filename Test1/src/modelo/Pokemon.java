package modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Pokemon {
    private String nombre;
    private int ataque;
    private int vida;
    private int velocidad;
    private String imagen;
    private ArrayList<Ataque> ataques;
    private int poder;
    private String evolucion;
    
    public Pokemon(String nombre, int ataque, int vida, int velocidad, String imagen, ArrayList<Ataque> ataques, int poder, String evolucion){
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.velocidad = velocidad;
        this.imagen = imagen;
        this.ataques = ataques;
        this.poder = poder;
        this.evolucion = evolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }
    
    public int getPoder(){
        return this.poder;
    }
    
    public void setPoder(int poder){
        this.poder = poder;
    }
    
    public String getEvolucion() {
        return evolucion;
    }
    
}
