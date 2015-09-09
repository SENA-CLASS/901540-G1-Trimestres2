/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

import java.util.List;

/**
 *
 * @author hernando
 */
public class Caballo {
    private Cerebro cerebro;
    private Corazon corazon;
    private Higado higado;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private List<Herradura> herraduras;
    private Montura montura;

    public Caballo(Cerebro cerebro, Corazon corazon, Higado higado, Pulmon pulmonIzquierdo, Pulmon pulmonDerecho) {
        this.cerebro = cerebro;
        this.corazon = corazon;
        this.higado = higado;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.pulmonDerecho = pulmonDerecho;
    }

    public List<Herradura> getHerraduras() {
        return herraduras;
    }

    public void setHerraduras(List<Herradura> herraduras) {
        this.herraduras = herraduras;
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Higado getHigado() {
        return higado;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }
    
    
    
         
}
