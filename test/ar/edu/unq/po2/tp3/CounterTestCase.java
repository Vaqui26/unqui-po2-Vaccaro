package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();

	counter.addNumber(10);
	counter.addNumber(33);
	counter.addNumber(54);
	counter.addNumber(742);
	counter.addNumber(900);
	counter.addNumber(4128);
	counter.addNumber(1);
	counter.addNumber(44442);
	counter.addNumber(1);
	counter.addNumber(2468);
	}

	
//	@Test
//	public void testNumerosPares() {
//		
//		int chequear = counter.numerosPares();
//
//		assertEquals(chequear, 1);
//	}
//	@Test
//	public void testNumeroImpares() {
//		
//		int chequear = counter.numerosImpares();
//		
//		assertEquals(chequear, 9);
//	}
//	@Test
//	public void testMultiplos() {
//		
//		int chequear = counter.multiplosDe(3);
//		
//		assertEquals(chequear, 2);
//	}
	
	@Test
	public void testDigitos() {
		
		int chequear = counter.mayorNumeroConDigitosPares();
		
		assertEquals(chequear, 44442);
	}
	@Test
	public void testMultiplos() {
		
		int chequear1 = counter.multiplosEntre(2,5);
		int chequear2 = counter.multiplosEntre(3,9);
		assertEquals(chequear1, -1);
		assertEquals(chequear2, 999);
	}
}
