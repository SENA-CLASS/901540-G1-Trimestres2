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
public class Cuadrado extends Figura2d{
    private double ladoA;
    private double ladoB;

    public Cuadrado(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public Cuadrado(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public Cuadrado(long ladoA, long ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    public Cuadrado(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(this.calculoArea());
        this.setPerimetro(this.calculoPerimetro());
    }
    
    public Cuadrado(String ladoA, String ladoB) {
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
