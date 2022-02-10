/*
 *4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package javapooej4;

import rectanguloEntidades.rectangulo;
import rectanguloServicio.rectanguloServicio;

/**
 *
 * @author Marisel
 */
public class JAVAPOOEJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        rectanguloServicio rS= new rectanguloServicio();
        rectangulo rectangulo1= rS.crearRectangulo();
        rS.superficie(rectangulo1);
        rS.perimetro(rectangulo1);
        
        rS.mostrarRectangulo(rectangulo1);
        
    }
    
}
