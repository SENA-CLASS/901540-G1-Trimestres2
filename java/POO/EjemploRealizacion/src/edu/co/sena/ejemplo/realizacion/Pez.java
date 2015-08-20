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
public class Pez extends Animal implements AnimalDomestico{

 
    @Override
    public void caminar() {
        System.out.println("yo no camino nado");
    }

    @Override
    public void comer() {
        System.out.println("como otros pescados");
    }

    @Override
    public void jugar() {
        System.out.println("no se puede jugar con el pez");
    }
    
}
