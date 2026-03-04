/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaprac1_4;

/**
 *
 * @author cris
 */
public class Estadisticas {
    private double[] dat;

    public Estadisticas(double[]dat){
        this.dat=dat;
    }
    public double promedio(){
        double s=0;
        for (int i=0;i<dat.length;i++){
            s+=dat[i];
        }
        return s/dat.length;
    }
    public double desviacion(){
        double p=promedio();
        double s=0;
        for (int i=0;i<dat.length;i++){
            s+=Math.pow(dat[i]-p, 2);
        }
        return Math.sqrt(s/(dat.length-1));
    }
}
