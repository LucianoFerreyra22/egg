
// * 14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
     int suma, intentos,n1 ;   
    intentos= 20;         
    suma=0;
   
   
  
 
   
   do {
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese un numerito: " );
        n1= leer.nextInt(); 
      
        suma= suma+ n1;
        if (n1!= 0 ){
            intentos=intentos-1;}
      // System.out.println(n1);}
          //System.out.println(" ");}
       //   System.out.println(n1);
   } while(n1!= 0) ;    
    System.out.println("se capturo el n=0");
        System.out.println(suma);
}
    

}



   