/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4;

import java.time.LocalDate;

/**
 *
 * @author cris
 */
public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;
    public Prestamo(Estudiante estudiante,Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        fechaPrestamo = LocalDate.now();
        fechaDevolucion = fechaPrestamo.plusDays(7);
    }
    public void mostrarInfo() {
        System.out.println(estudiante.getNombre()+" con libro: "+ libro.getTitulo());
    }
}
