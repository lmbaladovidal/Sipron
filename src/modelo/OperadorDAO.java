/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class OperadorDAO {
    public OperadorVO ver(String codigo,String pass) throws SQLException {
        ArrayList<OperadorVO> al = new ArrayList<>();
        Conexion objCON = new Conexion();
        Connection c = objCON.getConector();
        OperadorVO o = new OperadorVO();
        o.setCodigo(0);
        String query = "SELECT codigo FROM operador WHERE codigo ="+codigo+" AND clave ="+pass;
        try {
             Statement s = c.createStatement(); 
             ResultSet r = s.executeQuery(query);
             while(r.next()) {
                o.setCodigo(r.getInt("codigo"));               
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
 {
          
        }
        return o;
    }
}
