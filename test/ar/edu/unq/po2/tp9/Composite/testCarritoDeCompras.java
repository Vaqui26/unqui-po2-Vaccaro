package ar.edu.unq.po2.tp9.Composite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCarritoDeCompras {

	private CarritoDeCompras carrito;
	private Product producto1;
	private Product producto2;
	private Product producto3;
	private Product producto4;
	private Product producto5;
	private Product producto6;
	
	@BeforeEach
	void setUp() {
		
		
		producto1 = new Product("Harina",1000);
		producto2 = new Product("Aceite",1800);
		producto3 = new Product("Azucar",750);
		producto4 = new SpecialProduct("Fideos",860);
		producto5 = new SpecialProduct("Papas Fritas",550);
		producto6 = new SpecialProduct("Detergente",900);
		
		List<Product> listaProductos = new ArrayList<Product>();
		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		listaProductos.add(producto4);
		listaProductos.add(producto5);
		listaProductos.add(producto6);
		
		carrito = new CarritoDeCompras(listaProductos);
	}
	
	@Test
	void testCarritoCantidadProductos() {

		//Set Up
		//Exercise
		//Verify
		assertEquals(6,carrito.totalRounded());
	}
	@Test
	void testCarritoTotalPrecioEnProductos() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(5629,carrito.total());
	}
}
