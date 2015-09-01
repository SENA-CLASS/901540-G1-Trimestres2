/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.asociacion.muchos1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nino nino1 = new Nino();
        nino1.setNombre("jose");
        Nino nino2 = new Nino();
        nino2.setNombre("pedrito");
        Nino nino3 = new Nino();
        nino3.setNombre("pablito");
        Nino nino4 = new Nino();
        nino4.setNombre("valentina");
        Nino nino5 = new Nino();
        nino5.setNombre("dayana");
        
        
        Perro perro1 = new Perro();
        
        Collection<Nino> listaa = new ArrayList();
        listaa.add(nino1);
        listaa.add(nino2);
        listaa.add(nino3);
        listaa.add(nino4);
        listaa.add(nino5);
        
        
        
        Jardin jardin = new Jardin();
        jardin.setNinos(listaa);
        
        Collection<Nino> lista2 = jardin.getNinos();
        
        for (Nino listaa1 : lista2) {
            System.out.println(listaa1.getNombre());
            }
        
        
        
    }
    
}
