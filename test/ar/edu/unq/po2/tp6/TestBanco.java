package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBanco {

	private Banco bancoConCreditos = new Banco();
	private Banco bancoSinCreditos = new Banco(); // Es decir que sus solicitudes no son aceptadas
	private SolicitudDeCredito credito1;
	private SolicitudDeCredito credito2;
	private SolicitudDeCredito creditoNoAceptado1;
	private SolicitudDeCredito creditoNoAceptado2;
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
		
		credito1 = new CreditoPersonal(cliente1, 500000d, 12);
		credito2 = new CreditoHipotecario(cliente3, 1000000d, 8);
		creditoNoAceptado1 = new CreditoPersonal(cliente2, 750000d, 6);
		creditoNoAceptado2 = new CreditoHipotecario(cliente4, 2000000d, 48);
		
		bancoConCreditos.agregarSolicitudDeCredito(credito1);
		bancoConCreditos.agregarSolicitudDeCredito(credito2);
		bancoSinCreditos.agregarSolicitudDeCredito(creditoNoAceptado1);
		bancoSinCreditos.agregarSolicitudDeCredito(creditoNoAceptado2);
	}
	
	@Test
	void testMontoTotalADesemboldarConSolicitudesAceptadas() {

		assertEquals(1500000,bancoConCreditos.montoTotalADesembolsar());
	}
	@Test 
	void testMontoTotalADesemboldarConSolicitudesNoAceptadas(){
		
		assertEquals(0,bancoSinCreditos.montoTotalADesembolsar());
	}

}
