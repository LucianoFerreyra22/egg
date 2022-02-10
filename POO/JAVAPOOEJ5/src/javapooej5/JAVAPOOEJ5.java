/*
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package javapooej5;

import entidades.Cuenta;
import servicios.cuentaServicios;

/**
 * 
 * @author Marisel222
 */
public class JAVAPOOEJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    cuentaServicios cs= new cuentaServicios();
    Cuenta c = cs.crearCuenta();
    cs.ingresar(c);
    cs.retirar(10, c);
    cs.extraccionRapida(c);
    cs.consultarSaldo(c); 
    cs.consultarDatos(c); 
    
        
    
    }
    
}
