package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	// Variables de Instancia
	private String nombre;
	private String direccion;
	private List<Producto> listaDeProductos;
	
	// Constructores
	public Supermercado(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaDeProductos = new ArrayList<Producto>();
	}
	
	// Metodos
	public void agregarProducto(Producto producto) {
		
		listaDeProductos.add(producto);
	}
	public double getPrecioTotal() {
		
		float acumulador = 0;
		for (Producto producto : listaDeProductos) {
			acumulador += producto.getPrecio();
		}
		return acumulador;
	}
	public int getCantidadDeProductos() {
		
		return listaDeProductos.size();
	}
}
