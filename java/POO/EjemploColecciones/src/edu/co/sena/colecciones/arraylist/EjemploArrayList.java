/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.colecciones.arraylist;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


/**
 *
 * @author hernando
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        
        Perro perro1 = new Perro();
        perro1.setColor("negro");
        perro1.setRaza("dobermang");
        Perro perro2 = new Perro();
        perro2.setColor("blanco");
        perro2.setRaza("dobermang");
        
        lista1.add(perro1);
        lista1.add(perro2);
        
        
        for (Object lista11 : lista1) {
            System.out.println(lista11.toString());
        }
        
        
        Collection lista10 = new Vector();
        Collection lista11 = new Stack<>();
        
        
        
        
    }
    
}
