package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPropiedad {

	private Propiedad inmueble1;
	private Propiedad inmueble2;
	
	@BeforeEach
	void setUp() {
		
		this.inmueble1 = new Propiedad("terronito chico","San luis 1223", 250000);
		this.inmueble2 = new Propiedad("quinta","Flores 14", 700000);
	}
	@Test
	void testValorDePropiedades() {

		assertEquals(250000,inmueble1.getValorFiscal());
		assertEquals(700000,inmueble2.getValorFiscal());
	
	}

}
