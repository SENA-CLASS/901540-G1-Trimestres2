/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.relacion;

import edu.co.sena.poo.visibilidad.Perro;

/**
 *
 * @author hernando
 */
public class Amo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perrito1 = new Perro();
        perrito1.raza= "Pitbull";
        
        
        System.out.println(perrito1.raza);
        
        perrito1.raza="Pincher";
        perrito1.cambiarSexo('M');
        
        
        System.out.println(perrito1.raza);
        System.out.println(perrito1.verSexo());
        
        
    }
    
}
