/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores..
 */
package servicios;

import entidades.PersonaEntidades;
import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonaEntidades crearPersona() {

        System.out.println("ingrese nombre de la persona");
        String nombre = leer.next();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        System.out.println("ingrese sexo");
        String sexo = leer.next();

        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {

            String a = "H";
            String b = "M";
            String o = "O";

        } else {
            System.out.println("ingrese H, M; ú O en caso de ser O");
        }
        {

        }

        System.out.println("ingrese club del cual es hincha hasta la muerte misma ");
        String club = leer.next();
        System.out.println("ingrese peso");
        double peso = leer.nextDouble();
        System.out.println("ingrese altura");
        double altura = leer.nextDouble();

        return new PersonaEntidades(nombre, edad, sexo, club, altura, peso);

    }

    public void calcularIMC(PersonaEntidades persona) {

        double Altura = persona.getAltura(), exponente = 2;
        double resultado = Math.pow(persona.getAltura(), exponente);

        double pesoIdeal = persona.getPeso() / resultado;

        if (pesoIdeal < 20) {
            System.out.println("Debajo de su peso ideal, -1 ");
            persona.setPeso(1);

        } else if ((pesoIdeal > 20) && (25 > pesoIdeal)) {

            System.out.println("la persona esta en su peso ideal, 0");
            persona.setPeso(0);
        } else {
            if (pesoIdeal <= 25) {
                System.out.println("por arriba del peso ideal, 1 ");
                
            }

        }
    }


    public  void esMayorDeEdad(PersonaEntidades persona) {

        boolean esMayor = true;
        if (persona.getEdad() > 18) {
            System.out.println(esMayor);

        } else {
            System.out.println("persona no es mayor de edad");

        }
      
    }
    
    }

