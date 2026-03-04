/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaprac1_4;

import java.util.Scanner;

/**
 *
 * @author cris
 */
public class ProgramaPrac1_4 {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        double[] num = new double[10];
        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < num.length; i++){
            num[i] = w.nextDouble();
        }
        Estadisticas est = new Estadisticas(num);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviacion estandar es " + est.desviacion());
        w.close();
    }
}
