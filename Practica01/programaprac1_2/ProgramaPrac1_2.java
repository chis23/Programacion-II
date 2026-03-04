/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaprac1_2;

import java.util.Scanner;

/**
 *
 * @author cris
 */
public class ProgramaPrac1_2 {

    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);

        System.out.print("Ingrese a,b,c,d,e,f: ");
        double a=w.nextDouble();
        double b=w.nextDouble();
        double c=w.nextDouble();
        double d=w.nextDouble();
        double e=w.nextDouble();
        double f=w.nextDouble();
        EcuacionLineal ec = new EcuacionLineal(a, b, c, d, e, f);
        if (ec.tieneSolucion()) {
            System.out.println("x = "+ec.getX()+ ", y = "+ec.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
        w.close();
    }
}
