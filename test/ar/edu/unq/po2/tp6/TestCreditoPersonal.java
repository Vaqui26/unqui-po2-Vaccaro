package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCreditoPersonal {

	private CreditoPersonal credito1;
	private CreditoPersonal credito2;
	private CreditoPersonal credito3;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Propiedad inmueble1;
	private Propiedad inmueble2;
	private Propiedad inmueble3;
	
	@BeforeEach
	void setUp() {
		
		inmueble1 = new Propiedad("terronito chico","San luis 1223", 250000);
		inmueble2 = new Propiedad("quinta","Flores 14", 700000);
		inmueble3 = new Propiedad("departamento","Primera Junta 3566", 380000);
		cliente1 = new Cliente("Nico","Vaccaro","San Luis 2324",26,100000,inmueble1);
		cliente2 = new Cliente("Gian","Vaccaro","San Luis 1223",20,80000,inmueble2);
		cliente3 = new Cliente("Ailen","Martinez","Pelegrini 2006",24,400000,inmueble3);
	
		credito1 = new CreditoPersonal(cliente1, 500000d, 12);
		credito2 = new CreditoPersonal(cliente2, 750000d, 6);
		credito3 = new CreditoPersonal(cliente3, 1000000d, 18);
	}
	@Test
	void testMontoTotal() {
		
		assertEquals(500000,credito1.getMontoTotal());
		assertEquals(750000,credito2.getMontoTotal());
		assertEquals(1000000,credito3.getMontoTotal());
	}
	@Test
	void testMontoCuota() {
		
		assertEquals(41666.666666666664,credito1.getMontoCuota());
		assertEquals(125000,credito2.getMontoCuota());
		assertEquals(55555.555555555555,credito3.getMontoCuota());
	}
	@Test
	void testClienteDelCredito() {
		
		assertTrue(credito1.getSolicitante().equals(cliente1));
		assertTrue(credito2.getSolicitante().equals(cliente2));
		assertTrue(credito3.getSolicitante().equals(cliente3));
	}
	@Test
	void testValidacionDelSueldoAnual() {
		
		assertTrue(credito1.validacionIngresoAnual());
		assertTrue(credito2.validacionIngresoAnual());
		assertTrue(credito3.validacionIngresoAnual());
	}
	@Test
	void testValidacionDelSueldoMensual() {
		
		assertTrue(credito1.validacionCuotaMensual());
		assertFalse(credito2.validacionCuotaMensual());
		assertTrue(credito3.validacionCuotaMensual());
	}
	@Test
	void testVerificarSolicitud() {
		
		assertTrue(credito1.chequeoDeSolicitud());
		assertFalse(credito2.chequeoDeSolicitud());
		assertTrue(credito3.chequeoDeSolicitud());
	}
	
	

}
