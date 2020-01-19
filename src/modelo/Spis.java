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
public class Spis {

    public Spis() {
    }
   private int idSpis;
   private int idPersona;

    public Spis(int idSpis, int idPersona) {
        this.idSpis = idSpis;
        this.idPersona = idPersona;
    }

    public int getIdSpis() {
        return idSpis;
    }

    public void setIdSpis(int idSpis) {
        this.idSpis = idSpis;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
   
   
}
