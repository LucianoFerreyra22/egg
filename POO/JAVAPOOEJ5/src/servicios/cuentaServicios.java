/*
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.✓
• Agregar los métodos getters y setters correspondientes ✓
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. ✓ 
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
package servicios;

import entidades.Cuenta;
import java.util.Scanner;

public class cuentaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        // int numeroCuenta;
        //long DNI; 
        //double saldo; 

        System.out.println("ingrese n de cuenta");
        int numeroCuenta = leer.nextInt();

        System.out.println("ingrese dni");
        long DNI = leer.nextLong();

        System.out.println("ingrese saldo");
        double saldo = leer.nextDouble();
        System.out.println("ingrese monto");
        double monto= leer.nextDouble(); 
        return new Cuenta(numeroCuenta, DNI, saldo, monto);

    }

    public void ingresar(Cuenta cuenta) {
        System.out.println("  ingrese monto a incorporar     ");
        double monto = leer.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo() + monto);
        System.out.println("su cuenta actual es de:" + cuenta.getSaldo());

    }

    public void retirar(double monto, Cuenta cuenta) {

        System.out.println("  ingrese saldo a retirar     ");
        double retiro = leer.nextDouble();

        if (cuenta.getSaldo() < monto) {
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            {

                System.out.println("el saldo actual es de  " + cuenta.getSaldo());

            }
        }
    }
    public void extraccionRapida(Cuenta cuenta){
        
        System.out.println("ingrese monto a retirar rapidamente");
        double monto1= leer.nextDouble(); 
        if (monto1 <=cuenta.getSaldo()*0.2) {
            cuenta.setSaldo(monto1 - cuenta.getSaldo());
        }
        System.out.println("su saldo actual es de "+ cuenta.getSaldo()+".");

    }
public void consultarSaldo(Cuenta cuenta){ 
    System.out.println("su saldo actual es de"+ cuenta.getSaldo());

}
public void consultarDatos(Cuenta cuenta){ 
    System.out.println("sus datos: "+ cuenta.toString()); 
}

}




//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
