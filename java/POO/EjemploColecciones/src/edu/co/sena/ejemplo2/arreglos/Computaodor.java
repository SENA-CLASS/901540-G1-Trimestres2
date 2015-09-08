/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2.arreglos;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class Computaodor {

   private UnidadDVD[] unidadesExternas= new UnidadDVD[CANTIDAD_UNIDADES];
   private static final int CANTIDAD_UNIDADES =6;
   private int cantidadUnidadesActual=0;
   
   
   public void agregarUnidad(UnidadDVD u){
       if(this.cantidadUnidadesActual<Computaodor.CANTIDAD_UNIDADES){
       unidadesExternas[this.cantidadUnidadesActual]=u;
       this.cantidadUnidadesActual++;
       }
   }

    public UnidadDVD[] getUnidadesExternas() {
        return unidadesExternas;
    }
   
    public void eliminarUnidad(UnidadDVD u){
        int con =0;
       UnidadDVD[] arregloTempora = new UnidadDVD[6];
        for (int i = 0; i < this.unidadesExternas.length; i++) {
            if(this.unidadesExternas[i].compareTo(u)==-1){
                arregloTempora[con]=this.unidadesExternas[i];
                con++;
            }
        }
        this.unidadesExternas=arregloTempora;
        
    }
   
    
}
