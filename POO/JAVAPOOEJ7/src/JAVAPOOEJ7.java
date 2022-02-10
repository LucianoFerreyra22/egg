
import entidades.PersonaEntidades;
import servicios.PersonaServicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marisel
 */
public class JAVAPOOEJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    PersonaServicios ps = new PersonaServicios(); 
    PersonaEntidades persona = ps.crearPersona();
    ps.calcularIMC(persona);
    ps.esMayorDeEdad(persona);
    
    
    ps.crearPersona();
    ps.calcularIMC(persona);
    ps.esMayorDeEdad(persona);
    
   
    ps.crearPersona();
    ps.calcularIMC(persona);
    ps.esMayorDeEdad(persona);
    
    
    ps.crearPersona();
    ps.calcularIMC(persona);
    ps.esMayorDeEdad(persona); 
    
    
    
    
    double porcentajeIMCN= 0; 
    double porcentajeIMCP=0 ;
   
//    //if (ps.calcularIMC(persona)>1 ) {
//            porcentajeIMCP= porcentajeIMCP+1 ; 
//          
//        } else {
//       porcentajeIMCN=porcentajeIMCN +1  ;
//        }
    }
           
    
 // 
// Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
// 
 
// double  porcentajeIMC =(ps.calcularIMC()+ ps2.calcularIMC()+ ps3.calcularIMC()+ps4.calcularIMC())*100/ 4;
// 
//  double porcentajeMayores= ps.esMayorDeEdad(persona)+ ps2.esMayorDeEdad(persona)+ ps3.esMayorDeEdad(persona)+ ps4.esMayorDeEdad(persona))*100
// 
              
        


  }
 



//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de esas 4
//personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//cuantos menores.