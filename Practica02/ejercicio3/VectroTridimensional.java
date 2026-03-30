/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer333;

/**
 *
 * @author cris
 */
public class VectroTridimensional {
    private double x, y, z;

    public VectroTridimensional() {
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public VectroTridimensional(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){ 
        return x; 
    }
    public double getY(){
        return y; 
    }
    public double getZ(){ 
        return z; 
    }

    public VectroTridimensional suma(VectroTridimensional b) {
        return new VectroTridimensional(this.x+b.x,this.y+b.y,this.z+ b.z);
    }

    public VectroTridimensional escalar(double r) {
        return new VectroTridimensional(r*x,r*y,r*z);
    }

    public double longitud() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    public VectroTridimensional normal() {
        double L=longitud();
        if (L==0) 
            return new VectroTridimensional(0, 0, 0);
        return new VectroTridimensional(x/L,y/L,z/L);
    }

    public double prodEsc(VectroTridimensional b) {
        return this.x*b.x+this.y*b.y+this.z*b.z;
    }

    public VectroTridimensional cross(VectroTridimensional b) {
        return new VectroTridimensional(
            this.y*b.z - this.z*b.y,
            this.z*b.x - this.x*b.z,
            this.x*b.y - this.y*b.x);
    }

    public boolean perpendicular(VectroTridimensional b) {
        return Math.abs(prodEsc(b))<1e-9;
    }

    public VectroTridimensional proyeccion(VectroTridimensional b) {
        double factor=prodEsc(b)/b.prodEsc(b);
        return b.escalar(factor);
    }

    public double componente(VectroTridimensional b) {
        return prodEsc(b)/b.longitud();
    }

    public String toString() {
        return x+ ", " +y+", "+z;
    }
}
