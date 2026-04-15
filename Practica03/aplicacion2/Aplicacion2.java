/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion2;

/**
 *
 * @author cris
 */
public class Aplicacion2 {

    public static void main(String[] args) {
        JuegoAdivinaNumero j1=new JuegoAdivinaNumero(3);
        JuegoAdivinaPar j2=new JuegoAdivinaPar(3);
        JuegoAdivinaImpar j3=new JuegoAdivinaImpar(3);
        System.out.println("----- Juego Normal -----");
        j1.juega();
        System.out.println("----- Juego Pares -----");
        j2.juega();
        System.out.println("----- Juego Impares -----");
        j3.juega();
    }
}
