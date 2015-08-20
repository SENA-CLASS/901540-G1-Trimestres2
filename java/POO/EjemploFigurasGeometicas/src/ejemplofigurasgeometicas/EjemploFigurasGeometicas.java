/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofigurasgeometicas;

import edu.co.sena.figuras.fig2d.Cuadrado;

/**
 *
 * @author hernando
 */
public class EjemploFigurasGeometicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado fg1 = new Cuadrado(4, 5);
        System.out.println(fg1.getArea());
        System.out.println(fg1.getLadoA());
        System.out.println(fg1.getLadoB());
        System.out.println(fg1.getPerimetro());
        fg1.setLadoA(3);
        System.out.println("1 "+fg1.getArea());
        System.out.println(fg1.getLadoA());
        System.out.println(fg1.getLadoB());
        System.out.println(fg1.getPerimetro());
        
        Cuadrado fg2 = new Cuadrado("44", "50.6");
        System.out.println(fg2.getArea());
        System.out.println(fg2.getLadoA());
        System.out.println(fg2.getLadoB());
        System.out.println(fg2.getPerimetro());
        
        Integer a =5;
        Integer b =10;
        Integer c = a+b; //aca tranforma a en in int y b en un int luego los sumas y para finalzar el resultado lo transforma en Integer
        Integer d = Integer.sum(a, b);// usa el metodo suma de la clase Integer para hacer la suma sin tranformarlos
        System.out.println(c);
        System.out.println(d);
        
        
    
    }
    
}
