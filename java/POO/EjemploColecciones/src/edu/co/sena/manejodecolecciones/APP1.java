/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.manejodecolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author hernando
 */
public class APP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> lista1 = new ArrayList();
        List<String> lista2 = new ArrayList();
        lista2.add("uno");//0
        lista2.add("dos");//1
        lista2.add("tres");//2
        lista2.add("cinco");//3
        lista2.add("cuatro");//4
        
        lista1 = lista2;
        lista1.add("cien");
        System.out.println(lista1.hashCode());
        System.out.println(lista2.hashCode());
        
        if(lista1.equals(lista2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }
        
        
    }
    
}
