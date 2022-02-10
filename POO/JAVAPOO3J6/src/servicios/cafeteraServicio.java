/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicios;

import Entidades.cafetera;
import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class cafeteraServicio {
 Scanner leer = new Scanner(System.in);
 private String artr; 
    public cafetera crearCafetera() {

        System.out.println("ingrese capacidad maxima de la cafetera");

        double capacidadMaxima =leer.nextDouble();
   
        return new cafetera(capacidadMaxima,0 );
    }

    public void  ServirCafetera  ( cafetera cafetera) {
        
        System.out.println("ingrese tamaño del recipiente a llenar");
        double recipiente = leer.nextDouble();

        if (recipiente <= cafetera.getCapacidadMaxima()) {
            System.out.println(" su recipiente se ha llenado completamente");
        } else { 
            
            System.out.println("no se logro llenar su recipiente completamente");
        }
        // lo que tiene el recipiente / capacidad actual *100
        
        
    }   
    public void llenarCafetera(cafetera cafetera){ 
     cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
     
        
    }
public void vaciarCafetera(cafetera cafetera){ 
     cafetera.setCapacidadActual(0);
     
        
    }

public void agregarCafe(cafetera cafetera){ 
  
    System.out.println("ingrese un poquito de cafe");
 double cafe = leer.nextDouble(); 
 cafetera.setCapacidadActual(cafetera.getCapacidadActual()+ cafe);
}
}

//método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicad