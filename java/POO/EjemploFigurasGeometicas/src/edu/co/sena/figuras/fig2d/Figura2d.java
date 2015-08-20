/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.figuras.fig2d;

import edu.co.sena.figuras.FiguraGeometrica;

/**
 *
 * @author hernando
 */
public abstract class Figura2d extends FiguraGeometrica{
    private double perimetro;

    public double getPerimetro() {
        return perimetro;
    }

    protected void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public abstract double calculoPerimetro();
    
}
