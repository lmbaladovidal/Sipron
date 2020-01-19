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
public class Huella {
    private int idHuella;
    private int idFicha;
    private String path;

    public Huella() {
    }

    public Huella(int idHuella, int idFicha, String path) {
        this.idHuella = idHuella;
        this.idFicha = idFicha;
        this.path = path;
        
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getIdHuella() {
        return idHuella;
    }

    public void setIdHuella(int idHuella) {
        this.idHuella = idHuella;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }
    
    
}
