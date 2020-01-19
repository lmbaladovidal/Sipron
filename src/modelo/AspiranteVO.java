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
public class AspiranteVO {

    public AspiranteVO() {
    }
    private int idAspirante;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String nacionalidad;
    private String paisOrigen;
    private String localidadOrigen;
    private String provinciaOrigen;
    private boolean sexo;
    private String estadoCivil;
    private String nombreConyugue;
    private String nombreSolteraMadre;
    private String nombrePadre;
    private String dni;
    private String expedidoPor;
    private String profesion;
    private String instruccion;
    private String domicilioAct;
    private String telefono;
    private String localidadAct;
    private String provinciaAct;
    private String domicilioLab;
    private String localidadLab;
    private String sangre;

    public AspiranteVO(int idAspirante, String nombre, String apellido, String fechaNac, String nacionalidad, String paisOrigen, String localidadOrigen, String provinciaOrigen, boolean sexo, String estadoCivil, String nombreConyugue, String nombreSolteraMadre, String nombrePadre, String dni, String expedidoPor, String profesion, String instruccion, String domicilioAct, String telefono, String localidadAct, String provinviaAct, String domicilioLab, String localidadLab, String sangre) {
        this.idAspirante = idAspirante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.paisOrigen = paisOrigen;
        this.localidadOrigen = localidadOrigen;
        this.provinciaOrigen = provinciaOrigen;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.nombreConyugue = nombreConyugue;
        this.nombreSolteraMadre = nombreSolteraMadre;
        this.nombrePadre = nombrePadre;
        this.dni = dni;
        this.expedidoPor = expedidoPor;
        this.profesion = profesion;
        this.instruccion = instruccion;
        this.domicilioAct = domicilioAct;
        this.telefono = telefono;
        this.localidadAct = localidadAct;
        this.provinciaAct = provinviaAct;
        this.domicilioLab = domicilioLab;
        this.localidadLab = localidadLab;
        this.sangre = sangre;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }
 
 
    public boolean isSexo() {
        return sexo;
    }
    
   public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    public int getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(int idAspirante) {
        this.idAspirante = idAspirante;
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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getLocalidadOrigen() {
        return localidadOrigen;
    }

    public void setLocalidadOrigen(String localidadOrigen) {
        this.localidadOrigen = localidadOrigen;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombreConyugue() {
        return nombreConyugue;
    }

    public void setNombreConyugue(String nombreConyugue) {
        this.nombreConyugue = nombreConyugue;
    }

    public String getNombreSolteraMadre() {
        return nombreSolteraMadre;
    }

    public void setNombreSolteraMadre(String nombreSolteraMadre) {
        this.nombreSolteraMadre = nombreSolteraMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getExpedidoPor() {
        return expedidoPor;
    }

    public void setExpedidoPor(String expedidoPor) {
        this.expedidoPor = expedidoPor;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public String getDomicilioAct() {
        return domicilioAct;
    }

    public void setDomicilioAct(String domicilioAct) {
        this.domicilioAct = domicilioAct;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLocalidadAct() {
        return localidadAct;
    }

    public void setLocalidadAct(String localidadAct) {
        this.localidadAct = localidadAct;
    }

    public String getProvinciaAct() {
        return provinciaAct;
    }

    public void setProvinciaAct(String provinciaAct) {
        this.provinciaAct = provinciaAct;
    }

    public String getDomicilioLab() {
        return domicilioLab;
    }

    public void setDomicilioLab(String domicilioLab) {
        this.domicilioLab = domicilioLab;
    }

    public String getLocalidadLab() {
        return localidadLab;
    }

    public void setLocalidadLab(String localidadLab) {
        this.localidadLab = localidadLab;
    }
}
