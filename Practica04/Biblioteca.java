/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4;

import java.util.ArrayList;

/**
 *
 * @author cris
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        prestamos = new ArrayList<>();
        horario = new Horario("Lunes-Viernes","08:00","20:00");
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    public void prestarLibro(
        Estudiante estudiante,Libro libro) {
        Prestamo p =new Prestamo(estudiante, libro);
        prestamos.add(p);
    }
    public void mostrarEstado() {
        System.out.println("\n "+nombre );
        System.out.println("\nHorario:");
        horario.mostrarHorario();
        System.out.println("\nLibros: ");
        for (Libro l:libros) {
            System.out.println(l.getTitulo());
        }
        System.out.println("\nAutores: ");
        for (Autor a : autores) {
            a.mostrarInfo();
        }
        System.out.println("\nPrestamos: ");
        for (Prestamo p : prestamos) {
            p.mostrarInfo();
        }
    }
    public void cerrarBiblioteca() {
        System.out.println("\nBiblioteca cerrada");
        prestamos.clear();
    }
}
