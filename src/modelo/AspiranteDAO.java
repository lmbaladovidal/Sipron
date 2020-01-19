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
public class AspiranteDAO {
    
    public AspiranteDAO() {
        
    }
    
    public AspiranteVO traerAspirante(String documento,String apellido){
        ArrayList<AspiranteVO> al = new ArrayList<AspiranteVO>();
        AspiranteVO a = new AspiranteVO();
        al.add(a);
        Conexion objCON = new Conexion();
        Connection c = objCON.getConector();
        String sql = "SELECT dni FROM aspirante WHERE dni='"+documento+"' AND apellido='"+apellido+"'";
        try { 
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) {
                al.get(0).setDni(r.getString("dni"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
            System.out.println(e);
        }
        System.out.println(al.get(0).getDni());
        return al.get(0);
    }
    
    public void grabar(AspiranteVO aspirante){
        System.out.println(aspirante.getApellido());
        Conexion objCON = new Conexion();
        Connection c = objCON.getConector();
        String query = "INSERT INTO `aspirante`(`nombre`,"
                                              + "`apellido`, `padre`, `madre`,"
                                              + "`fechaNac`, `localidad`, `provincia`,"
                                              + "`pais`, `dni`, `residencia`,"
                                              + "`profesion`, `nombreConyugue`,"
                                              + "`estadoCivil`, `instruccion`,"
                                              + "`domicilio actual`, `telefono`,"
                                              + "`localidadActual`, `provinciaActual`,"
                                              + "`domicilioLaboral`, `LocalidadLaboral`,"
                                              + "sangre)"
                     + "VALUES ('"+aspirante.getNombre()+"','"+aspirante.getApellido()+"'"
                     + ",'"+aspirante.getNombrePadre()+"','"+aspirante.getNombreSolteraMadre()
                     +"','"+aspirante.getFechaNac()+"','"+aspirante.getLocalidadOrigen()
                     +"','"+aspirante.getProvinciaOrigen()+"','"+aspirante.getPaisOrigen()
                     +"','"+aspirante.getDni()+"','"+aspirante.getLocalidadAct()+"','"+aspirante.getProfesion()
                     +"','"+aspirante.getNombreConyugue()+"',"+1//ARREGLAR ESTO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                     +",'"+aspirante.getInstruccion()+"','"+aspirante.getDomicilioAct()
                     +"','"+aspirante.getTelefono()+"','"+aspirante.getLocalidadAct()+"','"
                     +aspirante.getProvinciaAct()+"','"+aspirante.getDomicilioLab()
                     +"','"+aspirante.getLocalidadLab()+"','"+aspirante.getSangre()+"')";
        System.out.println(query);
         try {
             Statement s = c.createStatement(); 
             s.executeUpdate(query);
             s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}
