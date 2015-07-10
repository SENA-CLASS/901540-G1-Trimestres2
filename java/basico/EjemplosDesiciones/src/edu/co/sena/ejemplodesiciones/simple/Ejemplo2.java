/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplodesiciones.simple;

/**
 *
 * @author hernando
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // desiciones en cascada
        char letra;
        letra = 'a';

        if (letra == 'a') {
            System.out.println("la letra es a");
        } else if (letra == 'b') {
            System.out.println("la letra es b");
        } else if (letra == 'c') {
            System.out.println("la letra es c");
        } else if (letra == 'd') {
            System.out.println("la letra es d");
        } else {
            System.out.println("no se encontro la letra");
        }
    }

}
