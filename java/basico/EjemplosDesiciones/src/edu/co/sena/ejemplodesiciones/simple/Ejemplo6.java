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
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        boolean resultado;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        resultado = a > b && (c >= d || a != c);
        if (resultado) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }
    }

}
