/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.multiplicidad;

import edu.co.sena.poo.partesclase.*;

/**
 *
 * @author hernando
 */
public class Balon {
    //atributos
    private double radio;
    private double precio;
    private String color;
    private String marca;
    
    //constructores
    public Balon() {
    }
    
    
    //metodos getters o setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Balon{" + "radio=" + radio + ", precio=" + precio + ", color=" + color + ", marca=" + marca + '}';
    }
    
    
    
    
}
