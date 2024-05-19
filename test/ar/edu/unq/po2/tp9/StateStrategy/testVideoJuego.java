package ar.edu.unq.po2.tp9.StateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testVideoJuego {

	private MaquinaVideoJuego maquina;
	
	@BeforeEach
	void setUp() {
		
		maquina = new MaquinaVideoJuego();
	}
	
	@Test
	void testMaquinaConEstadoApagada() {
		
		//Set Up
		//Exercise
		maquina.ingresarFicha();
		//Verify
		assertEquals(0,maquina.getCantidadFichas());
		assertEquals("Ingrese Fichas para jugar!",maquina.presionarBoton());
		
		
	}
	@Test
	void testMaquinaConEstadoPantallaInicio() {
		
		//Set Up
		//Exercise
		maquina.presionarBoton();
		//Verify
		assertEquals(0,maquina.getCantidadFichas());
		assertEquals("Necesita ingresar minimo una ficha para jugar!",maquina.presionarBoton());
		
	}
	@Test
	void testMaquinaConEstadoInicioConUnaFicha() {
		
		//Set Up
		//Exercise
		maquina.presionarBoton();
		maquina.ingresarFicha();
		//Verify
		assertEquals(1,maquina.getCantidadFichas());
		assertEquals("Comienzo de partida con un solo jugador",maquina.presionarBoton());
		assertEquals(0,maquina.getCantidadFichas());
	}
	@Test
	void testMaquinaConEstadoInicioConDosFicha() {
		
		//Set Up
		//Exercise
		maquina.presionarBoton();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		//Verify
		assertEquals(2,maquina.getCantidadFichas());
		assertEquals("Comienzo de partida cooperativa",maquina.presionarBoton());
		assertEquals(0,maquina.getCantidadFichas());
	}

}
