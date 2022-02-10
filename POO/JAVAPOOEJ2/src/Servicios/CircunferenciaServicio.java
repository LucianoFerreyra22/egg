/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Marisel
 */
public class CircunferenciaServicio {

    private Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        System.out.println("ingrese el radio");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public double area(Circunferencia c){
        
        return Math.PI * c.getRadio();
    }
public double perimetro(Circunferencia c) {
    
    return Math.PI* 2 * c.getRadio(); 
}
}