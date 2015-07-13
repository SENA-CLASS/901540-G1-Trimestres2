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
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ojo el switch con cadenas solo sirve desde la version java 1.7
        String opcion;
        Scanner teclado = new Scanner(System.in);
        opcion= teclado.next();
        switch (opcion) {
            case "hola":
                System.out.println("la opcion seleccionada es la 1");
                break;
            case "mundo":
                System.out.println("la opcion seleccionada es la 2");
                break;
            case "como":
                System.out.println("la opcion seleccionada es la 3");
                break;
            default:
                System.out.println("la opcion seleccionada no es correcta");
        }
    }
    
}
