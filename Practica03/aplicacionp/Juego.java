/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionp;

/**
 *
 * @author cris
 */
public class Juego {
    private int numeroDeVidas;
    private int record;

    public Juego(int v) {
        this.numeroDeVidas=v;
        this.record=0;
    }

    public void reiniciaPartida() {
        System.out.println("Nueva partida iniciada");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Record actualizado: "+record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan "+numeroDeVidas+" vidas");

        if (numeroDeVidas>0) {
            return true;
        } else {
            System.out.println("No te quedan vidas.");
            System.out.println("-------------------");
            System.out.println("Fin del Juego");
            return false;
        }
    } 
}
