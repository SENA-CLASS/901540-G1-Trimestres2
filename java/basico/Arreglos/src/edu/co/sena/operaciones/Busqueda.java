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
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        
        int[] arreglo = new int[10];
      
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("digite el valor para["+i+"]: ");
            arreglo[i]= teclado.nextInt();
        }
        System.out.print("digite el numeor a buscar: ");
        int numeroBuscado= teclado.nextInt();
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]== numeroBuscado)
                System.out.println("el numero esta en la posicion "+i);
        }
        
        
    }
    
}
