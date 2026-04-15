/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion2;

/**
 *
 * @author cris
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero{
    public JuegoAdivinaPar(int v) {
        super(v);
    }
    public boolean validaNumero(int num) {
        if (num<0 || num>10) {
            return false;
        }
        if (num%2 !=0) {
            System.out.println("Error:Debe ingresar un numero PAR");
            return false;
        }
        return true;
    }
}
