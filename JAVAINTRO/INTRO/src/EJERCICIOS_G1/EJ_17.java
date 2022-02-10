/*17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 * 
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Por favor ingrese el tamaño del cuadrado: ");
        int n = teclado.nextInt();
       
        //if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
      //  }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 50");
        }
               
 
    }
     