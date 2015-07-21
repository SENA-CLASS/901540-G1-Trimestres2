/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.arreglos.unadimension;

/**
 *
 * @author hernando
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar un arreglo y inicializarlo
        int[] arreglo1 = new int[10];
        short[] arreglo2 = new short[10];
        long[] arreglo3 = new long[10];
        byte[] arreglo4 = new byte[10];
        
        float[] arreglo5 = new float[10];
        double[] arreglo6 = new double[10];
        
        char[] arreglo7 = new char[10];
        
        //arreglos de tipo referencia
        
        Persona[] arregloPersonas = new Persona[15];
        
        
        
        
        System.out.println(arreglo1);//aca podemos ver que el arreglo en java se transforma en un tipo referencia
    }
    
}
