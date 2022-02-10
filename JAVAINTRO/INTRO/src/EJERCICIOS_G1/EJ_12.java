/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int nota;   
                
   Scanner leer = new Scanner(System.in);
   
  
 
   
   do {
      System.out.println("ingrese la nota: " );
   nota= leer.nextInt(); 
      if (nota>10 || nota<0){
       System.out.println("la nota es incorrecta ingrese otra");}
   } while(nota>10 || nota<0) ;
        System.out.println("la nota es valida ");
        
       // System.out.println("la nota es valida");
        //System.out.println("");
 }
   }
