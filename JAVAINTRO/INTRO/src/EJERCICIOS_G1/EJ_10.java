/*
 *10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. 
*Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer= new Scanner(System.in);  
      String cadena1;
      System.out.println("ingresa una linda frase que arranque con la letra a, o verás: ");
      cadena1= leer.next();
     System.out.println(cadena1.substring(0,1)); 
     
 if (cadena1.substring(0,1).equals("a")||cadena1.substring(0,1).equals("A")){
         System.out.println("correcto");
}else
      System.out.println("incorrecto");
    
   
}

}
