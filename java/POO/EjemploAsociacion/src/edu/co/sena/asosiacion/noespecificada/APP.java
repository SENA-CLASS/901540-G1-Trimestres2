/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.asosiacion.noespecificada;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido ped1 = new Pedido();
        Producto pro1 =  new Producto();
        
        ped1.setProducto(pro1);
        pro1.setPedido(ped1);
        
        System.out.println(pro1);
        System.out.println(ped1);
        System.out.println(pro1.getPedido());
        System.out.println(ped1.getProducto());
        
        
    }
    
}
