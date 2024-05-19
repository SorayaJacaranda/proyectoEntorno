package proyectoEntornos.paquete1;

import java.util.ArrayList;

import paquete2.BancoException;

public class CuentaBancaria {
	private String numero;
	private String nombre;
	private double importe;

	public CuentaBancaria(String numero, String nombre, double balance) {
		this.numero = numero;
		this.nombre = nombre;
		this.importe = balance;
		if(!validaImporte(balance))
			this.importe = 0;
	}

	public void ingreso(double i)  throws BancoException {
		if (validaImporte(importe)) {
			importe += i;
			System.out.println("Ingresado: " + i);
			System.out.println("Nuevo saldo: " + importe);
		} else {
			new BancoException("Cantidad a ingresar incorrecta" + i);
		}
	}
	
	public boolean validaImporte(double importe)
	{
		boolean correcto = true;
		int resultado;
		if(importe <0)
		{
			correcto= false;
		}
		return correcto;
	}

	void retiradaEfectivo(double importeOperacion) throws BancoException {
		if (importe > 0) {
			if (importe >= importeOperacion) {
				importe -= importeOperacion;
				System.out.println("Retirada efectivo: " + importeOperacion);
				System.out.println("Nuevo saldo: " + importe);
			} else {
				new BancoException("Fondos insuficientes");
			}
		} else {
			new BancoException("Cantidad a ingresar incorrecta" + importeOperacion);
		}
	}

	@Override
	public String toString() {
		System.out.println("Número de cuenta: " + numero);
		System.out.println("Propietario: " + nombre);
		System.out.println("Saldo: " + importe);
		return "CuentaBancaria [numero=" + numero + ", nombre=" + nombre + ", importe=" + importe + "]";
	}
	
}
