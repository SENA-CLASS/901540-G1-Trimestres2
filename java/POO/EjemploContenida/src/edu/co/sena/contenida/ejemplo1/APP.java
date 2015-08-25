/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.contenida.ejemplo1;

import java.util.ArrayList;
import java.util.Collection;
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
        ClaseA primerClase = new ClaseA();
        ClaseA.ClaseB segundoClase = primerClase.new ClaseB();
        
        System.out.println(primerClase);
        System.out.println(segundoClase);
        
        Collection lista = new ArrayList();
        
    }
    
}
