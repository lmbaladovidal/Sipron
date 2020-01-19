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
public class Tradan {
    private int idTradan;
    private int idPrio;

    public Tradan() {
    }

    public Tradan(int idTradan, int idPrio) {
        this.idTradan = idTradan;
        this.idPrio = idPrio;
    }

    public int getIdTradan() {
        return idTradan;
    }

    public void setIdTradan(int idTradan) {
        this.idTradan = idTradan;
    }

    public int getIdPrio() {
        return idPrio;
    }

    public void setIdPrio(int idPrio) {
        this.idPrio = idPrio;
    }
    
}
