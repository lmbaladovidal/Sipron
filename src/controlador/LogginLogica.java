/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.OperadorDAO;
import modelo.OperadorVO;
import vista.Loggin;
import vista.Menu;

/**
 *
 * @author Martin
 */
public class LogginLogica implements ActionListener{
    private OperadorDAO m;
    private Loggin v;

    public LogginLogica(OperadorDAO m, Loggin v) {
        this.m = m;
        this.v = v;
        this.v.btnIngresar.addActionListener(this);
    }
    
   @Override
   public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()) {
            case "INGRESAR":
                if (validar()){
                    Menu menu = new Menu();
                    MenuLogica menuLogica = new MenuLogica(menu);
                    this.v.setVisible(false);
                    menu.setVisible(true);
                }
                else{System.out.println("no vale");};
                break;
        }
   }
   
   public boolean validar(){
       boolean f = false;
       OperadorVO operador = new OperadorVO();
       String code = v.codigo.getText();
       //Este script es para recuperar el pass del passwordText ;)
       String pass = "";
       char [] password = v.pass.getPassword();
       for (int i=0; i<password.length; i++){
           pass+=password[i];
       }
        try {
            operador = m.ver(code, pass);//Aca se valida el operador
        } catch (SQLException ex) {
            Logger.getLogger(LogginLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
       if (operador.getCodigo()!= 0){
            f=true;
        }
       return f;
   }

    
}
