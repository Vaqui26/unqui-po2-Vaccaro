package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	// Instancia de Variables
	private double descuento = 0.9;
	
	// Constructores
	public ProductoCooperativa(String nombre, double precio) {
		
		super(nombre, precio);
		
	}
	
	// Metodos
	/*
	 * Retorn el valor de la variable 'precio' pero aplicando el descuento propio del producto.
	 */
	
	@Override
	public double getPrecio(){
		
		return this.getPrecioAuxiliar() * this.descuento;
	}
}
