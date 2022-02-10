package Entidades;

/*
 * 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */

/**
 *
 * @author 
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePagina;

//constructor por defecto 
    public Libro() {

    }
//constructor por parametro 

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePagina = NumeroDePagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePagina() {
        return NumeroDePagina;
    }

    public void setNumeroDePagina(int NumeroDePagina) {
        this.NumeroDePagina = NumeroDePagina;
    }
  

    

    

   
    
}
