package cuentasBanco;
import cuentasBanco.CuentaBanco;

public class Main {

    public static void main(String[] args) {
        CuentaBanco miCuenta;
        double saldoActual;

        extracted();
    }

	private static void extracted() {
		operativaCuenta(0.0f);
	}
	/**
	* Metodo para comprobar nuestra cuenta de banco
	* y enseñar la contidad de dinero que tenemos en esa cuenta.
	* Tambien intenta retirar dinero de la cuenta, nos enseñara un error si falla algo en el proceso.
	* Por ultimo ingresara dinero en la cuenta y nos enseñara un error si falla algo.
	*
	*
	* @author  Diego González
	* @version 1.0
	* @since   04-03-2023
	*/
	private static void operativaCuenta(float cantidad) {
		
		
		
		CuentaBanco cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
