/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

/**
 *
 * @author hernando
 */
public class Corazon {
    private double tamano;
    private double peso;
    private int latidos;

    public Corazon() {
    }

    public Corazon(double tamano, double peso, int latidos) {
        this.tamano = tamano;
        this.peso = peso;
        this.latidos = latidos;
    }
    
    

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getLatidos() {
        return latidos;
    }

    public void setLatidos(int latidos) {
        this.latidos = latidos;
    }
    
    
}
