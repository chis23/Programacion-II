package com.mycompany.programaprac1_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cris
 */
public class Cronometro {
    private double inicia;
    private double finaliza;

    public double getInicia() {
        return inicia;
    }

    public double getFinaliza() {
        return finaliza;
    }
    
    public void Cronograma(){
        this.inicia= System.currentTimeMillis();
    }
    public void inicia(){
        this.inicia=System.currentTimeMillis();
    }
    public void detener(){
        this.finaliza=System.currentTimeMillis();
    }
    public double lapsoDeTiempo(){
        return finaliza-inicia;
    }
}
