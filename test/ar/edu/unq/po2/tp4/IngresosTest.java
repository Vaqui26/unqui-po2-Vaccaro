package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresosTest {

	private Ingreso ingreso1;
	private Ingreso ingreso2;
	
	@BeforeEach
	public void sepUp() {
		
		ingreso1 = new Ingreso("Abril","algo",10000d);
		ingreso2 = new Ingreso("Mayo", "chambita", 5500d);
	}
	@Test
	void testMontosDeIngresos() {
		assertEquals(10000, ingreso1.getMontoPercibido());
		assertEquals(10000, ingreso1.getMontoImponible());
		assertEquals(5500, ingreso2.getMontoPercibido());
		assertEquals(5500, ingreso2.getMontoImponible());
	}

}
