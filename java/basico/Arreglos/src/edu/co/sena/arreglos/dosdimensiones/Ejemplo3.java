/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.dosdimensiones;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llenar una matriz por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite el tamano de las filas: ");
        int filas =teclado.nextInt();
        System.out.print("digite el tamano de las columnas: ");
        int columnas = teclado.nextInt();
        int[][] matriz = new int[filas][columnas];
        
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("valor para matriz["+fila+"]["+columna+"]: ");
                matriz[fila][columna]=teclado.nextInt();
                
            }
        }
        //imprimir una matriz
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas ; columna++) {
                System.out.print(matriz[fila][columna]+"\t");
            }
            System.out.println("");
        }
        int suma=0;
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas ; columna++) {
                suma=suma+matriz[fila][columna];
            }
        }
        System.out.println("la suma del arreglo es: "+suma);
        
        
        
    }
    
}
