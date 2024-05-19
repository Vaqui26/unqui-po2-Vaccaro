package ar.edu.unq.po2.tp9.Composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testSpecialProduct {

	private SpecialProduct producto1;
	private SpecialProduct producto2;
	private SpecialProduct producto3;
	
	@BeforeEach
	void setUp() {
		
		producto1 = new SpecialProduct("Fideos",860);
		producto2 = new SpecialProduct("Papas Fritas",550);
		producto3 = new SpecialProduct("Detergente",900);
	}
	
	@Test
	void testNombresDeProductosEspeciales() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals("Fideos",producto1.getName());
		assertEquals("Papas Fritas",producto2.getName());
		assertEquals("Detergente",producto3.getName());
		
	}
	@Test
	void testPrecioDeProductosEspeciales() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(774,producto1.getPrice());
		assertEquals(495,producto2.getPrice());
		assertEquals(810,producto3.getPrice());
	}

}
