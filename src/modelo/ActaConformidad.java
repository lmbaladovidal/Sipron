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
public class ActaConformidad {
    private int idActa;
    private int idPrio;

    public ActaConformidad() {
    }

    public ActaConformidad(int idActa, int idPrio) {
        this.idActa = idActa;
        this.idPrio = idPrio;
    }

    public int getIdActa() {
        return idActa;
    }

    public void setIdActa(int idActa) {
        this.idActa = idActa;
    }

    public int getIdPrio() {
        return idPrio;
    }

    public void setIdPrio(int idPrio) {
        this.idPrio = idPrio;
    }
    
    
}
