/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroMacho perrito = new PerroMacho();
        perrito.setPeso(122);
        perrito.defecar();
        perrito.alimentar();
        perrito.ladrar();
        perrito.lantancia();
        perrito.orinar();
        
        perrito.setOrganoReproductor("pene");
        System.out.println(perrito.getOrganoReproductor());
        System.out.println("-----------------------------------------"); 
        PerroHembra perrito2 = new PerroHembra();
        perrito2.nacer();
        perrito2.setOrganoReproductor("vagina");
        System.out.println(perrito2.getOrganoReproductor());
        perrito2.orinar();
        perrito2.parto();
        
    }
    
}
