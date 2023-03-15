package cuentas;

/**
 * 
 * @author cristian
 *
 */

public class Main {

    public static void main(String[] args) {
    	operativa_cuenta();
    }
    
    /**
     * metodo creado en actividad que engloba las sentencias
     */
    
    public static void operativa_cuenta() {
    	
    	float cantidad;
        CCuenta cuenta1;
        double saldoActual;

        /**
         * constructor que crea una nueva cuenta con los 4 diferentes atributos de la clase CCuenta
         * y muestra el saldo actual
        */
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
