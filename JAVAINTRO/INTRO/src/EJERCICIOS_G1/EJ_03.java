/*
 *3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);  
        System.out.print("ingresa una linda frase: ");
       String frase= leer.next();
        
       System.out.println(frase.toUpperCase());  
    
       System.out.println(frase.toLowerCase());
    }
    
}
