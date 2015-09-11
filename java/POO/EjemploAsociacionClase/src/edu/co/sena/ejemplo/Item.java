/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo;

/**
 *
 * @author hernando
 */
public class Item {
    private Producto producto;
    private int cantidad;
    private double precio;
    private double precioTotal;

    public Item(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio=this.producto.getPrecio();
        this.precioTotal=this.cantidad*this.precio;
        this.producto.setCantidad(this.producto.getCantidad()-cantidad);
    }
    
    

    public Producto getProducto() {
        return producto;
    }
    
   
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Item{" + "producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + ", precioTotal=" + precioTotal + '}';
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
