package main;

import java.sql.*;
import vista.Landing;

public class Main {

    public static void main(String[] args) throws SQLException {
        Landing landing1 = new Landing();
        bd.Conexion.Conectar();
        
        // Como recorrer los resultados de una consulta
        
        /*ResultSet resultado = bd.Conexion.EjecutarSentencia("Select * from cliente;");
        while(resultado.next()){
            int id = resultado.getInt("codigo_cliente");
            String nombre = resultado.getString("nombre_cliente");
            System.out.println(id + "| " + nombre);
        }*/
    }
   
}