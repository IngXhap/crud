package Conexion;

import java.sql.Connection;
import java.sql.SQLException;


public class Test {


   public static void main(String[] args) {
        Connection con = Conexiondb.getConnection();
        if (con != null) {
            System.out.println("Exitosa conexion");
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
}
