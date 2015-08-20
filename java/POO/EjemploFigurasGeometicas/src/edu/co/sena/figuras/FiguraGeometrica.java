/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.figuras;

/**
 *
 * @author hernando
 */
public abstract class FiguraGeometrica {
    private double area;

    public double getArea() {
        return area;
    }
    
    
    
    public abstract double calculoArea();

    protected void setArea(double area) {
        this.area = area;
    }
    
}
