/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.alarma;

import com.quique.sonido.Sonido;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author quique
 * 
 * @param horas son las horas del Date()
 * @param minutos son los minutos del Date()
 * @param segundos son los segundos del Date()
 * 
 */
public class Reloj {

    Timer timer;
    private int horas, minutos, segundos;
    public static String hms;
    Alarma alrm = new Alarma();

    public Reloj() {

        timer = new Timer();

        timer.schedule(new TicTac(), 0, 1000);
    }

    public class TicTac extends TimerTask {

        /**
         * Método que se ejecuta cuando lanzamos la tarea con el Timer Es un
         * método definido en la clase TimerTask que sobrescribimos
         */
        @Override
        public void run() {
            
            //Creamos un objeto de tipo date para sacar la hora del sistema
            
            //a cada variable le damos el valor correspondiente del tiempo del sistema

            Date date = new Date();
            horas = date.getHours();
            minutos = date.getMinutes();
            segundos = date.getSeconds();

            //Añadimos todo a un string
            
            hms = horas + ":" + minutos + ":" + segundos;
            
            //Al jtextfield del display le pasamos la hora para que se actualice cada segundo
            Display.textoHora.setText(Reloj.hms);

            //Si la hora es igual a la alarma que le introducimos que reproduzca el sonido
            if (hms.contains(alrm.getHmsa())) {
                Sonido.ReproducirSonido("C:\\Users\\quique\\Documents\\NetBeansProjects\\PruebaBomba\\src\\pruebabomba\\cumbia.wav");
            }
        }
    }

}
