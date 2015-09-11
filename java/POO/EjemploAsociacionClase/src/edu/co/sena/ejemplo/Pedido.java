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
public class Pedido {
    private List<Item> items;
    private double precioTotal=0;

    public Pedido() {
        this.items = new ArrayList<>();
    }
    
    public  void agregarItem(Item i){
        items.add(i);
        this.precioTotal+=i.getPrecioTotal();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    
    
    
    
}
