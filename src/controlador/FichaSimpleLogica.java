/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FichaSimple;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.Spring.height;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Huella;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import modelo.Conexion;
/**
 *
 * @author Martin
 * 
 * controlar tamaño de imagen
 * dar formato de imagen y nombre
 * validad imagenes
 * guardar todo en bbdd
 */
public class FichaSimpleLogica implements ActionListener{
    public FichaSimple v;
    public FileInputStream entrada;//ESTO ME PERMITE MANEJAR LOS ARCHIVOS
    public FileOutputStream salida;//
    public File archivo;           //
    public ArrayList<File> arrayImg = new ArrayList<File>();
    public JFileChooser seleccion = new JFileChooser();
    public Validaciones validaciones = new Validaciones();
    
    public FichaSimpleLogica(FichaSimple v) {
        this.v = v;
        this.v.btnCargaArchivo.addActionListener(this);
        this.v.btnGuardar.addActionListener(this);
        this.v.btnLimpiar.addActionListener(this);
        this.v.btnSalir.addActionListener(this);
        this.seleccion.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG","*.png","*.JPG","*.jpg");
       // this.seleccion.setFileFilter(filtro);
        
    }
        /**Cargar la imagen de Archivo**/
    public File cargarImagen(JLabel label){
        
        if(seleccion.showDialog(v, "ABRIR IMAGEN")== JFileChooser.APPROVE_OPTION){
            this.archivo = seleccion.getSelectedFile();
            String path = this.archivo.getAbsolutePath();
            int x = label.getWidth();
            int y = label.getHeight();
            ImageIcon imagen = new ImageIcon(this.archivo.toString());
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
            label.setIcon(icon);
        }
        return this.archivo; 
    }

    public void asignarImagen(){
        ArrayList<JLabel>  al = new ArrayList<JLabel>();
        al.add(v.lbl1d);
        al.add(v.lbl2d);
        al.add(v.lbl3d);
        al.add(v.lbl4d);
        al.add(v.lbl5d);
        al.add(v.lbl1i);
        al.add(v.lbl2i);
        al.add(v.lbl3i);
        al.add(v.lbl4i);
        al.add(v.lbl5i);
        int i = 0;
        for(JLabel label: al){
            System.out.println(i++);
            this.arrayImg.add(cargarImagen(label));
        } 
        
    }
    
    public void guardarImagenes(int id){
        int i = 0;
        for(File imagen: this.arrayImg){
            System.out.println(i++);
            guardarImagen(imagen,id);
        }
    }
    
    
    /**Guardar La imagen**/
    public void guardarImagen(File imagen,int id){
        PreparedStatement ps;
        ResultSet rs;
        Conexion objCon = new Conexion();
        try {
            FileInputStream fis = new FileInputStream(imagen);
            Connection c = objCon.getConector();
            ps = c.prepareStatement("INSERT INTO huella (idFicha, imagen) VALUES (?,?)");
            ps.setInt(1, id);
            ps.setBinaryStream(2, fis, (int) imagen.length());
            ps.execute();
        } catch (HeadlessException | FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Imagen");
            System.out.println(ex);
        }
    }
    
    
    public void guardarFicha(){
        String apellido = this.v.txtBoxApellido.getText();
        String documento = this.v.txtBoxDocumento.getText();
        int maxId = 0;
       if(validaciones.validarFicha(documento, apellido)){
            Conexion objCON = new Conexion();
            Connection c = objCON.getConector();
            String query = "INSERT INTO ficha (documentoAspirante)VALUES('"+documento+"')";
            String query2= "SELECT MAX(idFicha) FROM ficha";
             try {
                 Statement s = c.createStatement(); 
                 s.executeUpdate(query);
                 ResultSet r = s.executeQuery(query2);
                 r.next();
                 maxId = r.getInt("MAX(idFicha)");
                 s.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            guardarImagenes(maxId);
        }else{
           JOptionPane.showMessageDialog(this.v, "El numero de documento no coincide con el valor cargadro en la Base de Datos");
       }
        
    }
    
    public void limpiar(){
        this.v.txtBoxApellido.setText("");
        this.v.txtBoxDocumento.setText("");
        this.v.lbl1d.setIcon(null);
        this.v.lbl2d.setIcon(null);
        this.v.lbl3d.setIcon(null);
        this.v.lbl4d.setIcon(null);
        this.v.lbl5d.setIcon(null);
        this.v.lbl1i.setIcon(null);
        this.v.lbl2i.setIcon(null);
        this.v.lbl3i.setIcon(null);
        this.v.lbl4i.setIcon(null);
        this.v.lbl5i.setIcon(null);        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case"Cargar Desde Archivo":
                asignarImagen();
                break;
            case"Guardar":
                guardarFicha();
                System.out.println("guardar");
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
