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
public class Afis {
   private int idAfis;
   private int idPersonsas;

    public Afis() {
    }

    public Afis(int idAfis, int idPersonsas) {
        this.idAfis = idAfis;
        this.idPersonsas = idPersonsas;
    }

    public int getIdAfis() {
        return idAfis;
    }

    public void setIdAfis(int idAfis) {
        this.idAfis = idAfis;
    }

    public int getIdPersonsas() {
        return idPersonsas;
    }

    public void setIdPersonsas(int idPersonsas) {
        this.idPersonsas = idPersonsas;
    }
   
   
}
