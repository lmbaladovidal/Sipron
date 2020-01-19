/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
    import modelo.*;
    import vista.*;
/**
 *
 * @author Martin
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        OperadorDAO m = new OperadorDAO();
        Loggin v = new Loggin();
        LogginLogica c = new LogginLogica(m,v);
        v.setVisible(true);
        
    }
}
