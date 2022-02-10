
import java.util.Scanner;

/*/Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
-número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
package EJERCICIOS_G1;

/**
 *
 * @author Marisel
 */
public class EJ_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Por favor ingrese n ");

            int n = teclado.nextInt();

            if (n >= 0 && n <= 20) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }

            } else {
                System.out.println("Error. El dato a ingresar: " + n + "estar entre 0 y 20");
            }
            System.out.println(" ");
        }
    }

}
