/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejmplo.constructor;

/**
 *
 * @author ;
 */
public class BombilloAhorrador extends Bombillo{
    String color;
    
    //sobrecarga de constructores
    public BombilloAhorrador(String marca, double voltaje, double corriente){
        
    super(marca, voltaje, corriente);
    System.out.println("contructor 1 de bonbillo ahorrador");
    }
    public BombilloAhorrador(String marca, double voltaje, double corriente, int a){
    super(marca, voltaje, a);
    System.out.println("contructor 2 de bonbillo ahorrador");
    }
    
    public BombilloAhorrador(String marca, String voltaje, String corriente){
    super(marca, voltaje, corriente);
    System.out.println("contructor 3 de bonbillo ahorrador");
    }
    
    public BombilloAhorrador(String marca, double voltaje, double corriente, String color){
    super(marca, voltaje, corriente);
    this.color= color;
    System.out.println("contructor 4 de bonbillo ahorrador");
    }
    
    
    
    
}
