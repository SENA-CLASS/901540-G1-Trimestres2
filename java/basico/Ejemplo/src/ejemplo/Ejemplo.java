/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author hernando
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, posicion=0;
        int[] arreglo = new int[10];
        for (int i = 100; i <= 300; i++) {
            cont=0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0) {
                    cont++;
                }
            }
            if(cont==2){
                if(posicion==10){
                    break;
                }
            arreglo[posicion]=i;
            posicion++;
            }
            
        }
       
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
