/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio4;

/**
 *
 * @author cris
 */
public class Laboratorio4 {

    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca("UMSA");
        Autor autor1=new Autor("Gabriel Garcia Marquez","Colombiano");
        String paginas[] = {"Introduccion","Capitulo 1","Capitulo 2"};
        Libro libro1 =new Libro("Cien anios de soledad","123456",paginas);
        Estudiante estudiante =new Estudiante("2025001","Juan Perez");

        biblioteca.agregarAutor(autor1);
        biblioteca.agregarLibro(libro1);
        biblioteca.prestarLibro(estudiante,libro1);
        biblioteca.mostrarEstado();
        System.out.println("\nLeyendo libro:");
        libro1.leer();
        biblioteca.cerrarBiblioteca();
    }
}
