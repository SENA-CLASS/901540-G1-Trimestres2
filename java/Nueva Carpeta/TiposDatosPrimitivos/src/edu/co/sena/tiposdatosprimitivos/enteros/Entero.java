/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tiposdatosprimitivos.enteros;

import javax.swing.JOptionPane;

/**
 *
 * @author hernando
 */
public class Entero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipos de datos enteros que existenen java
        byte numeroBytesMemoria;
        short enteroCorto;
        int enteroNormal;
        long enteroLargo;
        
        numeroBytesMemoria =5;
        enteroCorto =32767;
        enteroNormal=20;
        enteroLargo=341341234;
        
        System.out.println("primer numero"+numeroBytesMemoria);
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        
        int a=5,b=10,c=15;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        JOptionPane.showMessageDialog(null, a);
        
        
        
        
        
        
    }
    
}
