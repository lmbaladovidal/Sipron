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
public class Fotografia {

    public Fotografia() {
    }
    private int idFotografia;
    private int idDocumento;
    private int tipo;
    private String path;

    public Fotografia(int idFotografia, int idDocumento, int tipo, String path) {
        this.idFotografia = idFotografia;
        this.idDocumento = idDocumento;
        this.tipo = tipo;
        this.path = path;
    }

    public int getIdFotografia() {
        return idFotografia;
    }

    public void setIdFotografia(int idFotografia) {
        this.idFotografia = idFotografia;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
}
