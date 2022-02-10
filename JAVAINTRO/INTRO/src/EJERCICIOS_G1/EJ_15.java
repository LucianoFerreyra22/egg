
import java.util.Scanner;

/*
 *15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 //
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package EJERCICIOS_G1;

/**
 *
 * @author Marisel
 */
public class EJ_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String Salir;
          int n1, n2, opcion, resta, multipli,division, suma;   
        
        Scanner leer = new Scanner(System.in);
 
        System.out.println("ingrese un numero, n1 ");
        n1=leer.nextInt();
        System.out.println("ingrese n2");
        n2=leer.nextInt();
        suma=(n1+ n2);
        resta=(n1- n2);
        division=(n1/ n2);        
        multipli=(n1*n2);
        Salir=" ";
        
        do {
        System.out.println("1-Sumar" );
        System.out.println("2-Restar " );   
        System.out.println("3-Multiplicar" );
        System.out.println("4-Dividir" );
        System.out.println("5-Salir" );
        System.out.println("ELIJA OPCION: " );
        opcion= leer.nextInt();
         
        
        
        
       
            switch (opcion){
              
                 case 1: 
                    
                System.out.println("1- Suma:" +suma +".");
                break; 
            
                case 2: 
                    
                System.out.println("2- Resta:" +resta+ ".");
                break;   

                 case 3: 
                    
                System.out.println("3- Multiplicar:" + multipli+ ".");
                break;  
                        
                case 4: 
                  
                System.out.println("4-Dividir: " + division+ ".");
                
                break;  
                case 5: 
                    System.out.println("Desea salir del menu? S/N");
                    System.out.println(" ");
                    Salir =leer.next();
                   
                  
         
                break;  
                default: 
                     System.out.println("Elija una opcion correcta");
            }             
            
            if ("s".equals(Salir) || "S".equals(Salir)){ 
                         
                break;
            }else { 
                continue;
            }      
            
                    
                    
        } while (true);
    }        
}                      
            
