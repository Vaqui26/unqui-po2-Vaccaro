package ar.edu.unq.po2.tp9.StateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testMp3 {

	private Mp3 reproductor;
	private Song cancion;
	
	@BeforeEach
	void setUp() {
		
		reproductor = new Mp3();
		cancion = new Song();
	}
	@Test
	void testMp3EnModoSeleccion() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals("Error, no se esta reproduciendo ninguna cancion!",reproductor.pause());
		assertEquals("Reproduciendo la cancion",reproductor.play(cancion));
	}
	@Test
	void testMp3EnModoReproduccion() {
		
		//Set Up
		//Exercise
		reproductor.play(cancion);
		//Verify
		assertEquals("Error, ya hay una cancion reproduccion.",reproductor.play(cancion));
		assertEquals("Pausa",reproductor.pause());
	}
	@Test
	void testMp3EnModoPausado() {
		
		//Set Up
		//Exercise
		reproductor.play(cancion);
		reproductor.pause();
		//Verify
		assertEquals("Error, la cancion ya esta en pausa!",reproductor.pause());
		assertEquals("Reproduciendo la cancion",reproductor.play(cancion));
	}
}
