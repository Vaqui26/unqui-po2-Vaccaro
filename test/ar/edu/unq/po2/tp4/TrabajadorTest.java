package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador trabajador1;
	private Trabajador trabajador2;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoHorasExtras ingreso3;
	private IngresoHorasExtras ingreso4;
	
	@BeforeEach
	public void setUp() {
		trabajador1 = new Trabajador();
		trabajador2 = new Trabajador();
		ingreso1 = new Ingreso("Julio","algo",5000d);
		ingreso2 = new Ingreso("Mayo","chamba",2500d);
		ingreso3 = new IngresoHorasExtras("Enero","playero",21000d,12);
		ingreso4 = new IngresoHorasExtras("Febrero","ayudante",1000,0);
		
		trabajador1.agregarIngreso(ingreso1);
		trabajador1.agregarIngreso(ingreso2);
		trabajador1.agregarIngreso(ingreso3);
		
		trabajador2.agregarIngreso(ingreso3);
		trabajador2.agregarIngreso(ingreso4);
		trabajador2.agregarIngreso(ingreso1);
		
	}
	@Test
	public void testCalcularTotalPercibido() {
		assertEquals(28500,trabajador1.getTotalPercibido());
		assertEquals(27000,trabajador2.getTotalPercibido());
	}
	@Test
	public void testCalcularTotalImponible() {
		assertEquals(7500,trabajador1.getMontoImponible());
		assertEquals(5000,trabajador2.getMontoImponible());
	}
	@Test
	public void testCalcularImpuesto() {
		assertEquals(1500,trabajador1.getImpuestoAPagar());
		assertEquals(1000,trabajador2.getImpuestoAPagar());
	}
	
}
