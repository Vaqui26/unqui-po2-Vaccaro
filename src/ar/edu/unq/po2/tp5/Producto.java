package ar.edu.unq.po2.tp5;

public class Producto implements Factura{

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
	/*
	 * Retorn el precio del Producto.Existe esta funcion para lograr el polimorfismo.
	 */
	public double montoAPagar() {
		
		return this.getPrecio();
	}
	/*
	 * Retora false ya que no es una Factura.
	 */
	public boolean esFactura() {
		
		return false;
	}
	
}
