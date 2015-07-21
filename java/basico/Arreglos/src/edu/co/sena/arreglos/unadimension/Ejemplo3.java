/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.unadimension;

/**
 *
 * @author hernando
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arreglo1 = new int[10];
       int i = 0;
       
       //arreglo1[-1]= 1; esto se sale de las dimensiones del arreglo
       arreglo1[i]= 1;
       arreglo1[++i]= 2;
       arreglo1[++i]= 3;
       arreglo1[++i]= 4;
       arreglo1[++i]= 5;
       arreglo1[++i]= 6;
       arreglo1[++i]= 7;
       arreglo1[++i]= 8;
       arreglo1[++i]= 9;
       arreglo1[++i]= 10;
       //arreglo1[10]= 10; este se sale de las dimensiones del arreglo
       
        for (int j = 0; j < 10; j++) {
            System.out.println(arreglo1[j]);
        }
       
       
       
    }
    
}
