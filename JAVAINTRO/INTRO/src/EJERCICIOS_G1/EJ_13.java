/*
 * 13. Escriba un programa en el cual se ingrese un valor límite positivo,
//y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author LUCIANITO
 */
public class EJ_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n1, n2, suma,maxPositivo, i;   
   
    Scanner leer = new Scanner(System.in);
  
   System.out.println("ingrese el numero max positivo:" );
   maxPositivo= leer.nextInt();             
   

    
    do {
          System.out.println("ingrese n1" );
    n1= leer.nextInt();     
       System.out.println("ingrese n2 " );
    n2= leer.nextInt();     
    
      suma=n1+n2; 
    
      if (suma < maxPositivo){
       System.out.println(suma+" es menor al maximo");}
         i=suma;
     } while(i<maxPositivo) ;
        System.out.println( i+ "supero al max positivo ");
}
}



   
      //  for (i=0; i<=maxPositivo; i++ ){
     //   System.out.println(i);
       //   }
   // }
   // System.out.println("ingrese n1" );
    //n1= leer.nextInt();     
   //    System.out.println("ingrese n2 " );
   // n2= leer.nextInt();     
    
    //suma=n1+n2; 