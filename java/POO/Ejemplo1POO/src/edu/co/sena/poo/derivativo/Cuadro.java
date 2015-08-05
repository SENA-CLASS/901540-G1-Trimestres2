/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.derivativo;

/**
 *
 * @author hernando
 */
public class Cuadro {
    private double alturaCuadro;
    private double area;
    private double perimetro;
    private double base;

    public Cuadro(double altura, double base) {
        this.alturaCuadro = altura;
        this.base = base;
        this.area = altura*base;
        this.perimetro= 2*base+2*altura;
    }
    
    
    
    @Override
    public String toString() {
        return "Cuadro{" + "altura=" + alturaCuadro + ", area=" + area + ", perimetro=" + perimetro + ", base=" + base + '}';
    }

    public void setAltura(double altura) {
        this.alturaCuadro = altura;
        this.area = altura*base;
        this.perimetro= 2*base+2*altura;
    }

    public void setBase(double base) {
        this.base = base;
        this.area = alturaCuadro*base;
        this.perimetro= 2*base+2*alturaCuadro;
    }
    
    
    
    
}
