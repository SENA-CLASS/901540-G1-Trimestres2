/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.metodos.mutadores;

/**
 *
 * @author hernando
 */
public class Persona {
    private String nombre;
    private String telefono;
    
    //metodo accesador del atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    
    //metodo mutador del atributo nmbre
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    //metodo accesador del atributo nombre
    public String getTelefono(){
        return this.telefono;
    }
    
    //metodo mutador del atributo nmbre
    public void setTelefono(String telefono){
    this.telefono=telefono;
    }
    
    
    
}
