package paquete2;

import proyectoEntornos.paquete1.CuentaBancaria;

public class Clase2 {

	public static void main(String[] args) {
		CuentaBancaria cc = new CuentaBancaria("123456789", "Pepe", -100);
		try {
			cc.ingreso(200);
		} catch (BancoException e) {
			System.out.println("Error al ingresar");
		}
		cc.toString();
	}

}
