/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int centigrados, farenheit;   
                
   Scanner leer = new Scanner(System.in);
 
   System.out.println("ingrese cantidad de grados de calor que tiene usted, yo se lo traduzco a grados farenheit. Porque puedo ");
   centigrados = leer.nextInt();
   farenheit = 32 + (9 *centigrados /5);
   System.out.println("Grados en Farenheit: "+ farenheit+" .");  
               
    }
    
}
