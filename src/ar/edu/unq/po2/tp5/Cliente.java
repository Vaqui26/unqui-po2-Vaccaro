package ar.edu.unq.po2.tp5;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	// Instancia de Variables
	 private String nombre;
	 private List<Producto> listaDeProducto;
	 
	// Constructores
	public Cliente(String nombre) {
		
		this.nombre = nombre;
		this.listaDeProducto = new ArrayList<Producto>();
	}
	
	// Metodos
	/*
	 * Agregar el 'producto' ingresado por parametro a la lista 'listaDeProducto'.
	 */
	public void agregarProducto(Producto producto) {
		
		this.listaDeProducto.add(producto);
	}
	/*
	 * Retorna la lista de Productos del cliente.
	 */
	public List<Producto> getListaDeProductos(){
		
		return this.listaDeProducto;
	}
}
