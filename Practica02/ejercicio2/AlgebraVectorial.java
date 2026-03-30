/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer222;

/**
 *
 * @author cris
 */
public class AlgebraVectorial {
    private double ax;
    private double ay;
    private double bx;
    private double by;

    public AlgebraVectorial() {
        this.ax= 0; 
        this.ay= 0;
        this.bx= 0;
        this.by= 0;
    }

    public AlgebraVectorial(double ax, double ay) {
        this.ax= ax;
        this.ay= ay;
        this.bx= 0;
        this.by= 0;
    }

    public AlgebraVectorial(double ax, double ay, double bx, double by) {
        this.ax= ax;
        this.ay= ay;
        this.bx= bx;
        this.by= by;
    }

    private double magnitud(double x, double y) {
        return Math.sqrt(x*x+y*y);
    }

    private double prodP(double ax, double ay, double bx, double by) {
        return ax*bx+ay*by;
    }
    
    public boolean perpendicular() {
        double s=magnitud(ax+bx,ay+by);
        double r=magnitud(ax-bx,ay-by);
        return Math.abs(s - r)<1e-6;
    }

    public boolean perpendicular(double a, double b) {
        double r1=magnitud(ax-bx,ay-by);
        double r2=magnitud(bx-ax,by-ay);
        return Math.abs(r1-r2)<1e-6;
    }

    public boolean perpendicular(double ax, double ay, double bx, double by) {
        return Math.abs(prodP(ax, ay, bx, by)) < 1e-6;
    }

    public boolean perpendicularProdP() {
        return Math.abs(prodP(ax,ay,bx,by))<1e-6;
    }

    public boolean perpendicularPitágoras() {
        double izq=Math.pow(magnitud(ax + bx, ay + by), 2);
        double der=Math.pow(magnitud(ax, ay), 2) + Math.pow(magnitud(bx, by), 2);
        return Math.abs(izq-der)< 1e-6;
    }

    public boolean paralela() {
        if (bx==0 && by==0) 
            return false;
        double r1=ax/bx;
        double r2=ay/by;
        return Math.abs(r1-r2)<1e-6;
    }

    public boolean paralelaCruz() {
        return Math.abs(ax*by-ay*bx)< 1e-6;
    }

    public double[] proyeccion() {
        double div=Math.pow(magnitud(bx,by),2);
        double escalar=prodP(ax,ay,bx,by)/div;
        return new double[]{ escalar*bx,escalar*by};
    }

    public double componente() {
        double magB=magnitud(bx,by);
        return prodP(ax,ay,bx,by)/magB;
    }
}
