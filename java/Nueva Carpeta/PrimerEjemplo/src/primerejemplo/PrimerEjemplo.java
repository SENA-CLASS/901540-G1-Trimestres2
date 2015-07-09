/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejemplo;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class PrimerEjemplo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables siempre van en lowerCamelCase
        int a;
        //escrbir
        System.out.println("Hola mundo");
        //leer
        Scanner teclado = new Scanner(System.in);
        
        int variableLeidaEntera = teclado.nextInt();
        System.out.println(variableLeidaEntera);
        
        double variableLeidaDouble = teclado.nextDouble();
        System.out.println(variableLeidaDouble);
        
        String variableLeidaCaracter = teclado.next();
        System.out.println(variableLeidaCaracter);
        
    }
    
}
