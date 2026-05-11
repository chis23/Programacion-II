/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4;

/**
 *
 * @author cris
 */
public class Horario {
    private String dias;
    private String apertura;
    private String cierre;

    public Horario(String dias,String apertura,String cierre) {
        this.dias = dias;
        this.apertura = apertura;
        this.cierre = cierre;
    }
    public void mostrarHorario() {
        System.out.println(dias+" "+apertura +" - "+cierre);
    }
}
