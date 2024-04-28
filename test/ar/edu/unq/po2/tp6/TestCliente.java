package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCliente {

	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Propiedad inmueble1;
	private Propiedad inmueble2;
	private Propiedad inmueble3;
	
	@BeforeEach
	void setUp() {
		
		// Objetos Dummy para crear instancias de Cliente.
		inmueble1 = new Propiedad("terronito chico","San luis 1223", 250000);
		inmueble2 = new Propiedad("quinta","Flores 14", 700000);
		inmueble3 = new Propiedad("departamento","Primera Junta 3566", 380000);
		
		cliente1 = new Cliente("Nico","Vaccaro","San Luis 2324",26,100000,inmueble1);
		cliente2 = new Cliente("Gian","Vaccaro","San Luis 1223",20,80000,inmueble2);
		cliente3 = new Cliente("Ailen","Martinez","Pelegrini 2006",24,400000,inmueble3);
	}
	@Test
	void testNombresDeClientes() {

		assertEquals("Nico",cliente1.getNombre());
		assertEquals("Gian",cliente2.getNombre());
		assertEquals("Ailen",cliente3.getNombre());
	}
	@Test
	void testEdadDeClientes() {
		
		assertEquals(26,cliente1.getEdad());
		assertEquals(20,cliente2.getEdad());
		assertEquals(24,cliente3.getEdad());
	}
	@Test
	void testSueldoMensualDeClientes() {
		
		assertEquals(100000,cliente1.getSueldoMensual());
		assertEquals(80000,cliente2.getSueldoMensual());
		assertEquals(400000,cliente3.getSueldoMensual());
	}
	@Test
	void testSueldoAnualDeClientes() {
		
		assertEquals(1200000,cliente1.getSueldoAnual());
		assertEquals(960000,cliente2.getSueldoAnual());
		assertEquals(4800000,cliente3.getSueldoAnual());
	}
	@Test
	void testVerificarPropiedad() {
		
		assertTrue(cliente1.getPropiedad().equals(inmueble1));
		assertTrue(cliente2.getPropiedad().equals(inmueble2));
		assertTrue(cliente3.getPropiedad().equals(inmueble3));
	}

}
