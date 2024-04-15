package ar.edu.unq.po2.tp5;

import java.util.List;
import java.util.ArrayList;

public class Caja {

	// Instancia de Variables
	private Mercado mercado;
	private double montoTotal = 0;
	private List<Producto> listaDeProductos;
	
	// Constructor 
	public Caja(Mercado mercado) {
		
		this.mercado = mercado;
		this.listaDeProductos = new ArrayList<Producto>();
	}
	
	// Metodos
	
	/*
	 * Guarda en 'listaDeProductos' cada producto del cliente ingresado por parametro.
	 */
	public void registrarProductos(Cliente cliente) {
		
		List<Producto> productoDelCliente = cliente.getListaDeProductos();
		for (Producto producto : productoDelCliente) {
			this.listaDeProductos.add(producto);
		}
		
	}
	
	/*
	 * Retorna la variable interna 'montoTotal'. Que es resultado de la suma de todos los precios 
	 * de los productos. 
	 */
	public double montoTotalAPagar() {
		
		for (Producto producto : listaDeProductos) {
			montoTotal += producto.getPrecio();
		}
		return montoTotal;
	}
	
	/*
	 * Deja la caja vacia. Deja su montoTotal en 0 y su lista vacia para el siguiente cliente. 
	 * Ademas por cada producto que registro manda el mensaje 'decrementarStockDe' a su variable 'mercado'.
	 */
	public void limpiarCaja() {
		
		this.montoTotal = 0;
		for (Producto producto : listaDeProductos) {
			this.mercado.decrementarStockDe(producto);
		}
		this.listaDeProductos.clear();
	}
	
}
