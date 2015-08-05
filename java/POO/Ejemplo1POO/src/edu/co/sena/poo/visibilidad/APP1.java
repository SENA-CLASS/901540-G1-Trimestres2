/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.visibilidad;

import edu.co.sena.poo.visibilidad.Perro;

/**
 *
 * @author hernando
 */
public class APP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perrito2=  new Perro();
        perrito2.raza="Dobermang";
        perrito2.color="negro";
        
        System.out.println(perrito2.raza);
        System.out.println(perrito2.color);
        
        PerroCachorro perritoPequeno1 = new PerroCachorro();
        
        
        
        
    }
    
}
