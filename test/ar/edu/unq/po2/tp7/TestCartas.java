package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCartas {
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	
	@Test
	void testCartaValor() {

		//Set up
		carta1 = new Carta(Palo.Corazon, ValorNumerico.A);
		carta2 = new Carta(Palo.Trebol, ValorNumerico.Cinco);
		carta3 = new Carta(Palo.Diamante, ValorNumerico.Diez);
		carta4 = new Carta(Palo.Pica, ValorNumerico.K);
		
		//Exercise, en este caso no es necesario
		
		//Verify
		assertEquals(1, carta1.getValor());
		assertEquals(5, carta2.getValor());
		assertEquals(10, carta3.getValor());
		assertEquals(13, carta4.getValor());
		
		//Teardown
	}
	@Test
	void testCartaPalo() {
		
		//Set up
		carta1 = new Carta(Palo.Corazon, ValorNumerico.A);
		carta2 = new Carta(Palo.Trebol, ValorNumerico.Cinco);
		carta3 = new Carta(Palo.Diamante, ValorNumerico.Diez);
		carta4 = new Carta(Palo.Pica, ValorNumerico.K);
				
		//Exercise, en este caso no es necesario
				
		//Verify
		assertEquals("Corazon", carta1.getPalo());
		assertEquals("Trebol", carta2.getPalo());
		assertEquals("Diamante", carta3.getPalo());
		assertEquals("Pica", carta4.getPalo());
		
		//Teardown
	}
	@Test
	void testComparacionDeValorEntreCartas() {
	
		//Set up
		carta1 = new Carta(Palo.Corazon, ValorNumerico.A);
		carta2 = new Carta(Palo.Trebol, ValorNumerico.Cinco);
		carta3 = new Carta(Palo.Diamante, ValorNumerico.Diez);
		carta4 = new Carta(Palo.Pica, ValorNumerico.K);
		
		// Exercise, en este caso no es necesario.
		
		//Verify
		// Comparando con la carta1
		assertTrue(carta1.esSuperiorA(carta2));
		assertTrue(carta1.esSuperiorA(carta3));
		assertTrue(carta1.esSuperiorA(carta4));
		assertFalse(carta2.esSuperiorA(carta1));
		assertFalse(carta3.esSuperiorA(carta1));
		assertFalse(carta4.esSuperiorA(carta1));
		
		// Comparando con la carta2
		assertFalse(carta2.esSuperiorA(carta3));
		assertFalse(carta2.esSuperiorA(carta4));
		
		// Comparando con la carta3
		assertTrue(carta3.esSuperiorA(carta2));
		assertFalse(carta3.esSuperiorA(carta4));
		
		// Comparando con la carta4
		assertTrue(carta4.esSuperiorA(carta2));
		assertTrue(carta4.esSuperiorA(carta3));		
		
		//Teardown
	}
	@Test
	void testComparacionDePalosDeLasCartas() {
		
		//Set up, en este caso cree otras instancias de objetos para comparar solo en este test.
		carta1 = new Carta(Palo.Corazon, ValorNumerico.A);
		carta2 = new Carta(Palo.Trebol, ValorNumerico.Cinco);
		carta3 = new Carta(Palo.Diamante, ValorNumerico.Diez);
		carta4 = new Carta(Palo.Pica, ValorNumerico.K);
		Carta cartaC1 = new Carta(Palo.Corazon, ValorNumerico.K);
		Carta cartaC2 = new Carta(Palo.Trebol, ValorNumerico.Diez);
		Carta cartaC3 = new Carta(Palo.Diamante, ValorNumerico.Dos);
		Carta cartaC4 = new Carta(Palo.Pica, ValorNumerico.J);
		
		// Exercise, en este caso no es necesario
		
		//Verify
		assertTrue(carta1.esMismoPaloQue(cartaC1));
		assertTrue(carta2.esMismoPaloQue(cartaC2));
		assertTrue(carta3.esMismoPaloQue(cartaC3));
		assertTrue(carta4.esMismoPaloQue(cartaC4));
		
		assertFalse(carta1.esMismoPaloQue(carta2));
		assertFalse(carta2.esMismoPaloQue(carta3));
		assertFalse(carta3.esMismoPaloQue(carta4));
		assertFalse(carta4.esMismoPaloQue(cartaC1));
		
		//Teardown
	}
}
