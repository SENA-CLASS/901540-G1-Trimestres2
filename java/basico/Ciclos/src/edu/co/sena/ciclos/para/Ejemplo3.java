/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ciclos.para;

/**
 *
 * @author hernando
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int n=0; n<7; n++) {
            {
                System.out.println("in loop: " + n);
                if (n == 2) {
                    continue;
                }
                System.out.println("   survived first guard");
                if (n == 4) {
                    break;
                }
                System.out.println("   survived second guard");
    // continue at head of loop
                
            }
        }
    }
    
}
