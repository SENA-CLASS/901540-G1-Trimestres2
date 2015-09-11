/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caballo caballito1 = new Caballo(new  Cerebro(), new Corazon(10, 2, 61), new Higado(), new Pulmon(), new Pulmon());
//        caballito1.getCorazon().setLatidos(60);
//        caballito1.getCorazon().setPeso(3);
//        caballito1.getCorazon().setTamano(15);
        
        
        System.out.println(caballito1.getCorazon().getLatidos());
        System.out.println(caballito1.getCorazon().getPeso());
        System.out.println(caballito1.getCorazon().getTamano());
        
        
        Cerebro c1 = new Cerebro();
        Corazon cor1 = new Corazon();
        Higado h1 = new Higado();
        Pulmon pul1 = new Pulmon();
        Pulmon pul2 = new Pulmon();
        
        Caballo caballito2 = new Caballo(c1, cor1, h1, pul2, pul2);
        
        caballito1.setMontura(new Montura());
        
        
        
        
    }
    
}
