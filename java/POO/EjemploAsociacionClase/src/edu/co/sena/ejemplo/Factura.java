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
public class Factura {
    private Pedido pedido;
    private int numeroFactura;
    private double total;

    public Factura(Pedido pedido, int numeroFactura) {
        this.pedido = pedido;
        this.numeroFactura = numeroFactura;
        this.total=this.pedido.getPrecioTotal()*1.16;
        
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }
    
    

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
