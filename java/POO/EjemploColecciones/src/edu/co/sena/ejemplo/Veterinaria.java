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
public class Veterinaria {
    List<Perro> perros = new ArrayList<>();
    
    
    public void hospitalizar(Perro perro){
    perros.add(perro);
    }
    
    public void darDeAlta(int numeroPerro){
        if(numeroPerro<perros.size())
            perros.remove(numeroPerro);
        else
            System.out.println("perro selecccionado no exite para dar de alta");
    }
    
    public void listarPerros(){
    
        for (Perro perro : perros) {
            System.out.println(perro.getNombre());
            System.out.println(perro.getRaza());
        }
    
    }
    
    
    
}
