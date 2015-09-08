/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.tostring;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MotoElectrica m1 = new MotoElectrica();
        System.out.println(m1);
        System.out.println(m1.getClass().getCanonicalName());
    }
    
}
