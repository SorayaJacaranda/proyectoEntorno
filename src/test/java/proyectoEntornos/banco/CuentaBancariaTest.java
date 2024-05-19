package proyectoEntornos.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	@Test
	void testValidaConstructorCorrecto() {
		CuentaBancaria cc = new CuentaBancaria("123456789123456789", "Pedro Silguero", 100);
		assertTrue(cc.getImporte()==100);
	}

}
