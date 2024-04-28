package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCreditoHipotecario {

	private CreditoHipotecario credito1;
	private CreditoHipotecario credito2;
	private CreditoHipotecario credito3;
	private CreditoHipotecario credito4;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Cliente cliente4;
	private Propiedad inmueble1;
	private Propiedad inmueble2;
	private Propiedad inmueble3;
	private Propiedad inmueble4;
	
	@BeforeEach
	void setUp() {
		inmueble1 = new Propiedad("terronito chico","San luis 1223", 2500000);
		inmueble2 = new Propiedad("quinta","Flores 14", 700000);
		inmueble3 = new Propiedad("departamento","Primera Junta 3566", 3800000);
		inmueble4 = new Propiedad("rancho","ruta0",2000000);
		
		cliente1 = new Cliente("Nico","Vaccaro","San Luis 2324",63,100000,inmueble1);
		cliente2 = new Cliente("Gian","Vaccaro","San Luis 1223",20,80000,inmueble2);
		cliente3 = new Cliente("Ailen","Martinez","Pelegrini 2006",24,400000,inmueble3);
		cliente4 = new Cliente("Gus","Vaccaro","Prolo 222", 63, 650000, inmueble4);
		
		credito1 = new CreditoHipotecario(cliente1, 250000d, 6);
		credito2 = new CreditoHipotecario(cliente2, 500000d, 12);
		credito3 = new CreditoHipotecario(cliente3, 1000000d, 8);
		credito4 = new CreditoHipotecario(cliente4, 2000000d, 48);
		
	}
	@Test
	void testMontoTotal() {
		
		assertEquals(250000,credito1.getMontoTotal());
		assertEquals(500000,credito2.getMontoTotal());
		assertEquals(1000000,credito3.getMontoTotal());
		assertEquals(2000000,credito4.getMontoTotal());
	}
	@Test 
	void testMontoCuota() {
		
		assertEquals(41666.666666666664,credito1.getMontoCuota());
		assertEquals(41666.666666666664,credito2.getMontoCuota());
		assertEquals(125000,credito3.getMontoCuota());
		assertEquals(41666.666666666664,credito4.getMontoCuota());
	}
	@Test
	void testVerificarCliente() {
		
		assertTrue(credito1.getSolicitante().equals(cliente1));
		assertTrue(credito2.getSolicitante().equals(cliente2));
		assertTrue(credito3.getSolicitante().equals(cliente3));
		assertTrue(credito4.getSolicitante().equals(cliente4));
	}
	@Test
	void testValidacionSueldoMensual() {
		
		assertTrue(credito1.validacionCuotaMensual());
		assertFalse(credito2.validacionCuotaMensual());
		assertTrue(credito3.validacionCuotaMensual());
		assertTrue(credito4.validacionCuotaMensual());
	}
	@Test
	void testValidacionDelValorInmueble() {
		
		assertTrue(credito1.validarValorDePropiedad());
		assertFalse(credito2.validarValorDePropiedad());
		assertTrue(credito3.validarValorDePropiedad());
		assertFalse(credito4.validarValorDePropiedad());
	}
	@Test
	void testValidacionDeEdad() {
		
		assertTrue(credito1.validacionEdad());
		assertTrue(credito2.validacionEdad());
		assertTrue(credito3.validacionEdad());
		assertFalse(credito4.validacionEdad());
	}
	@Test
	void testChequearAceptacionDelCredito() {
		
		assertTrue(credito1.chequeoDeSolicitud());
		assertFalse(credito2.chequeoDeSolicitud());
		assertTrue(credito3.chequeoDeSolicitud());
		assertFalse(credito4.chequeoDeSolicitud());
	}

}
