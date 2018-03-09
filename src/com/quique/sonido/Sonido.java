/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.sonido;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author quique
 */
public class Sonido {

    /**
     * @param clip Crea un nuevo clip
     *
     * @method ReproducirSonido le pasamos la url del archivo de sonido y abre
     * el clip
     *
     * @method pararSonido lo que hace es parar el clip cuando le das al boton
     */
    public static Clip clip;

    public static void ReproducirSonido(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }

    }

    public static void pararSonido(boolean parado) {

        if (parado == true) {
            clip.stop();
        }
    }

}
