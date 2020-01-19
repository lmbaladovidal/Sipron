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
public class Prontuario {

    public Prontuario() {
    }
    
    private int idProntuario;
    private int idPersona;
    private int idOperador;
    private int nroProntuario;
    private String fecha;
    private int estado;

    public Prontuario(int idProntuario, int idPersona, int idOperador, int nroProntuario, String fecha, int estado) {
        this.idProntuario = idProntuario;
        this.idPersona = idPersona;
        this.idOperador = idOperador;
        this.nroProntuario = nroProntuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public int getNroProntuario() {
        return nroProntuario;
    }

    public void setNroProntuario(int nroProntuario) {
        this.nroProntuario = nroProntuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
