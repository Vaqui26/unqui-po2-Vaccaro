package ar.edu.unq.po2.tp4;

public class Producto {

	// Variables de Instancia
	private String nombre;
	private double precio;
	private boolean programaCuidado;
	
	// Constructor
	public Producto() {
		// Constructor para poder heredar.
	}
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.programaCuidado = false;
	}
	
	public Producto(String nombre, double precio, boolean cuidado) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.programaCuidado = cuidado;
	}
	
	// Metodos
	public double getPrecio() {
		
		return this.precio;
	}
	private void setPrecio(double precio) {
		
		this.precio = precio;
	}
	public String getNombre() {
		
		return this.nombre;
	}
	
	public boolean esPrecioCuidado() {
		
		return this.programaCuidado;
	}
	public void aumentarPrecio(double aumento) {
		
		this.setPrecio(this.getPrecio() * aumento);
	}
	public double getPrecioAuxiliar() {
		
		return this.precio;
	}
}
