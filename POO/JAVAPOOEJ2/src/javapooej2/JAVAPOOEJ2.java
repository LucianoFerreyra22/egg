/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooej2;

import Servicios.CircunferenciaServicio;
import entidades.Circunferencia;

/**
 *
 * @author Marisel
 */
public class JAVAPOOEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    CircunferenciaServicio cs= new CircunferenciaServicio();
    Circunferencia c= cs.crearCircunferencia();
    
        System.out.println(cs.area(c));
        System.out.println(cs.perimetro(c));
}

}