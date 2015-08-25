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
public class Madre implements Mujer{
    
    public Hijo gestacion(){
    return new Feto();
    }
    
    public class Feto implements Hijo{
    
    }
    
    
}
