/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author duvan
 */
public abstract class Reptiles extends Vertebrados {

    @Override
    public void nacer() {
        System.out.println("naci de un huevo");
    }

    @Override
    public void reproducirse() {
        System.out.println("mi reproduccion es sexual");
    }

    @Override
    public void desplazarse() {
        System.out.println("me desplazo bajo el agua y en la superficie");
    }

}
