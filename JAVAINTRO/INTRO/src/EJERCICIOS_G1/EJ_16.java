/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package EJERCICIOS_G1;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class EJ_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      String cadena, cadena2;
      int cont1, cont2;
      cont1=0;
      cont2=0;
    
     Scanner leer= new Scanner(System.in);    
     System.out.println("ingresa una linda frase de 5 caracteres, el l primer carácter tiene que ser X y el último tiene que ser una O: ");
     cadena= leer.next();
     cadena2="&&&&&";
             
     while(!cadena.equals("&&&&&")){
 
    if (cadena.substring(0,1).contains("X")&& cadena.substring(4,5).contains("O")){
        System.out.println("correcto");
        cont1= cont1 + 1;  
    } else {
        cont2= cont2 + 1 ;
            }
      System.out.println("ingrese una cadena ");
      cadena=leer.next(); 
      
      
     
     }
     System.out.println("lecturas correctas:" + cont1+".");
     System.out.println("lecturas incorrectas"+cont2+".");
}
}

 //*if (cadena1.substring(0,1).equals("X")||cadena1.substring(0,1).equals("x")&& cadena1.substring(0,5).equals("O")||cadena1.substring(0,5).equals("o")){
    //     System.out.println("correcto");
   // }else
    //System.out.println("incorrecto");
    
   //}while (true);  