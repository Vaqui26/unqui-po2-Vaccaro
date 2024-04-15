package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProducto {

	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	@BeforeEach
	public void setUp() {
		
		producto1 = new Producto("Leche",1100);
		producto2 = new Producto("Arroz",250);
		producto3 = new Producto("Harina",890);
	}
	
	@Test
	void testDeNombres() {
		
		assertEquals("Leche",producto1.getNombre());
		assertEquals("Arroz",producto2.getNombre());
		assertEquals("Harina",producto3.getNombre());
		
	}
	@Test 
	void testDePrecios() {
		
		assertEquals(1100,producto1.getPrecio());
		assertEquals(250,producto2.getPrecio());
		assertEquals(890,producto3.getPrecio());
		
	}

}
