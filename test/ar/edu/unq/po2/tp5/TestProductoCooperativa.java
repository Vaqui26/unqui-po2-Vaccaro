package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProductoCooperativa {

	private ProductoCooperativa producto1;
	private ProductoCooperativa producto2;
	private ProductoCooperativa producto3;
	
	@BeforeEach
	void setUp() {
		
		producto1 = new ProductoCooperativa("Fideos",900);
		producto2 = new ProductoCooperativa("Pan", 1300);
		producto3 = new ProductoCooperativa("Licor", 1800);
	}
	
	@Test
	void testDeNombres() {

		assertEquals("Fideos",producto1.getNombre());
		assertEquals("Pan",producto2.getNombre());
		assertEquals("Licor",producto3.getNombre());
	}
	@Test
	void testDePrecios() {
		// Mayormente fallan porque el tipo double es muy exacto.
		assertEquals(810,producto1.getPrecio());
		assertEquals(1170,producto2.getPrecio());
		assertEquals(1620,producto3.getPrecio());
	}

}
