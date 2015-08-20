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
public class Leon extends Animal implements AnimalDomestico, AnimalSalvaje{

    public Leon(int numPatas) {
        super(numPatas);
    }
    
    @Override
    public void caminar() {
        System.out.println("camino en cuatro patas");
    }

    @Override
    public void comer() {
        System.out.println("soy carnivoro");
    }

    @Override
    public void jugar() {
        System.out.println("juega a clavarle la muela");
    }

    @Override
    public void cazar() {
        System.out.println("cazo animalespara comer y sobrevivir");
    }

    @Override
    public void atacar() {
        System.out.println("ataco por instinto");
    }
    
}
