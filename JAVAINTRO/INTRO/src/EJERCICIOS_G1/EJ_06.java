/*
 * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int n1, n2, dato=5;   
                
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numerito ");
        n1 = leer.nextInt();
         System.out.println("ingrese numerito ");
        n2 = leer.nextInt();
        
        if (n1 > n2){ 
            System.out.println("n1= "+n1+" es mayor que n2= "+n2+".");
        }
            else {
            System.out.println("n2= "+ n2+" es mayor que n1= "+ n1 + " .");
        }
    
            
    }
}
