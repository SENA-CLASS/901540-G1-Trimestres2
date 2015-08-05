/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.derivativo;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadro cuadrito1 = new Cuadro(3, 4);
        
        System.out.println(cuadrito1.toString());
        cuadrito1.setAltura(6);
        System.out.println(cuadrito1.toString());
        cuadrito1.setAltura(8);
        System.out.println(cuadrito1.toString());
    }
    
}
