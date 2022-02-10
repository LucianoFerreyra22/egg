/*
 * 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package g2javapoo;

import Entidades.Libro;
import Servicios.LibroServicio;



/**
 *
 * @author Marisel
 */
public class G2JAVAPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LibroServicio Ls = new LibroServicio();
    Libro l1= Ls.DatosDeEntrada();
    Ls.DatosDeSalida(l1); 
    }
    
}
