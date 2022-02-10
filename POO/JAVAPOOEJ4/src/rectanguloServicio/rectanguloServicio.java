/*
 * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package rectanguloServicio;

import java.util.Scanner;
import rectanguloEntidades.rectangulo;

/**
 *
 * @author Marisel
 */
public class rectanguloServicio {

Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public rectangulo crearRectangulo() {
        System.out.println("ingrese base");
        double base = leer.nextDouble();
        System.out.println("ingrese altura");
        double altura = leer.nextDouble();

        rectangulo rectanguloX = new rectangulo(base, altura);
        return rectanguloX;

    }

    public void superficie(rectangulo rectanguloX) {
        double superficie = rectanguloX.getAltura() * rectanguloX.getBase();
        System.out.println("la superficie es:" + superficie);

    }

    public void perimetro(rectangulo rectanguloX) {
        double perimetro = (rectanguloX.getAltura() + rectanguloX.getBase() * 2);
        System.out.println("la superficie es:" + perimetro);
    }

    public void mostrarRectangulo(rectangulo rectanguloX) {
        for (int i = 0; i< rectanguloX.getAltura();  i++ ){
    for (int j = 0; j < rectanguloX.getBase(); j++) {
            if (i == 0 || 1 == rectanguloX.getBase() - 1) {
                System.out.println("*");
            
            } else {
                if (j == 0 || j == rectanguloX.getAltura() - 1) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println("");
    }

}
}