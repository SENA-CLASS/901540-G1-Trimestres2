/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.metodos;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda ra = new Rueda();
        ra.color="blanca";
        ra.tamano="mediana";
        Rueda rb = new Rueda();
        rb.color="blanca";
        rb.tamano="mediana";
        
        Moto motico = new Moto("Honda", "Roja", "2015", ra, rb);
        Moto motico2 = new Moto();
        
        
        System.out.println(motico.getVelocidad());
        motico.encender();
        motico.acelerar(1);
        System.out.println(motico.getVelocidad());
        motico.acelerar(2);
        System.out.println(motico.getVelocidad());
        motico.desacelerar();
        System.out.println(motico.getVelocidad());
        
        
        
    }
    
}
