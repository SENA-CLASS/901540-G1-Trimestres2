/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.parametros;

/**
 *
 * @author hernando
 */
public class APP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("jose");
        cambiarNombre(p1, "carlos");
        
        System.out.println(p1.getNombre());
        
    }
    
    public static void cambiarNombre(Persona p, String nombreNuevo){
        p.setNombre(nombreNuevo);
    }
    
}
