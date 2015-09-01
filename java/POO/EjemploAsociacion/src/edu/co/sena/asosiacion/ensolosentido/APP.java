/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.asosiacion.ensolosentido;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dulce dul1 = new Dulce();
        Envoltura env1 = new Envoltura();
        env1.setDulce(new Dulce());
        
        System.out.println(env1);
        System.out.println(dul1);
        System.out.println(env1.getDulce());
        
        Envoltura env2 = new Envoltura();
        env2.setDulce(env1.getDulce());
        env1.setDulce(null);
        
        
        
        
    }
    
}
