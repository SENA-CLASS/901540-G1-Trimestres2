/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejmplo.constructor;

/**
 *
 * @author hernando
 */
public class Bombillo {
    
    String marca;
    double voltaje;
    double corrente;
    
   

    public Bombillo(String marca, double voltaje, double corrente) {
        System.out.println("uso el constructor 1 de bombillo");
        this.marca = marca;
        this.voltaje = voltaje;
        this.corrente = corrente;
    }
    public Bombillo(String marca, String voltaje, String corrente) {
        System.out.println("uso el constructor 2 de bombillo");
        this.marca = marca;
        this.voltaje = Double.parseDouble(voltaje);
        this.corrente = Double.parseDouble(corrente);
    }
    public Bombillo(int marca, int voltaje, int corrente) {
        System.out.println("uso el constructor 3 de bombillo");
        Integer marcaTemporal = marca;
        this.marca = marcaTemporal.toString();
        this.voltaje = (double) voltaje;
        this.corrente = (double) voltaje;
    }

    @Override
    public String toString() {
        return "Bombillo{" + "marca=" + marca + ", voltaje=" + voltaje + ", corrente=" + corrente + '}';
    }
    
    public Integer toString(int a) {
        return a;
    }
    
    
    
    
    
}
