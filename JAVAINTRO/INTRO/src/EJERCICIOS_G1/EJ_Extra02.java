/*
 * TDeclarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *A
 * @author Marisel
 */
public class EJ_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int A, B, C, D, aux;
         Scanner leer= new Scanner(System.in);  
         System.out.println("ingrese 4 valores");
         System.out.println("ingrese 1 nunmerito1 ");
        A = leer.nextInt();
        System.out.println("ingrese 1 nunmerito1 ");
        B = leer.nextInt();
        System.out.println("ingrese 1 nunmerito1 ");
        C = leer.nextInt();
        System.out.println("ingrese 1 nunmerito1 ");
        D = leer.nextInt();
            
  //B=C C=A D=B A=D
   aux=B;
   B=C;
   C=A;
   D=aux ; 
   A=D;
   System.out.println(" los nuevos valres son"+ A)       ;    
      System.out.println(" los nuevos valres son"+ B)       ;              
     System.out.println(" los nuevos valres son"+ C)       ;   
     System.out.println(" los nuevos valres son"+ D)       ;    
    }
    
}
