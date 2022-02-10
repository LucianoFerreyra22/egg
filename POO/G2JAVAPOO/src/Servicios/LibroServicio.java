/*
 *  1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 */
public class LibroServicio {

    public Libro DatosDeEntrada() {

        Libro l1 = new Libro();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBM");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese titulo");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese Autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese Numero de paginas");
        l1.setNumeroDePagina(leer.nextInt());
        return l1;
    }

    public void DatosDeSalida(Libro l1) {
        System.out.println("el ISBM ES: " + l1.getISBN());
        System.out.println("el TITULO ES: " + l1.getTitulo());
        System.out.println("el autor ES: " + l1.getAutor());
        System.out.println("el numero de paginas ES: " + l1.getNumeroDePagina());
      
}
}