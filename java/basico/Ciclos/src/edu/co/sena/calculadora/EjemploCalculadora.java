/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.calculadora;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class EjemploCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacin");
            System.out.println("4. division");
            System.out.println("10. salir");

            System.out.print("Digite la opcion: ");
            Scanner teclado = new Scanner(System.in);
            int a, b;
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("digite el primer valor: ");
                    a = teclado.nextInt();
                    System.out.print("digite el segundo valor valor: ");
                    b = teclado.nextInt();
                    System.out.print("la suma es: " + (a + b)+"\n");
                    break;
                case 2:
                    System.out.print("digite el primer valor: ");
                    a = teclado.nextInt();
                    System.out.print("digite el segundo valor valor: ");
                    b = teclado.nextInt();
                    System.out.print("la resta es: " + (a - b));
                    break;
                case 3:
                    System.out.print("digite el primer valor: ");
                    a = teclado.nextInt();
                    System.out.print("digite el segundo valor valor: ");
                    b = teclado.nextInt();
                    System.out.print("la * es: " + (a * b));
                    break;
                case 4:
                    System.out.print("digite el primer valor: ");
                    a = teclado.nextInt();
                    System.out.print("digite el segundo valor valor: ");
                    b = teclado.nextInt();
                    if (b == 0) {
                        System.out.println("la divison por cero no existe");
                    } else {
                        System.out.print("la / es: " + (a / b));
                    }
                    break;
                case 10:
                    break;
                default:
                    System.out.println("la opcion no es correcta");
                    break;

            }
            for (int i = 0; i < 2; i++) {
                System.out.println("");
            }
        } while (opcion != 10);

    }

}
