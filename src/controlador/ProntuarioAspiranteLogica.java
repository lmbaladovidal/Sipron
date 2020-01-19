/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.AspiranteDAO;
import modelo.AspiranteVO;
import vista.ProntuarioAspirante;
/**
 *
 * @author Martin
 */
public class ProntuarioAspiranteLogica implements ActionListener{
    ProntuarioAspirante v;
    AspiranteDAO m;
    public ProntuarioAspiranteLogica(ProntuarioAspirante v, AspiranteDAO m) {
        this.v = v;
        this.m = m;
        this.v.btnGenerar.addActionListener(this);
        this.v.btnLimpiar.addActionListener(this);
        this.v.btnSalir.addActionListener(this);
    }

    public void asignarValores(){
        AspiranteVO aspirante = new AspiranteVO();
        aspirante.setNombre(this.v.txtboxNombre.getText());
        aspirante.setApellido(this.v.txtBoxApellido.getText());
        aspirante.setNacionalidad(this.v.txtBoxNacionalidad.getText());
        
        String formatoFecha = "yyyy-MM-dd";//aca tomo la fecha del chooser y la 
        Date fecha = this.v.dtpkrFechaNacimiento.getDatoFecha();//formateo para que salga
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);//como la necesito
        aspirante.setFechaNac(formateador.format(fecha));

        aspirante.setPaisOrigen(this.v.txtBoxPaisOrigen.getText());
        aspirante.setProvinciaOrigen(this.v.txtBoxProvincia.getText());
        aspirante.setLocalidadOrigen(this.v.txtBoxLocalidad.getText());
        aspirante.setEstadoCivil(this.v.txtBoxEstadoCivil.getText());//Combo o rbtn
        aspirante.setNombreConyugue(this.v.txtBoxApyNomEsposa.getText());
        aspirante.setNombrePadre(this.v.txtBoxApyNomPadre.getText());
        aspirante.setNombreSolteraMadre(this.v.txtBoxApyNomMadre.getText());
        aspirante.setSexo(this.v.rbtnHombre.isSelected());
        aspirante.setDni(this.v.txtBoxDni.getText());
        aspirante.setExpedidoPor(this.v.txtBoxExpedido.getText());
        aspirante.setProfesion(this.v.txtBoxProfesion.getText());
        aspirante.setInstruccion(this.v.txtBoxInstruccion.getText());
        aspirante.setProvinciaAct(this.v.txtBoxProvinciaAct.getText());
        aspirante.setLocalidadAct(this.v.txtBoxLocalidadAct.getText());
        aspirante.setDomicilioAct(this.v.txtBoxDomicilioActual.getText());
        aspirante.setLocalidadLab(this.v.txtBoxLocalidadLab.getText());
        aspirante.setDomicilioLab(this.v.txtBoxDomicilioLab.getText());
        aspirante.setTelefono(this.v.txtBoxTelefono.getText());
        aspirante.setSangre(this.v.txtBoxSangre.getText());//ESTO TIENE QUE SER UN COMBO
        this.m.grabar(aspirante);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case"Generar":
                System.out.println("generar");
                asignarValores();
                break;
            case"Limpiar":
                System.out.println("Limpiar");
                break;
            case"Salir":
                System.out.println("Salir");
                break;
        }
    }
    
}
