/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.app;

import edu.co.sena.generalizacion1.AguilaMacho;
import edu.co.sena.generalizacion1.Animal;
import edu.co.sena.generalizacion1.Mamifero;
import edu.co.sena.generalizacion1.Perro;
import edu.co.sena.generalizacion1.PerroHembra;
import edu.co.sena.generalizacion1.PerroMacho;
import edu.co.sena.generalizacion1.Vertebrados;

/**
 *
 * @author hernando
 */
public class AnimalesPolimorficosAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("este es un perro hembra construido a partir de la  clase animal");
        Animal animal1 = new PerroHembra();
        System.out.println(animal1);
        animal1.nacer();
        animal1.comer();
        animal1.desplazarse();
        animal1.respirar();
        animal1.reproducirse();
        animal1.morir();
        System.out.println("-----------------------------------------");
        System.out.println("este es un perro hembra construido a partir de la  clase vertebrado");
        Vertebrados animal1Vertebrado = (Vertebrados) animal1;
        System.out.println(animal1Vertebrado);
        animal1Vertebrado.nacer();
        animal1Vertebrado.comer();
        animal1Vertebrado.desplazarse();
        animal1Vertebrado.respirar();
        animal1Vertebrado.reproducirse();
        animal1Vertebrado.morir();
        System.out.println("-----------------------------------------");
        Mamifero animal1Mamifero = (Mamifero) animal1Vertebrado;
        System.out.println(animal1Mamifero);
        animal1Mamifero.nacer();
        animal1Mamifero.comer();
        animal1Mamifero.desplazarse();
        animal1Mamifero.respirar();
        animal1Mamifero.reproducirse();
        animal1Mamifero.morir();
        System.out.println("-----------------------------------------");
        
        Perro animal1Perro = (Perro) animal1Mamifero;
        System.out.println(animal1Perro);
        animal1Perro.nacer();
        animal1Perro.comer();
        animal1Perro.desplazarse();
        animal1Perro.respirar();
        animal1Perro.reproducirse();
        animal1Perro.setRaza("pitbull");
        animal1Perro.getRaza();
        animal1Perro.morir();
        System.out.println("-----------------------------------------");
       
       PerroHembra perrito1PerroHembra = (PerroHembra)animal1Perro;
        System.out.println(perrito1PerroHembra);
        perrito1PerroHembra.nacer();
        perrito1PerroHembra.comer();
        perrito1PerroHembra.desplazarse();
        perrito1PerroHembra.respirar();
        perrito1PerroHembra.reproducirse();
        perrito1PerroHembra.criar();
        perrito1PerroHembra.morir();
       System.out.println("-----------------------------------------");
        
        
        
    }
    
}
