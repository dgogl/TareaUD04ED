package cuentasBanco;

import cuentasBanco.CuentaBanco;

/**
 * Clase para las operaciones de la cuenta de banco Creacion, consulta de saldo,
 * ingresos y retiradas de saldo
 *
 * @author Diego González
 * @version 1.0
 * @since 04-03-2023
 */
public class CuentaBanco {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor para crear una cuenta de banco
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	public CuentaBanco() {

	}

	/**
	 * 
	 * Constructor para crear la cuenta de un banco al que le pasamos nombre de la
	 * persona, numero de cuenta y saldo
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	public CuentaBanco(String nom, String cue, double sal, double tipo) {

		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Metodo para consultar el saldo en nuestra cuenta
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	public double estado() {

		return saldo;
	}

	/**
	 * Metodo para ingresar saldo en nuestra cuenta Si la cantidad que queremos
	 * ingresar es menor a 0 nos enseñara un fallo.
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	public void ingresar(double cantidad) throws Exception {

		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Metodo para retirar dinero de la cuenta Si la cantidad que introducimos es
	 * negativa o no tenemos suficiente saldo como para retirar la cantidad
	 * introducida, nos enseñara un fallo
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	public void retirar(double cantidad) throws Exception {

		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	/**
	 * Metodo para consultar el tipo de interes
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	private double getTipoInterés() {

		return tipoInterés;
	}

	/**
	 * Metodo para modificar el tipo de interes
	 *
	 * @author Diego González
	 * @version 1.0
	 * @since 04-03-2023
	 */
	private void setTipoInterés(double tipoInterés) {

		this.tipoInterés = tipoInterés;
	}
}
