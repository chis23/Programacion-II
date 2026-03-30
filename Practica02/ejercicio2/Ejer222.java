/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer222;

/**
 *
 * @author cris
 */
public class Ejer222 {

    public static void main(String[] args) {
        AlgebraVectorial v=new AlgebraVectorial(3,4,-4,3);

        System.out.println("Perpendiculares (a*b=0) "+v.perpendicularProdP());
        System.out.println("Perpendiculares (|a+b|=|a-b|) "+v.perpendicular());
        System.out.println("Perpendiculares (pitagoras) "+v.perpendicularPitágoras());
        System.out.println("Paralelos (cruz)? "+v.paralelaCruz());
        double[] proj=v.proyeccion();
        System.out.println("Proyeccion de a sobre b: "+proj[0]+", "+proj[1]);
        System.out.println("Componente de a en b: " + v.componente());
    }
}
