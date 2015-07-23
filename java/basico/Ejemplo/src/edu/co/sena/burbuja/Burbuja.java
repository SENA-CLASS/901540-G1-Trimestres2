/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.burbuja;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo;
        Scanner teclado = new Scanner(System.in);
        int tamano= teclado.nextInt();
        arreglo = new int[tamano];
        //llenar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= teclado.nextInt();
        }
            
        //ordear el arreglo    
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[j]<arreglo[i]){
                int burbuja =arreglo[j];
                arreglo[j]=arreglo[i];
                arreglo[i]=burbuja;
                }
            }
        }
        //imprimir el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
