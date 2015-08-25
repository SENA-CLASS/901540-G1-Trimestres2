/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.contenida.ejemplo2;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Madre mujercita = new Madre();
        System.out.println(mujercita);
        Madre.Feto hijoNoNacido = (Madre.Feto)mujercita.gestacion();
        System.out.println(hijoNoNacido);
        
        Hijo ninoNacido = (Hijo)hijoNoNacido;
        System.out.println(ninoNacido);
        
        Mujer mujerNoEmbarazada = (Madre) mujercita;
        System.out.println(mujerNoEmbarazada);
        
        
        
        
        
    }
    
}
