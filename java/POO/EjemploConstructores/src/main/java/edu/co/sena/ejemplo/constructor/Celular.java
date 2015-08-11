/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.constructor;

/**
 *
 * @author hernando
 */
public class Celular {
    private String modelo;
    private String marca;
    private String color;
    private double tamano;
    private double memoria;
    private String sistemaOperativo;
    private double megapixeles;
    
    //constructor generico
    public Celular(){
    }
    
    
    
    //constructor 
    public Celular(String modelo, String marca, String color, double tamano, double memoria, String sistemaOperativo, double megapixeles) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        this.memoria = memoria;
        this.sistemaOperativo = sistemaOperativo;
        this.megapixeles = megapixeles;
    }
    
    

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(double megapixeles) {
        this.megapixeles = megapixeles;
    }
    
    
    
    
}
