/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4;

/**
 *
 * @author cris
 */
public class Pagina {
    private int numero;
    private String contenido;

    public Pagina(int numero, String contenido) {
        this.numero=numero;
        this.contenido=contenido;
    }
    public void mostrarPagina() {
        System.out.println("Pagina: "+numero+"  "+contenido);
    }
}
