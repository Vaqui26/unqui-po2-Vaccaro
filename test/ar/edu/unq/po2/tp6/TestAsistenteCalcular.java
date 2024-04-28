package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsistenteCalcular {

	private AsistenteCalcular asistente = new AsistenteCalcular();
	
	
	@Test
	void testCalcularMontosMensuales() {
		
		assertEquals(10000,asistente.montoCuotaMensual(120000, 12));
		assertEquals(208333.33333333334,asistente.montoCuotaMensual(5000000, 24));
		assertEquals(8333.333333333334,asistente.montoCuotaMensual(50000, 6));
		assertEquals(1944444.4444444445,asistente.montoCuotaMensual(70000000, 36));
	}

}
