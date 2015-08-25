/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.sobrecargar.metodo;

import java.util.Scanner;

/**
 *
 * @author hernando
 */
public class Calculadora {
    
    public static void main(String[] args) {
        
        
        int resultado = Calculadora.suma(5, 10);
        System.out.println(resultado);
        double resultado2 = Calculadora.suma(5, 10);
        System.out.println(resultado2);
        double resultado3 = Calculadora.suma("10", "20");
        System.out.println(resultado3);
        long resultado4 = Calculadora.suma(2000000, 52354234);
        System.out.println(resultado4);
        
       
                        
                 
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double suma(String a, String b) {
        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        double resultado = aDouble + bDouble;
        return resultado;
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static long suma(long a, long b) {
        return a + b;
    }

}
