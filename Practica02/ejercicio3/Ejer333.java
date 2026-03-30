/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer333;

/**
 *
 * @author cris
 */
public class Ejer333 {

    public static void main(String[] args) {
        VectroTridimensional a=new VectroTridimensional(3,-1,2);
        VectroTridimensional b=new VectroTridimensional(1,4,-2);

        System.out.println("Vector a = "+a);
        System.out.println("Vector b = "+b);

        System.out.println("\nSuma: "+a.suma(b));
        System.out.println("Escalar 2*a: "+a.escalar(2));
        System.out.println("Longitud de a: " +a.longitud());
        System.out.println("Normal de a: "+a.normal());
        System.out.println("Producto escalar a*b: "+a.prodEsc(b));
        System.out.println("Producto vectorial a×b: "+a.cross(b));
        System.out.println("Perpendiculares "+a.perpendicular(b));

        System.out.println("\nProyeccion de a sobre b: "+a.proyeccion(b));
        System.out.println("Componente de a en direccion de b: "+a.componente(b));
    }
}
