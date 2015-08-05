/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.visibilidad;

/**
 *
 * @author hernando
 */
public class Perro {
    public String raza; 
    String color; 
    private char sexo = 'f';//primera opcion para colocar un atributo con un valor por defecto o DEFAULT     
    protected String tamano; 
    private int edad; 

    public Perro() {
        this.edad=1;// segunda forma para colocar un atributo cono default
    }
    
    
    
    public void cambiarSexo(char sexo){
    this.sexo= sexo;
    
    }
    
    public char verSexo(){
    return this.sexo;
    }
    
    
}
