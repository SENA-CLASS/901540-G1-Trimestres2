/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejmplo.constructor;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bombillo b1 = new Bombillo("marca pollito", "120", "10");
        System.out.println(b1.toString());
        
        BombilloAhorrador ba1 = new BombilloAhorrador("marca pollito", "120", "10");
        System.out.println(ba1.toString());
        
        
        BombilloAhorrador ba2 = new BombilloAhorrador("panasonic", 120.2, 2.0, 6);
        BombilloAhorrador ba3 = new BombilloAhorrador("panasonic", "34234", "122");
    }
    
}
