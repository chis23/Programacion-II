/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaprac1_1;

import java.util.Random;



/**
 *
 * @author cris
 */
public class ProgramaPrac1_1 {

    public static void main(String[] args) {
        Cronometro cro=new Cronometro();
        cro.inicia();
        
        int n=100000;
        int[] v=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            v[i]=r.nextInt(100000);
        }
        System.out.println("-------------");
        for(int i=0;i<v.length-1;i++){
            int minimo=i;
            for(int j=i+1;j<v.length;j++){
                if(v[j]<v[v[minimo]]){
                    minimo=j;
                }
            }
            int selec=v[i];
            v[i]=v[minimo];
            v[minimo]=selec;
        }
        cro.detener();
        System.out.println("Tiempo total: "+cro.lapsoDeTiempo());
    }
    
}
