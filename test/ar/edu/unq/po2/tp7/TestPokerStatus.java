package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {

	private PokerStatus verificadorRonda;
	private Carta carta1P;
	private Carta carta1C;
	private Carta carta1D;
	private Carta carta1T;
	private Carta carta2P;
	private Carta carta2C;
	private Carta carta2D;
	private Carta carta2T;
	private Carta carta3P;
	private Carta carta3D;
	private Carta carta3T;
	private Carta carta3C;
	private Carta carta4C;
	private Carta carta4D;
	private Carta carta4P;
	private Carta carta4T;
	private Carta carta5T;
	private Carta carta5C;
	private Carta carta5D;
	private Carta carta5P;
	private Carta carta6T;
	private Carta carta6P;
	private Carta carta7T;
	private Carta carta7D;
	private Carta carta7C;
	private Carta carta8T;
	private Carta carta9T;
	private Carta carta9C;
	private Carta carta9P;
	private Carta carta10D;
	private Carta carta10T;
	private Carta carta10P;
	private Carta carta10C;
	private Carta cartaJC;
	private Carta cartaJT;
	private Carta cartaJD;
	private Carta cartaQD;
	private Carta cartaQC;
	private Carta cartaQP;
	private Carta cartaQT;
	private Carta cartaKP;
	private Carta cartaKC;
	private Carta cartaKD;
	private Carta cartaKT;
	
	
	@BeforeEach
	void setUp() {
		
		verificadorRonda = new PokerStatus();
		carta1P = new Carta(Palo.Pica, ValorNumerico.A);
		carta1C = new Carta(Palo.Corazon, ValorNumerico.A);
		carta1D = new Carta(Palo.Diamante, ValorNumerico.A);
		carta1T = new Carta(Palo.Trebol, ValorNumerico.A);
		carta2P = new Carta(Palo.Pica, ValorNumerico.Dos);
		carta2C = new Carta(Palo.Corazon, ValorNumerico.Dos);
		carta2D = new Carta(Palo.Diamante, ValorNumerico.Dos);
		carta2T = new Carta(Palo.Trebol, ValorNumerico.Dos);
		carta3P = new Carta(Palo.Pica, ValorNumerico.Tres);
		carta3D = new Carta(Palo.Diamante, ValorNumerico.Tres);
		carta3T = new Carta(Palo.Trebol, ValorNumerico.Tres);
		carta3C = new Carta(Palo.Corazon, ValorNumerico.Tres);
		carta4D = new Carta(Palo.Diamante, ValorNumerico.Cuatro);
		carta4P = new Carta(Palo.Pica, ValorNumerico.Cuatro);
		carta4T = new Carta(Palo.Trebol, ValorNumerico.Cuatro);
		carta4C = new Carta(Palo.Corazon, ValorNumerico.Cuatro);
		carta5T = new Carta(Palo.Trebol, ValorNumerico.Cinco);
		carta5C = new Carta(Palo.Corazon, ValorNumerico.Cinco);
		carta5D = new Carta(Palo.Diamante, ValorNumerico.Cinco);
		carta5P = new Carta(Palo.Pica, ValorNumerico.Cinco);
		carta6T = new Carta(Palo.Trebol, ValorNumerico.Seis);
		carta6P = new Carta(Palo.Pica, ValorNumerico.Seis);
		carta7T = new Carta(Palo.Trebol, ValorNumerico.Siete);
		carta7D = new Carta(Palo.Diamante, ValorNumerico.Siete);
		carta7C = new Carta(Palo.Corazon, ValorNumerico.Siete);
		carta8T = new Carta(Palo.Trebol, ValorNumerico.Ocho);
		carta9T = new Carta(Palo.Trebol, ValorNumerico.Nueve);
		carta9C = new Carta(Palo.Corazon, ValorNumerico.Nueve);
		carta9P = new Carta(Palo.Pica, ValorNumerico.Nueve);
		carta10D = new Carta(Palo.Diamante, ValorNumerico.Diez);
		carta10T = new Carta(Palo.Trebol, ValorNumerico.Diez);
		carta10C = new Carta(Palo.Corazon, ValorNumerico.Diez);
		carta10P = new Carta(Palo.Pica, ValorNumerico.Diez);
		cartaJC = new Carta(Palo.Corazon, ValorNumerico.J);
		cartaJD = new Carta(Palo.Diamante, ValorNumerico.J);
		cartaJT = new Carta(Palo.Trebol, ValorNumerico.J);
		cartaQD = new Carta(Palo.Diamante, ValorNumerico.Q);
		cartaQC = new Carta(Palo.Corazon, ValorNumerico.Q);
		cartaQT = new Carta(Palo.Trebol, ValorNumerico.Q);
		cartaQP = new Carta(Palo.Pica, ValorNumerico.Q);
		cartaKP = new Carta(Palo.Pica, ValorNumerico.K);
		cartaKC = new Carta(Palo.Corazon, ValorNumerico.K);
		cartaKD = new Carta(Palo.Diamante, ValorNumerico.K);
		cartaKT = new Carta(Palo.Trebol, ValorNumerico.K);
		
		carta10T = new Carta(Palo.Trebol, ValorNumerico.Diez);
	}
	
	@Test
	void testVerificarSiHayPokerTrue() {
		
		// SetUp(creado con el metodo setUp())
		
		// Exercise, en este caso no requiere 
		
		//Verify
		assertEquals("Poquer",verificadorRonda.verificar(carta1P,carta1C,carta1D,carta1T,carta10T));
		assertEquals("Poquer",verificadorRonda.verificar(carta2P,carta2C,carta2D,cartaKC,carta2T));
		assertEquals("Poquer",verificadorRonda.verificar(carta3P,cartaQD,carta3D,carta3T,carta3C));
		assertEquals("Poquer",verificadorRonda.verificar(cartaJC,carta4C,carta4D,carta4P,carta4T));
		assertEquals("Poquer",verificadorRonda.verificar(cartaKP,cartaKC,cartaKD,cartaKT,cartaKT));
		
		//Teardown
	}
	@Test
	void testVerificarSiHayPokerFalse() {
		
		// SetUp(creado con el metodo setUp())
		
		// Exercise, en este caso no requiere
				
		//Verify
		assertEquals("Nada",verificadorRonda.verificar(carta1P,carta2D ,carta3C, carta4D, carta5T));
		assertEquals("Nada",verificadorRonda.verificar(carta7T,carta7D ,carta10D, cartaJC, carta2T));
		assertEquals("Nada",verificadorRonda.verificar(carta10P, carta10C, cartaKD, cartaKC, carta6T));
		assertEquals("Nada",verificadorRonda.verificar(carta6P, carta4D, carta4C, carta8T, cartaQC));
		assertEquals("Nada",verificadorRonda.verificar(carta1P, cartaQD, cartaKC, carta9T, carta10C));
				
		//Teardown
	}
	@Test
	void testVerificarSiHayTrio() {
		
		//SetUp(creado con el metodo setUp())
		
		//Exercise, en este caso no requiere
		
		//Verify
		assertEquals("Trio",verificadorRonda.verificar(carta10P, carta10C, carta10D, cartaKC, carta6T));
		assertEquals("Trio",verificadorRonda.verificar(carta2C, carta4T, carta2D, carta2T, cartaQP));
		assertEquals("Trio",verificadorRonda.verificar(cartaQT, carta5C, carta1T, cartaQC, cartaQP));
		assertEquals("Trio",verificadorRonda.verificar(carta7C, carta9P, carta9T, carta9C, cartaKD));
		assertEquals("Trio",verificadorRonda.verificar(cartaKC, cartaJT,carta1T,carta1D,carta1P));
		
		//Teardown
	}
	@Test
	void testVerificarSiHayColor() {
		
		//SetUp(creado con el metodo setUp())
		
		//Exercise, en este caso no requiere
				
		//Verify
				
		assertEquals("Color",verificadorRonda.verificar(carta1P, carta2P, carta3P, carta4P, carta5P));
		assertEquals("Color",verificadorRonda.verificar(cartaKC, cartaQC, cartaJC, carta10C, carta9C));
		assertEquals("Color",verificadorRonda.verificar(carta2T, carta4T, carta6T, carta8T, carta10T));
		assertEquals("Color",verificadorRonda.verificar(carta1D, carta10D, cartaKD, carta5D, cartaJD));
	}

}
