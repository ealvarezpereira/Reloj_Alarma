/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.alarma;

import javax.swing.JLabel;

/**
 *
 * @author quique
 */
public class Reloj extends JLabel implements Runnable {

    private int minutos, segundos;
    JLabel oo = new JLabel();

    public void reloje() {

        for (int i = 0; i < 1000000; i++) {
            try {

                segundos++;

                Thread.sleep(1000);

                if (segundos >= 59) {

                    segundos = 0;
                    minutos++;
                }

                if (minutos >= 59) {
                    minutos = 0;
                }
                
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex);
            }
        }

    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    @Override
    public void run() {

        for (int i = 0; i < 1000000; i++) {
            try {

                segundos++;

                Thread.sleep(1000);

                if (segundos >= 59) {

                    segundos = 0;
                    minutos++;
                }

                if (minutos >= 59) {
                    minutos = 0;
                }
                
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex);
            }
        }
        
        
        
    }

}
