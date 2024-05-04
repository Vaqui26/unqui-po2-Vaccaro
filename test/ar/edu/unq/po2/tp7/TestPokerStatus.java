package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {

	private PokerStatus verificarRonda;
	
	@BeforeEach
	void setUp() {
		
		verificarRonda = new PokerStatus();
	}
	
	@Test
	void testVerificarSiHayPokerTrue() {
		
		// SetUp(creado con el metodo setUp())
		
		// Exercise, en este caso no hay 
		
		//Verify
		assertTrue(verificarRonda.verificar("1P","1C","1D","1T","10T"));
		assertTrue(verificarRonda.verificar("2P","2C","2D","KC","2T"));
		assertTrue(verificarRonda.verificar("3P","QD","3D","3T","3C"));
		assertTrue(verificarRonda.verificar("JC","4C","4D","4P","4T"));
		assertTrue(verificarRonda.verificar("KP","KC","KD","KT","KT"));
		
		//Teardown
	}
	@Test
	void testVerificarSiHayPokerFalse() {
		
		// SetUp(creado con el metodo setUp())
		
		// Exercise, en este caso no hay 
				
		//Verify
		assertFalse(verificarRonda.verificar("1P","2P" ,"3P", "4P", "5P"));
		assertFalse(verificarRonda.verificar("7T","7D" ,"10D", "JC", "2T"));
		assertFalse(verificarRonda.verificar("10P", "10C", "10D", "KC", "6T"));
		assertFalse(verificarRonda.verificar("4P", "4D", "4C", "8T", "QC"));
		assertFalse(verificarRonda.verificar("KP", "KD", "KC", "QT", "1C"));
				
		//Teardown
	}
	

}
