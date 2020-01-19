/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Martin
 */
public class Ficha {
    private int idFicha;
    private int idDocumento;

    public Ficha() {
    }
    
    
    
    public Ficha(int idFicha, int idDocumento) {
        this.idFicha = idFicha;
        this.idDocumento = idDocumento;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }
  
    
}
