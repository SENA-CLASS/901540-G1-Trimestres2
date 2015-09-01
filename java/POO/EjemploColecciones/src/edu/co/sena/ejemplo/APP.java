/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.setNombre("pili");
        p1.setRaza("dobermag");
        Perro p2 = new Perro();
        p2.setNombre("pili2");
        Perro p3 = new Perro();
        p3.setNombre("pili3");
        Perro p4 = new Perro();
        p4.setNombre("pil4");
        Perro p5 = new Perro();
        p5.setNombre("pili5");
    
        Veterinaria v1 = new Veterinaria();
        v1.hospitalizar(p1);
        v1.hospitalizar(p2);
        v1.hospitalizar(p3);
        v1.hospitalizar(p4);
        v1.hospitalizar(p5);
    
        v1.listarPerros();
        
        v1.darDeAlta(10);
        v1.darDeAlta(0);
        v1.listarPerros();
        
        
    }
    
}
