/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author hernando
 */
public abstract class Animal {
    private double peso;
    
    public void nacer(){
        System.out.println("naci por parto");
    }
    
    public abstract void morir();
    
    public void alimentar(){
        System.out.println("comiendo");
    }
    
    public void defecar(){
        System.out.println("estoy hechandome una fulca");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
