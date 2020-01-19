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
public class OperadorVO {

    public OperadorVO() {
    }
    
    private int idOperador;
    private int idGrado;
    private int idCategoria;
    private String nombre;
    private String apellido;
    private int codigo;
    private String clave;

    public OperadorVO(int idOperador, int idGrado, int idCategoria, String nombre, String apellido,int codigo, String clave) {
        this.idOperador = idOperador;
        this.idGrado = idGrado;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.clave = clave;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
