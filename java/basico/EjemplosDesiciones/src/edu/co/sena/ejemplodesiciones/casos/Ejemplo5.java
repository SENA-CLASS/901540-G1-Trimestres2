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
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: 
                int opcion2;
                opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("la opcion2 seleccionada es la 1");
                        break;
                    case 2:
                        System.out.println("la opcion2 seleccionada es la 2");
                        break;
                    case 3:
                        System.out.println("la opcion2 seleccionada es la 3");
                        break;
                    default:
                        System.out.println("la opcion2 seleccionada no es correcta");
                }

                break;
            
            case 2:
                System.out.println("la opcion seleccionada es la 2");
                break;
            case 3:
                System.out.println("la opcion seleccionada es la 3");
                break;
            default:
                System.out.println("la opcion seleccionada no es correcta");
        }
    }

}
