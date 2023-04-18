package BBDD;
import java.sql.*;

public class Conexion {
    public static void build(){
        Connection conn;
        String urlBD = "jdbc:mysql://localhost:3306/jardineria";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(urlBD, "root", "");
            Statement stmt = conn.createStatement();
            
            String sql = "SELECT * FROM CLIENTE;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println(rs.getInt("codigo_cliente")
                + " " + rs.getString("nombre_cliente")
                );
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
