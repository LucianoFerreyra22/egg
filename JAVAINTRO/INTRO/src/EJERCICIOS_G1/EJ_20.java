/*
 * Funciones en Java
*20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
*los muestre por pantalla en orden descendente

 */
package EJERCICIOS_G1;

import java.util.Scanner;



/**
 *
 * @author Marisel
 */
public class EJ_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    //crearlo 
    //ordenarlo
    // imprimirlo
        Scanner leer = new Scanner(System.in);
        int arreglo[] = new int[100] ;
        
        for (int i=0 ; i<=100; i++)  {
            System.out.println(i);
    }    
        for (int i=100 ; i>=1; i--)  {
            System.out.println(i);
}
}
}