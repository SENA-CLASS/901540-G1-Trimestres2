/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.abstracta;

/**
 *
 * @author hernando
 */
public abstract class Mamifero {
    //las clases abstractas pueden llevar metodos abstractos y metodos con cuerpo
    
    //metodo tiene cuerpo
    public void nacer(){
        System.out.println("");
    }
    
    // los meteodos abstractos no llevan cuerpo llevan un punto y coma
    public abstract void desplazarce();
    
    public void mori(){
        System.out.println("me mori");
    }
    
    
    
}
