/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaprac1_3;

import java.util.Scanner;
/**
 *
 * @author cris
 */
public class ProgramaPrac1_3 {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("Ingrese a,b,c: ");
        double a = w.nextDouble();
        double b = w.nextDouble();
        double c = w.nextDouble();
        EcuacionCuadratica e = new EcuacionCuadratica(a,b,c);

        double dis = e.getDiscriminante();
        if (dis > 0){
            System.out.println("La ecuacion tiene dos raices"+e.getRaiz1()+" y "+e.getRaiz2());
        } 
        else if (dis==0){
            System.out.println("La ecuacion tiene una raiz"+e.getRaiz1());
        }
        else{
            System.out.println("La ecuacion no tiene raices reales");
        }
        w.close();
    }
}
