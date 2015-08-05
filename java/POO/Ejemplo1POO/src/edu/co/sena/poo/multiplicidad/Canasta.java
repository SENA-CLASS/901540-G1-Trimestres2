/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.multiplicidad;

/**
 *
 * @author hernando
 */
public class Canasta {
    private Balon[] canastaBalones ;
    int tamano;
    int posicion;

    public Canasta(int tamano) {
        this.tamano = tamano;
        canastaBalones= new Balon[tamano];
        posicion=0;
    }
    
    
    
    public Balon[] getCanastaBalones() {
        return canastaBalones;
    }

    public void setCanastaBalones(Balon[] canastaBalones) {
        this.canastaBalones = canastaBalones;
    }
    
    public void agregarBalonCanasta(Balon balon){
        canastaBalones[posicion]= balon;
        posicion++;
    }
    
    
}
