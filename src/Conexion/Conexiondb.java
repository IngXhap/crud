package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexiondb {
    static String URL = "jdbc:mysql://escuela.cpc8ii0w6226.us-east-1.rds.amazonaws.com/VILLA_DEL_SUR?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    static String USER = "roberto";
    static String PASSWORD = "roberto123456789";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conoexion con la base de datos: " + e.getMessage());
        }
        return connection;
    }

    
}
