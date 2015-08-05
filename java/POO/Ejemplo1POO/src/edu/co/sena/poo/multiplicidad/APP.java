/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.multiplicidad;

import java.util.Arrays;
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
        Balon b1 = new Balon();
        b1.setColor("rojo");
        b1.setMarca("Adidas");
        b1.setPrecio(40000);
        b1.setRadio(20);
        Balon b2 = new Balon();
        b2.setColor("rojo");
        b2.setMarca("Nike");
        b2.setPrecio(40000);
        b2.setRadio(20);
        Balon b3 = new Balon();
        b3.setColor("rojo");
        b3.setMarca("Gado");
        b3.setPrecio(40000);
        b3.setRadio(20);
        Balon b4 = new Balon();
        b4.setColor("rojo");
        b4.setMarca("Aguila");
        b4.setPrecio(40000);
        b4.setRadio(20);
        
        Canasta ca1 = new Canasta(6);
        ca1.agregarBalonCanasta(b1);
        ca1.agregarBalonCanasta(b2);
        ca1.agregarBalonCanasta(b3);
        ca1.agregarBalonCanasta(b4);
        
        System.out.println(ca1.getCanastaBalones()[0].toString());
        System.out.println(ca1.getCanastaBalones()[1].toString());
        System.out.println(ca1.getCanastaBalones()[2].toString());
        System.out.println(ca1.getCanastaBalones()[3].toString());
        System.out.println(ca1.getCanastaBalones()[4].toString());
       // System.out.println(ca1.getCanastaBalones()[5].toString());
        
        
        
        
    }
    
}
