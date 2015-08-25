/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofigurasgeometicas;

import edu.co.sena.figuras.fig2d.Cuadrado;
import edu.co.sena.figuras.fig2d.CuadradoImpl;

/**
 *
 * @author hernando
 */
public class EjemploFigurasGeometicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creacion de objetos sin uso de interfaces
        CuadradoImpl fg1 = new CuadradoImpl(4, 5);
        System.out.println(fg1.getArea());
        System.out.println(fg1.getLadoA());
        System.out.println(fg1.getLadoB());
        System.out.println(fg1.getPerimetro());
        fg1.setLadoA(3);
        System.out.println("1 "+fg1.getArea());
        System.out.println(fg1.getLadoA());
        System.out.println(fg1.getLadoB());
        System.out.println(fg1.getPerimetro());
        
            CuadradoImpl fg2 = new CuadradoImpl("44", "50.6");
        System.out.println(fg2.getArea());
        System.out.println(fg2.getLadoA());
        System.out.println(fg2.getLadoB());
        System.out.println(fg2.getPerimetro());
        
        //creo el objeto a partir de la interface
        Cuadrado fg3 = new CuadradoImpl(3, 3);
        System.out.println(fg3.getLadoA());
        System.out.println(fg3.getLadoB());
        System.out.println(fg3.getArea());
        System.out.println(fg3.getPerimetro());
        
        
    
    }
    
}
