/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ciclos.hagamientras;

/**
 *
 * @author hernando
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1,j=1;
        do {        
            j=1;
            do {                
                System.out.println(i+" * "+j+" = "+(i*j));
                j++;
            } while (j<=10);
            i++;
        } while (i<=5);
    }
    
}
