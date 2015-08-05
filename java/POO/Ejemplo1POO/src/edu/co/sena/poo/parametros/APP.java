/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.poo.parametros;

/**
 *
 * @author hernando
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e=2;
        int y=10;
        //llamado de metodos
        
        APP ap = new APP();
        
        int resultado=ap.suma(e,y);
        System.out.println(resultado);
    }
    
    
    public int suma(int a, int b){
        return a+b;
    }
    
}
