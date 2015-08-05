/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.parametros;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class APP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        int a =100;
        cambiarNumero(a);
        System.out.println(a);
        
        
        Integer b = new Integer(50);
        cambiarReferencia(b);
        System.out.println(b);
        
    }
    
    public static void cambiarReferencia(Integer a ){
    a=1200;
        
    }
    
    public static void cambiarNumero(int a){
    a=50;
       // System.out.println("imprimo a desde el metodo y es "+a);
    }
    
    
    public static void llenarVector(int[] vector){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            vector[i]=teclado.nextInt();
        }
    
        
    }
    
    public static void imprimirVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("el vector en la posicion "+i+" = "+vector[i]);
        }
    
        
    }
    
    
}
