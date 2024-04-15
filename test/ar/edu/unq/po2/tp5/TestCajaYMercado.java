package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCajaYMercado {

	private Mercado mercadito;
	private Caja caja1;
	private Caja caja2;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private ProductoCooperativa productoC1;
	private ProductoCooperativa productoC2;
	private ProductoCooperativa productoC3;
	
	@BeforeEach
	void setUp() {
		
		mercadito = new Mercado("MalBicho");
		
		caja1 = new Caja(mercadito);
		caja2 = new Caja(mercadito);
		
		producto1 = new Producto("Leche",1100);
		producto2 = new Producto("Arroz",250);
		producto3 = new Producto("Harina",890);
		productoC1 = new ProductoCooperativa("Fideos",900);
		productoC2 = new ProductoCooperativa("Pan", 1300);
		productoC3 = new ProductoCooperativa("Licor", 1800);
		
	
		mercadito.registrarCaja(caja1);
		mercadito.registrarCaja(caja2);
		mercadito.registraProducto(producto1);
		mercadito.registraProducto(producto2);
		mercadito.registraProducto(producto3);
		mercadito.registraProducto(productoC1);
		mercadito.registraProducto(productoC2);
		mercadito.registraProducto(productoC3);
		
		
		caja1.registrarProductos(producto1);
		caja1.registrarProductos(producto2);
		caja1.registrarProductos(producto3);
		caja2.registrarProductos(productoC1);
		caja2.registrarProductos(productoC2);
		caja2.registrarProductos(productoC3);
	}
	
	@Test
	void testMontoTotalEnCajas() {
		
		assertEquals(2240,caja1.montoTotalAPagar());
		assertEquals(3600,caja2.montoTotalAPagar());
	}
	@Test
	void testLimpiarCajas() {
		
		caja1.limpiarCaja();
		assertEquals(0,caja1.montoTotalAPagar());
		caja2.limpiarCaja();
		assertEquals(0,caja2.montoTotalAPagar());
	}
	@Test
	void testCantidadProductosDelMercado() {
	
		assertEquals(0,mercadito.revisarStock());
	}
}
