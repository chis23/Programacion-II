/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cris
 */
public class JuegoAdivinaNumero extends Juego{
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int v) {
        super(v);
    }

    public void juega() {
        reiniciaPartida();
        Random r=new Random();
        numeroAAdivinar=r.nextInt(11);
        Scanner sc=new Scanner(System.in);
        int inten;
        System.out.println("Adivina un numero entre 0 y 10");
        do {
            inten=sc.nextInt();
            if (inten==numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                boolean otroInten = quitaVida();
                if (otroInten) {
                    if (inten<numeroAAdivinar) {
                        System.out.println("El numero es MAYOR");
                    } else {
                        System.out.println("El numero es MENOR");
                    }
                    System.out.println("Intenta de nuevo:");
                } else {
                    break;
                }
            }
        }
        while (true);
    }
}
