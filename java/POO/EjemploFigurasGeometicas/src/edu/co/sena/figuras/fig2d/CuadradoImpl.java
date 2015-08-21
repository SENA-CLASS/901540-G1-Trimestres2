/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.figuras.fig2d;

/**
 *
 * @author hernando
 */
public class CuadradoImpl extends Figura2d implements Cuadrado{
    private double ladoA;
    private double ladoB;

    public CuadradoImpl(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public CuadradoImpl(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public CuadradoImpl(long ladoA, long ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    public CuadradoImpl(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public CuadradoImpl(String ladoA, String ladoB) {
        this.ladoA = Double.parseDouble(ladoA);
        this.ladoB = Double.parseDouble(ladoB);
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }

    @Override
    public final double calculoArea() {
        return this.ladoA*this.ladoB;
    }

    @Override
    public final double calculoPerimetro() {
        return 2*this.ladoA+2*this.ladoB;
    }

    
    
}
