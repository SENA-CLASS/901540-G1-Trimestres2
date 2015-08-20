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
public interface InterfaceAnimal {
     public int getNumPatas();

    public void setNumPatas(int numPatas);
    
    public abstract void caminar();
    
    public abstract void comer();
}
