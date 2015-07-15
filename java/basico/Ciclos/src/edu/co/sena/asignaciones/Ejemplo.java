/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.asignaciones;

/**
 *
 * @author hernando
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        
        a=0;
        a++;
        System.out.println(a);
        b=0;
        ++b;
        System.out.println(b);
        
        a=0;
        
        System.out.println(a++);//System.out.println(a);a=a+1;
        System.out.println(a);
        b=0;
        
        System.out.println(++b);//a=a+1;System.out.println(a);
        
        
    }

}
