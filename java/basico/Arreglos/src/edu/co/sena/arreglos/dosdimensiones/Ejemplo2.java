/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.dosdimensiones;

/**
 *
 * @author hernando
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // llenar matriz
        int filas =4, columnas =4;
        int[][] matriz = new int[filas][columnas];
        
        //matriz[4][4]=1; esto genera un error en tiempo de ejecucion por que se sale de las dimensiones del array
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[0][3]=4;
        matriz[1][0]=5;
        matriz[1][1]=6;
        matriz[1][2]=7;
        matriz[1][3]=8;
        matriz[2][0]=9;
        matriz[2][1]=10;
        matriz[2][2]=11;
        matriz[2][3]=12;
        matriz[3][0]=13;
        matriz[3][1]=14;
        matriz[3][2]=15;
        matriz[3][3]=16;
        int valor =0;
        //llenar una matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna]=++valor;
                
            }
        }
        //imprimir una matriz
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas ; columna++) {
                System.out.print(matriz[fila][columna]+"\t");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
