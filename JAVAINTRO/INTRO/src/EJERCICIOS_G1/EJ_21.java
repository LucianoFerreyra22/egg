/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
*pida al usuario un numero a buscar en el vector. El programa mostrará donde se
*encuentra el numero y si se encuentra repetido
 */
package EJERCICIOS_G1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
         Random aleatorio = new Random();
         
        int n1 = aleatorio.nextInt(100);
        System.out.println(n1);
        
    }
    
}
