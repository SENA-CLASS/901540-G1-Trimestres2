/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplodesiciones.casos;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char opcion;
        opcion= 'a';
        switch (opcion) {
            case 'a':
                System.out.println("la opcion seleccionada es la 1");
                break;
            case 'b':
                System.out.println("la opcion seleccionada es la 2");
                break;
            case 'c':
                System.out.println("la opcion seleccionada es la 3");
                break;
            default:
                System.out.println("la opcion seleccionada no es correcta");
        }
    }
    
}
