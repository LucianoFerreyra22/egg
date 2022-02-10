/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n; 
     // double raiz;  
                
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 1 numerito ");
        n = leer.nextInt();
        double raiz=  Math.sqrt(n);   
        System.out.println("el doble de n es: "+ n*2 );
        System.out.println("el triple de n es: "+ n*3 );
        System.out.println("la raiz cuadrada es: "+ Math.sqrt(n));
   // doble raiz =Math.sqrt(n);
    }
    
}
