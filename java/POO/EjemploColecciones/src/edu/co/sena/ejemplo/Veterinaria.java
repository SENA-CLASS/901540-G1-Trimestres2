/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Veterinaria{
    private List<Perro> perros;
   

    public Veterinaria() {
       perros = new ArrayList();
    }
    
    
    
    public void hospitalizar(Perro perro){
    perros.add(perro);
    }
    
    public void darDeAlta(int numeroPerro){
        if(numeroPerro>=0 && numeroPerro<perros.size())
            perros.remove(numeroPerro);
        else
            System.out.println("perro selecccionado no exite para dar de alta");
    }
    
    public void darDeAlta(Perro perro){
        int indiceBorrar=-1, indice=0;
        for (Perro listaPerros : perros) {
            
            if(listaPerros.compareTo(perro)==0){
                System.out.println("doy de alta al perro en la posicion "+ indice);
                indiceBorrar=indice;
            }
            indice++;
        }
        this.darDeAlta(indiceBorrar);
    }
    
    public void listarPerros(){
    
        for (Perro perro : perros) {
        
            System.out.println(perro.getIdPerro());
            System.out.println(perro.getNombre());
            
        }
    
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }
    
    
    
}
