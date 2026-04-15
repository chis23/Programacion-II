/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion2;

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
    public boolean validaNumero(int num) {
        return (num>=0 && num<=10);
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
            if (!validaNumero(inten)) {
                System.out.println("Numero invalido,intenta otra vez");
                continue;
            }
            if (inten == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                boolean otroInten = quitaVida();
                if (otroInten) {
                    if (inten < numeroAAdivinar) {
                        System.out.println("El numero es MAYOR");
                    } else {
                        System.out.println("El numero es MENOR");
                    }
                } else {
                    break;
                }
            }
        } while (true);
    }
}
