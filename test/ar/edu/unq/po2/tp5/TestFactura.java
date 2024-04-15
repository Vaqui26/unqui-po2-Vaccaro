package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFactura {

	private Mercado mercado;
	private Caja caja1;
	private Servicio servicio;
	private Impuesto impuesto;
	private Producto producto1;
	private ProductoCooperativa productoC1;
	
	@BeforeEach
	public void setUp() {
		
		mercado = new Mercado("PruebaMercadito");
		caja1 = new Caja(mercado);
		producto1 = new Producto("Leche",1100);
		productoC1 = new ProductoCooperativa("Fideos",900);
		servicio = new Servicio(250,20);
		impuesto = new Impuesto(12000);
		
	}
	
	@Test
	void testCajaSoloConServicioYImpuesto() {
		
		caja1.registrarProductos(impuesto);
		caja1.registrarProductos(servicio);
		assertEquals(17000, caja1.montoTotalAPagar());
	}
	@Test
	void testCajaConProductosYFacturas() {
		
		caja1.registrarProductos(impuesto);
		caja1.registrarProductos(servicio);
		caja1.registrarProductos(producto1);
		caja1.registrarProductos(productoC1);
		assertEquals(18910, caja1.montoTotalAPagar());
	}

}
