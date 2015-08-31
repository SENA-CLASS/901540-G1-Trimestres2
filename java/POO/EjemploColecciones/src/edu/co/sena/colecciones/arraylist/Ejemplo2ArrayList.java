/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.colecciones.arraylist;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Ejemplo2ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterable lista1 = new ArrayList();//no la usaria por que no tienes metodos no sirve como coleccion
        Collection lista2 = new ArrayList(); // sirve pero tienen solo los metodos basicos de la interface Collection
        List lista3 = new ArrayList();// tiene los metodo de la interface List
        ArrayList lista4 = new ArrayList();//tiene los metodos de la clase ArrayList pero no cumple con el principio de interfaces 
        AbstractList lista5 = new ArrayList();//se puede usar pero no comple con el principio de interfaces
        AbstractCollection lista6 = new ArrayList();//se puede pero no cumple con rl princiipo de interfaces
        
        Serializable lista7 = new ArrayList();
        
        
    }
    
}
