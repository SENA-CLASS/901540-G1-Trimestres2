/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Computaodor {

   private List<UnidadDVD> unidadesExternas;
   private static final int CANTIDAD_UNIDADES =6;
   private int cantidadUnidadesActual=0;

    public Computaodor() {
        unidadesExternas= new ArrayList<>();
    }
   
   
   
   public void agregarUnidad(UnidadDVD u){
       if(this.cantidadUnidadesActual<Computaodor.CANTIDAD_UNIDADES){
       unidadesExternas.add(u);
       this.cantidadUnidadesActual++;
       }
   }

    public List<UnidadDVD> getUnidadesExternas() {
        return unidadesExternas;
    }
   
    public void eliminarUnidad(UnidadDVD u){
        List<UnidadDVD> lt = new ArrayList<>();
        lt.addAll(this.unidadesExternas);
        for (UnidadDVD unidadesExterna : lt) {
            if(unidadesExterna.compareTo(u)==0){
                this.unidadesExternas.remove(unidadesExterna);
            }
        }
        
    }
   
    
}
