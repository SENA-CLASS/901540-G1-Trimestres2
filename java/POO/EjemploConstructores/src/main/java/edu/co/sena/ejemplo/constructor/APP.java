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
public class APP {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.setModelo("samsung galaxy s6");
        System.out.println(cel1.getModelo());
        
        Celular cel2 = new Celular("S6", "Samsung", "negro", 4.5, 24, "Android", 10);
        
        System.out.println(cel2.getModelo());
        System.out.println(cel2.getColor());
        System.out.println(cel2.getMarca());
        System.out.println(cel2.getSistemaOperativo());
        
        
        
        
    }
}
