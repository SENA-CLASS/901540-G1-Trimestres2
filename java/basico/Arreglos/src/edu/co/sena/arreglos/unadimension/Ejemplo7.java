/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.unadimension;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hernando
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] arreglo;//declaramos la variable del arreglo
        int tamano;// declaramos una variable para el tamano del arreglo
        
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros"));//leemos el tamano del arregl
        arreglo = new int[tamano];//inicializa el arreglo

        for (int i = 0; i < arreglo.length; i++) {//importante podemos usar el arreglo.length o usar tamaño
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("digite el " + (i + 1) + " valor: "));//leer el arreglo en la posicion i
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]%2==0){
                System.out.println("el arreglo en la posicion["+i+"] contiene ["+arreglo[i]+"] y es par");
            }else{
                System.out.println("el arreglo en la posicion["+i+"] contiene ["+arreglo[i]+"] y es impar");
            }
        }
        

    }
    
}
