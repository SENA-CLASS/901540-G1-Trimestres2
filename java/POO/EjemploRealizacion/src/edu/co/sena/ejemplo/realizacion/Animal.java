/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.realizacion;

/**
 *
 * @author hernando
 */
public abstract class Animal implements InterfaceAnimal{
    private int numPatas;

    public Animal(){
    }
    
    public Animal(int numPatas) {
        this.numPatas = numPatas;
    }
    
    
    
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    public abstract void caminar();
    
    public abstract void comer();
    
}
