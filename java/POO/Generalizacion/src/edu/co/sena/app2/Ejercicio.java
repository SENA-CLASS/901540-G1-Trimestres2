/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.app2;

import edu.co.sena.generalizacion1.*;
import edu.co.sena.generalizacion1.PerroHembra;
import edu.co.sena.generalizacion1.PerroMacho;

/**
 *
 * @author hernando
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroHembra perro1 = new PerroHembra();
        perro1.setRaza("Labrador");
        imprimirAnimal(perro1);
    }

    public static void imprimirAnimal(Animal a) {

        if (a instanceof PerroMacho) {
            PerroMacho pt = (PerroMacho) a;
            System.out.println("soy un " + pt.getClass().getCanonicalName());
            System.out.println(pt.getRaza());
            pt.comer();

        } else if (a instanceof PerroHembra) {
              PerroHembra pt = (PerroHembra) a;
             System.out.println("soy un " + pt.getClass().getCanonicalName());
          

        }

    }

}
