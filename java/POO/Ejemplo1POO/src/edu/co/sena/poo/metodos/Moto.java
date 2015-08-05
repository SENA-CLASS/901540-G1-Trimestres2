/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.metodos;

/**
 *
 * @author hernando
 */
public class Moto {

    String marca;
    String color;
    String moto;
    private double velocidad = 0;
    String modelo;
    private int cambio;
    double aceleracion;
    double gasolina;
    Rueda[] ruedas = new Rueda[2];

    public Moto() {
    }
    
    

    public Moto(String marca, String color, String modelo, Rueda r1, Rueda r2) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.ruedas[0] = r1;
        this.ruedas[1] = r2;
    }

    public void encender() {
        this.velocidad = 0;
        System.out.println("moto prendida RUN RUN");
    }

    public void apagar() {
        this.velocidad = 0;
        System.out.println("moto apagada SHHHHH SHHHHH");
    }

    public void acelerar(int acelerador) {
        switch (acelerador) {
            case 1:
                this.velocidad = 10;
                this.cambio = 1;
                break;
            case 2:
                this.velocidad = 20;
                this.cambio = 2;
                break;
            case 3:
                this.velocidad = 30;
                this.cambio = 3;
                break;
            case 4:
                this.velocidad = this.velocidad + 10;
                this.cambio = 4;
                break;
            default:
                System.out.println("esta moto solo tiene 4 cambios");
        }

    }

    public void desacelerar() {
        switch (this.cambio) {
            case 1:
                this.velocidad = 0;
                this.cambio = 0;
                break;
            case 2:
                this.velocidad = 10;
                this.cambio = 1;
                break;
            case 3:
                this.velocidad = 20;
                this.cambio = 2;
                break;
            case 4:
                this.velocidad = 30;
                this.cambio = 3;
                break;
            default:
                System.out.println("esta moto solo tiene 4 cambios");
        }

    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getCambio() {
        return cambio;
    }
    
    

}
