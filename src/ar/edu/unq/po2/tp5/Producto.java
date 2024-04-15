package ar.edu.unq.po2.tp5;

public class Producto {

	// Instancia de Variables
	private String nombre;
	private double precio;
	
	// Constructores
	public Producto() {
		
	}
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	// Metodos
	/*
	 * Retorna el valor de la variable 'precio'.
	 */
	public double getPrecio() {
		
		return this.precio;
	}
	/*
	 * Retorna el valor de la variable 'nombre'.
	 */
	public String getNombre() {
		
		return this.nombre;
	}
	/*
	 * Misma funcionalidad del metodo 'getPrecio'.
	 */
	public double getPrecioAuxiliar() {
		
		return precio;
	}
}
