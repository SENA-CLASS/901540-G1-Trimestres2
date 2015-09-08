/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.tostring;

/**
 *
 * @author hernando
 */
public abstract class Moto {
    private int rueda;
    private String color;
    private String marca;

    public int getRueda() {
        return rueda;
    }

    public void setRueda(int rueda) {
        this.rueda = rueda;
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
    protected String referencia() {
        return "estoy en la clase MOTO";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String arrancar(){
    return "arranco por combustion";
    }
    

    @Override
    public String toString() {
        return "Moto{" + "rueda=" + rueda + ", color=" + color + ", marca=" + marca + '}';
    }
    
    
}
