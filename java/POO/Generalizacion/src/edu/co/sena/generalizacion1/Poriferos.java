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
public abstract class Poriferos extends Invertebrados {

    @Override
    public void nacer() {
        System.out.println("naci por fecundacion de ovulos");
    }

    @Override
    public void reproducirse() {
        System.out.println("mi reproduccion puede ser sexual o asexual");
    }

    @Override
    public void desplazarse() {
        System.out.println("no me desplazo");
    }

    @Override
    public void comer() {
        System.out.println("me alimento dependiendo de las corrientes acuaticas");
    }

}
