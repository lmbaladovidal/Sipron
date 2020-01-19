/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.AspiranteDAO;
import vista.*;

/**
 *
 * @author Martin
 */
public class MenuLogica implements ActionListener{

    public Menu menu;
    public AspiranteDAO aspiranteDAO = new AspiranteDAO();

    public MenuLogica(Menu menu) {
        this.menu = menu;
        this.menu.btnPrioAsp.addActionListener(this);
        this.menu.btnPrioDet.addActionListener(this);
        this.menu.btnAfis.addActionListener(this);
        this.menu.btnSpis.addActionListener(this);
        this.menu.btnFichaSimple.addActionListener(this);
        this.menu.btnFichaDoble.addActionListener(this);
        this.menu.btnTradan.addActionListener(this);
        this.menu.btnActaConf.addActionListener(this);
        this.menu.btnConsultarPrio.addActionListener(this);
        this.menu.btnConsultarTradan.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Prontuario Aspirante":
                ProntuarioAspirante prontuarioAspirante = new ProntuarioAspirante();
                ProntuarioAspiranteLogica prontuarioAspiranteLogica = new ProntuarioAspiranteLogica(prontuarioAspirante,this.aspiranteDAO);
                prontuarioAspirante.setVisible(true);
                break;
            case"Prontuario Detenido":
                ProntuarioDetenido prontuarioDetenido = new ProntuarioDetenido();
                prontuarioDetenido.setVisible(true);
                break;
            case"SPIS":
                FichaSpis fichaSpis = new FichaSpis();
                fichaSpis.setVisible(true);
                break;
            case"AFIS":
                FichaAfis fichaAfis = new FichaAfis();
                fichaAfis.setVisible(true);
                break;
            case"Ficha Simple":
                FichaSimple fichaSimple = new FichaSimple();
                FichaSimpleLogica fichaSimpleLogica = new FichaSimpleLogica(fichaSimple);
                fichaSimple.setVisible(true);
                break;
            case"Ficha Doble":
                System.out.println("aca estoy6");
                FichaDoble fichaDoble = new FichaDoble();
                fichaDoble.setVisible(true);
                break;
            case"Tradan":
                System.out.println("aca estoy7");
                GenerarTradan generarTradan = new GenerarTradan();
                generarTradan.setVisible(true);
                break;
            case"Acta Conformidad":
                System.out.println("aca estoy8");
                ActaDeConformidad actaConformidad = new ActaDeConformidad();
                actaConformidad.setVisible(true);
                break;
            case"Consultar Prontuario":
                System.out.println("aca estoy9");
                ConsultarPrio consultarPrio = new ConsultarPrio();
                consultarPrio.setVisible(true);
                break;
            case"Consultar Tradan":
                System.out.println("aca estoy10");
                ConsultarTradan consultarTradan = new ConsultarTradan();
                consultarTradan.setVisible(true);
                break;
        }
    }
    
}
