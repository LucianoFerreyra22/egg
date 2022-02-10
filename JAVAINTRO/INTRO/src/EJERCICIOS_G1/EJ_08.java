/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. equals(String str)
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner leer= new Scanner(System.in);  
       System.out.println("ingresa una linda frase: ");
       String frase1= leer.next();
   
    Scanner leer2= new Scanner(System.in);  
       System.out.println("ingresa una linda frase: ");
       String frase2 = leer2.next();
   // String cadena1;
   //String cadena2;
       
    //cadena1= "eureka";
   // cadena2= "eureka2";
    
       if (frase1.equals(frase2)){
        System.out.println("correcto");  
       }else{
         System.out.println("incorrecto");
    }

    
    }
}