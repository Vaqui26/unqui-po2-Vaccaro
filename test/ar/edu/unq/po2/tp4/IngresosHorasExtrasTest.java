package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresosHorasExtrasTest {

	private IngresoHorasExtras ingreso1;
	private IngresoHorasExtras ingreso2;
	
	@BeforeEach
	public void setUp() {
		
		ingreso1 = new IngresoHorasExtras("Junio","Reparacion",8500d,6);
		ingreso2 = new IngresoHorasExtras("Julio","cumpleaños",20000d,10);
	}
	@Test
	public void testMontoRecibido() {
		assertEquals(8500,ingreso1.getMontoPercibido());
		assertEquals(20000,ingreso2.getMontoPercibido());
	}
	@Test 
	public void testMontoImponible() {
		assertEquals(0,ingreso1.getMontoImponible());
		assertEquals(0,ingreso2.getMontoImponible());
	}

}
