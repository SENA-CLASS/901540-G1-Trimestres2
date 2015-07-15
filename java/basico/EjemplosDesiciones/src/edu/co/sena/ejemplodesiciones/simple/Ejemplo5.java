/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplodesiciones.simple;

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
        int numLeido;
        Scanner teclado = new Scanner(System.in);
        numLeido= teclado.nextInt();
        
        if (numLeido%2==0) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }
    }
    
}
