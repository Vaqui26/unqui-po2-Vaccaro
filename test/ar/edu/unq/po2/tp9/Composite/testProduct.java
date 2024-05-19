package ar.edu.unq.po2.tp9.Composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testProduct {

	private Product producto1;
	private Product producto2;
	private Product producto3;
	
	@BeforeEach
	void setUp() {
		
		producto1 = new Product("Harina",1000);
		producto2 = new Product("Aceite",1800);
		producto3 = new Product("Azucar",750);
	}
	
	@Test
	void testNombresDeProductos() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals("Harina",producto1.getName());
		assertEquals("Aceite",producto2.getName());
		assertEquals("Azucar",producto3.getName());
	}
	@Test
	void testPrecioDeProductos() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(1000,producto1.getPrice());
		assertEquals(1800,producto2.getPrice());
		assertEquals(750,producto3.getPrice());
	}

}
