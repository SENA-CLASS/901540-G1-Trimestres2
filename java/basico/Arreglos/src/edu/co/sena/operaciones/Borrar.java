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
public class Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //borrar
        Scanner teclado = new Scanner(System.in);
        int lleno=0;
        int posicionTemporal=0;
        
        int[] arreglo = new int[10];
        int[] arregloTemporal = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("digite el valor para["+i+"]: ");
            arreglo[i]= teclado.nextInt();
            lleno++;
        }
        System.out.print("digite el numero a eliminar");
        int numeroBorrar = teclado.nextInt();
        
        for (int i = 0; i < lleno; i++) {
            if(arreglo[i]!=numeroBorrar){
            arregloTemporal[posicionTemporal]=arreglo[i];
            posicionTemporal++;
            }
        }
        
        arreglo=arregloTemporal;
        lleno=posicionTemporal;
        
        for (int i = 0; i < lleno; i++) {
            System.out.println("final"+i+": "+arreglo[i]);        
            }
        
        
        
        
        
        
        
    }
    
}
