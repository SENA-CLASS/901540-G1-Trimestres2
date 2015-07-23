/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.operaciones;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        Scanner teclado = new Scanner(System.in);
        
        arreglo[0]= teclado.nextInt();
        arreglo[1]= teclado.nextInt();
        arreglo[2]= teclado.nextInt();
        arreglo[3]= teclado.nextInt();
        arreglo[4]= teclado.nextInt();
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= teclado.nextInt();
        }
        
    }
    
}
