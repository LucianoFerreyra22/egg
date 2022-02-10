
 //*Crear un programa que dado un numero determine si es par o impar.
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     int n1 ;   
                
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 1 num");
        n1 = leer.nextInt();
    

   // if (n1==0) {
     //   System.out.println("n1= "+n1+" es par");
    
    if (n1 %2 == 0){ 
        System.out.println("n1= "+n1+" ES PAR");
   
    } else  {
            System.out.println("n1= "+ n1+" es impar");
    }   

    }

    
}