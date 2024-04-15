package ar.edu.unq.po2.tp5;

import java.util.List;
import java.util.ArrayList;

public class Mercado {

	// Instancia de Variables
	private String nombre;
	private List<Caja> listaDeCajas;
	private List<Producto> listaDeProductos;
	
	
	// Constructores 
	public Mercado(String nombre) {
		
		this.nombre = nombre;
		this.listaDeCajas = new ArrayList<Caja>();
		this.listaDeProductos = new ArrayList<Producto>();
		
	}
	
	// Metodos 
	
	/*
	 * Guarda en la lista 'listaDeCajas' la caja ingresada por parametro.
	 */
	public void registrarCaja(Caja caja) {
		
		this.listaDeCajas.add(caja);
	}
	/*
	 * Guarda en la lista 'listaDeProductos' el producto ingresado por parametros.
	 */
	public void registraProducto(Producto producto) {
		
		this.listaDeProductos.add(producto);
	}
	/*
	 * Retorna la cantidad de productos que se encuentran en el Mercado por todas las cajas.
	 */
	public int revisarStock() {
		
		return this.listaDeProductos.size();
	}
	/*
	 * Elimina el 'producto' de la lista de 'listaDeProductos'.
	 */
	public void decrementarStockDe(Producto producto) {
		
		if(this.listaDeProductos.contains(producto))
			this.listaDeProductos.remove(producto);
		else 
			//mensaje de error
			System.out.print("No existe el producto ingresado");
	}
}
