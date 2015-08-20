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
public class Gato extends Animal implements AnimalDomestico{

    public Gato(int numPatas) {
        super(numPatas);
    }
    
    @Override
    public void caminar() {
        System.out.println("camino en cuatro patas");
    }

    @Override
    public void comer() {
        System.out.println("como whiskas");
    }

    @Override
    public void jugar() {
        System.out.println("juego con la bolita de estambre");
    }
    
}
