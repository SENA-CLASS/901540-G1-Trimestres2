/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.metodos.mutadores;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("juan");
        p1.setTelefono("123412341234");
        System.out.println(p1.getNombre());
        System.out.println(p1.getTelefono());
        
    }
    
}
