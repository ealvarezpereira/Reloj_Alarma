/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.alarma;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 * 
 * @param horas son las horas de la alarma
 * @param minutos son los minutos de la alarma
 * @param segundos son los segundos de la alarma
 * @param  hmsa es el string completo de la alarma
 */
public class Alarma {

    static int horas;
    static int minutos;
    static int segundos;
    static String hmsa = horas + ":" + minutos + ":" + segundos;

    public Alarma() {
    }

    public Alarma(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    //Aqui pedimos la alarma

    public static void hmsa() {
        horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos"));
        segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los segundos"));
        hmsa = horas + ":" + minutos + ":" + segundos;

    }

    public String getHmsa() {
        return hmsa;
    }

}
