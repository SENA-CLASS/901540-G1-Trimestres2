/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.realizacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalDomestico animal1 = new Gato(4);
        
        AnimalDomestico animal2 = new Pez();
       
        AnimalDomestico animal3 = new Leon(4);
        
        AnimalSalvaje  animal4 = new Leon(4);
        
        Animal animal5 = new Gato(4);
        
        Animal animal6 = new Leon(4);
        Animal animal7 = new Pez();
        
        Animal animal8 = (Animal) animal1;
        
        
        
        
        
        
        
    }
    
}
