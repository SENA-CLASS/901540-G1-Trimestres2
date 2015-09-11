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
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        prod1.setIdProducto("0001");
        prod1.setMarca("Arroz Flor Huila");
        prod1.setPrecio(1200);
        prod1.setCantidad(2000);
        prod1.setDescripcion("libra, granos perfectamente seleccionados");
        Producto prod2 = new Producto();
        prod2.setIdProducto("0002");
        prod2.setMarca("Leche Alpina");
        prod2.setPrecio(2400);
        prod2.setCantidad(500);
        prod2.setDescripcion("cc 1000, pasteurizada, entera, deslactoada, etc, etc");

        Item i1 = new Item(prod1, 5);
        Item i2 = new Item(prod2, 3);

        Pedido ped1 = new Pedido();
        ped1.agregarItem(i1);
        ped1.agregarItem(i2);

        Factura fact1 = new Factura(ped1, 1);
        
        prod1.setPrecio(1500);
        
        System.out.println("Factura");
        System.out.println("numero facura: " + fact1.getNumeroFactura());
       
        System.out.println("Productos de la factura");
        for (Item i : fact1.getPedido().getItems()) {
            System.out.println("Nombre Producto"+i.getProducto().getMarca()+"CANTIDAD: "+ i.getCantidad()+" Precio: "+i.getPrecio()+" Precio Total: "+i.getPrecioTotal());
        }
         System.out.println("Total FActura: " + fact1.getTotal());
    }

}
