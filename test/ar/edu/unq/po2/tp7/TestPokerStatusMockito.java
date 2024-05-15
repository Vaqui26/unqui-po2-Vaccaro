package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class TestPokerStatusMockito {

	private PokerStatus verificadorMano;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() {
		
		verificadorMano = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	
	@Test
	void testVerificarCadaManoDePoker() {
		
		//Set up
		when(carta1.getValor()).thenReturn(1,2,3);
		when(carta1.getPalo()).thenReturn("Pica","Corazon","Trebol");
		when(carta1.getValor()).thenReturn(1,4,8);
		when(carta1.getPalo()).thenReturn("Trebol","Corazon","Diamante");
		when(carta1.getValor()).thenReturn(1,10,3);
		when(carta1.getPalo()).thenReturn("Corazon","Corazon","Pica");
		when(carta1.getValor()).thenReturn(1,12,3);
		when(carta1.getPalo()).thenReturn("Diamante","Corazon","Diamante");
		when(carta1.getValor()).thenReturn(9,2,7);
		when(carta1.getPalo()).thenReturn("Pica","Corazon","Trebol");
		
		//Exercise
		
		//Verify
		assertEquals("Poquer",verificadorMano.verificar(carta1, carta2, carta3, carta4, carta5));
		//assertEquals("Color",verificadorMano.verificar(carta1, carta2, carta3, carta4, carta5));
		//assertEquals("Trio",verificadorMano.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}

}
