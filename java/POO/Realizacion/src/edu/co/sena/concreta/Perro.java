/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.concreta;

import edu.co.sena.abstracta.Mamifero;
import edu.co.sena.interfaces.PerroCiego;
import edu.co.sena.interfaces.PerroMocho;

/**
 *
 * @author hernando
 */
public class Perro extends Mamifero implements PerroCiego, PerroMocho{
    private String raza;
    private String color;
    private int edad;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void desplazarce() {
        System.out.println("soy cuadrupedo");
    }
    
   //public abstract void morir(); no se puede hacer agregar un metodo abstracto a una clase concreta

    @Override
    public void comer() {
        System.out.println("soy omnivoro");
    }

    

    @Override
    public void ladrar() {
        System.out.println("guau guau");
    }

    @Override
    public void morir() {
        System.out.println("me mori");
    }

    @Override
    public void ver() {
        System.out.println("veo gracias a dios");
    }
    
}
