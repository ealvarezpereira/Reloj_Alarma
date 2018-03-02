/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.alarma;

import com.quique.sonido.Sonido;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author quique
 */
public class Display extends JFrame implements ActionListener {

    Reloj rel = new Reloj();

    
    public JButton btnSonido = new JButton("Sonido on/off");
    public JButton btnHoraMas = new JButton("Hora +");
    public JButton btnHoraMenos = new JButton("Hora -");
    public JButton btnHoraAlarma = new JButton("Hora/Alarma");

    public JLabel lblHoras = new JLabel(rel.getMinutos()+":"+rel.getSegundos());

    public JPanel pnlMiPanel = new JPanel();

    public Display() {
        //-- CONFIGURAMOS LA VENTANA JFRAME

        super("ALARMA");
        this.setSize(400, 270);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-- LE AGREGAMOS EL GESTIONADOR DE EVENTOS
        this.btnSonido.addActionListener(this);
        this.btnHoraMas.addActionListener(this);
        this.btnHoraMenos.addActionListener(this);
        this.btnHoraMenos.addActionListener(this);

        //-- LE AÑADIMOS UN DISTRIBUIDOR DE OBJETOS AL PANEL
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.LEFT, 30, 30);
        this.pnlMiPanel.setLayout(DISTRIBUIDOR);

        //-- PERZONALIZAMOS LOS OBJETOS
        this.pnlMiPanel.setBackground(Color.CYAN);

        //-- LE AGREGAMOS LOS OBJETOS A LA VENTANA
        this.pnlMiPanel.add(this.lblHoras);
        this.pnlMiPanel.add(this.btnSonido);
        this.pnlMiPanel.add(this.btnHoraAlarma);
        this.pnlMiPanel.add(this.btnHoraMas);
        this.pnlMiPanel.add(this.btnHoraMenos);

        this.add(this.pnlMiPanel);

    }

    int m = 0;
    boolean PENE = false;

    @Override
    public void actionPerformed(ActionEvent AE) {
        //-- CON "getSource()" VEMOS EN QUE BOTON SE HIZO CLICK

        if (AE.getSource() == this.btnSonido) {

            if (PENE == false) {
                PENE = true;

            } else {
                PENE = false;
            }
            System.out.println(PENE);

            Sonido sound = new Sonido();
            if (PENE == true) {

                sound.ReproducirSonido("C:\\Users\\quique\\Documents\\NetBeansProjects\\PruebaBomba\\src\\pruebabomba\\cumbia.wav");
            } else {
                sound.pararSonido(PENE);
            }

        } else if (AE.getSource() == this.btnHoraMas) {

        } else if (AE.getSource() == this.btnHoraMenos) {
            System.exit(0);
        }
    }

}
