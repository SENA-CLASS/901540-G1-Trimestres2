/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author hernando
 */
public abstract class Perro extends Mamifero{
    private String organoReproductor;
    
    public void orinar(){
        System.out.println("alzo la pata y chisssssssss");
    }
    
    public void ladrar(){
        System.out.println("guau guau");
    }

    @Override
    public void alimentar() {
        System.out.println("como purina dog show");
    }
    
    

    public String getOrganoReproductor() {
        return organoReproductor;
    }

    public void setOrganoReproductor(String organoReproductor) {
        this.organoReproductor = organoReproductor;
    }
}
