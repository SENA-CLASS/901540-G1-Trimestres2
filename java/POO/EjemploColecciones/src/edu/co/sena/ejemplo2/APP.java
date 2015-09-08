/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnidadDVD u1 = new UnidadDVD();
        u1.setId("001");
        UnidadDVD u2 = new UnidadDVD();
        u2.setId("002");
        UnidadDVD u3 = new UnidadDVD();
        u3.setId("003");
        UnidadDVD u4 = new UnidadDVD();
        u4.setId("004");
        UnidadDVD u5 = new UnidadDVD();
        u5.setId("005");
        UnidadDVD u6 = new UnidadDVD();
        u6.setId("006");
        UnidadDVD u7 = new UnidadDVD();
        u7.setId("007");
        
        
        Computaodor c1 = new Computaodor();
        c1.agregarUnidad(u1);
        c1.agregarUnidad(u2);
        c1.agregarUnidad(u3);
        c1.agregarUnidad(u4);
        c1.agregarUnidad(u5);
        c1.agregarUnidad(u6);
        c1.agregarUnidad(u7);
        
        UnidadDVD uBorrar = new UnidadDVD();
        uBorrar.setId("002");
        
        c1.eliminarUnidad(uBorrar);
        
        for (UnidadDVD u : c1.getUnidadesExternas()) {
            System.out.println(u);
        }
    }
    
}
