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
public class Libro {
    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas;
    public Libro(String titulo, String isbn, String[] contenidoPaginas){
        this.titulo = titulo;
        this.isbn = isbn;
        paginas = new ArrayList<>();
        for (int i = 0; i < contenidoPaginas.length; i++){
            paginas.add(
                    new Pagina(i + 1, contenidoPaginas[i])
            );
        }
    }
    public void leer() {
        System.out.println("Libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
    public String getTitulo() {
        return titulo;
    }
}
