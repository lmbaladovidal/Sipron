/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Conexion {
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost/Sipron";
    private String user="root";
    private String pwd="";
    
    private Connection conector = null;

    public Conexion() {
        try {
            Class.forName(driver);
            conector=DriverManager.getConnection(url, user, pwd);
            
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConector() {
        return conector;
    }
}