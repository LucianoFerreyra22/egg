/*
 * 19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class EJ_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("ingrese la cantidad de euros");
        double euros = leer.nextDouble();

        System.out.println("la cantidad de euros en dolares son: ");
        cambioDolar(euros);
        System.out.println(cambioDolar(euros));
        
        System.out.println("la cantidad de euros en libras son: ");
        cambioLibras(euros);
        System.out.println(cambioLibras(euros));
    
        System.out.println("la cantidad de euros en yenes son: ");
        cambioYenes(euros);
        System.out.println(cambioYenes(euros));
    
    
    }

    public static double cambioDolar(double euros) {
        return euros * 1.28611;

    }

    public static double cambioYenes(double euros) {
        return euros * 129.852;
    }

    public static double cambioLibras(double euros) {
        return euros * 0.86;

    }
}
