/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class EJ_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        
      Scanner leer= new Scanner(System.in);  
      String cadena1;
      System.out.println("ingresa una linda frase de 8 caracteres, ni mas ni menos: ");
      cadena1= leer.next();
        
    if (cadena1.length()==8){
         System.out.println("correcto");
    
    }else
            System.out.println("incorrecto");
    
}

}