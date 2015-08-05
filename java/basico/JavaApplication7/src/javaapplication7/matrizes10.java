/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class matrizes10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        int divi = 0, conta = 0, mayor = 0;
        System.out.print("digite tamaño de las filas: ");
        int fila = teclado.nextInt();
        System.out.print("digite el tamaño de las columnas: ");
        int columna = teclado.nextInt();
        int[][] matriz = new int[fila][columna];
        for (int filas = 0; filas < fila; filas++) {
            for (int columnas = 0; columnas < columna; columnas++) {
                System.out.print("valor de la matriz[" + filas + "][" + columnas + "]: ");
                matriz[filas][columnas] = teclado.nextInt();
            }

        }
        for (int filas = 0; filas < fila; filas++) {
            for (int columnas = 0; columnas < columna; columnas++) {
                System.out.print(matriz[filas][columnas] + "\t");

            }
            System.out.println("");
        }

        int con = 0;
        for (int filas = 0; filas < fila; filas++) {
            for (int columnas = 0; columnas < columna; columnas++) {
                con = 0;
                for (int i = 1; i <= matriz[filas][columnas]; i++) {

                    if (matriz[filas][columnas] > 0) {
                        divi = matriz[filas][columnas] % i;
                        con++;

                    }
                    if (con == 2) {
                        if (matriz[filas][columnas] > mayor) {
                            mayor = matriz[filas][columnas];

                        }
                        System.out.println("En la matriz[" + filas + "][" + columnas + "]este numero es primo: " + matriz[filas][columnas]);
                    }

                }

            }

        }
        System.out.println("el numero mayor de los primos es: " + mayor);

    }

}