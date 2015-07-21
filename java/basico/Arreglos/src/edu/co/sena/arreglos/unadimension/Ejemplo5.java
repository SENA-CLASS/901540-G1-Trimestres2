/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.unadimension;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo;//declaramos la variable del arreglo
        int tamano;// declaramos una variable para el tamano del arreglo
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite el numero de valores que quiere sumar: ");
        tamano = teclado.nextInt();//leemos el tamano del arregl
        arreglo = new int[tamano];//inicializa el arreglo

        for (int i = 0; i < tamano; i++) {//importante podemos usar el arreglo.length o usar tamaño
            System.out.print("digite el " + (i + 1) + " valor: ");
            arreglo[i] = teclado.nextInt();//leer el arreglo en la posicion i
        }
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("el arreglo en la posicion["+i+"]: "+arreglo[i]);
        }
        
        System.out.println("la suma es: " + suma);

    }

}
