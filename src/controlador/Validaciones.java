/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.AspiranteDAO;

/**
 *
 * @author Martin
 */
public class Validaciones {

    public Validaciones() {
        
    }
    
    public boolean validarFicha(String documento,String apellido){
        boolean f = false;
        AspiranteDAO aspirante = new AspiranteDAO();
        System.out.println("Docuemnto: "+documento);
        if (aspirante.traerAspirante(documento,apellido).getDni() != null){
            f=true;
        }
        return f;
    }
    
}
