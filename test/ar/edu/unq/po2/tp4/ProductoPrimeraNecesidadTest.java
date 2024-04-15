package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d,false,11);
		arroz = new ProductoPrimeraNecesidad("Arroz", 12d, 8);
		
	}
	
//	@Test
//	public void testCalcularPrecio() {
//		assertEquals(new Double(7.2), leche.getPrecio());
//	}
	@Test
	public void testCalcularDescuento() {
		assertEquals(0.89, leche.getDescuento());
		assertEquals(0.92, arroz.getDescuento());
	}
	@Test
	public void testCalcularPrecios() {
		assertEquals(7.12, leche.getPrecio());
		assertEquals(11.04, arroz.getPrecio());
	}
	// RECORDAR preguntar por como solucionar el error del double por su numero exacto.
}
