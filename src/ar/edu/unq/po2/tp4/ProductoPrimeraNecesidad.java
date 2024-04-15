package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	// Variables de Instancia
	private double descuento;
	
	// Constructor 
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = 1 - (descuento/100);
	}
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean cuidado,double descuento) {
		super(nombre, precio, cuidado);
		this.descuento = 1 - (descuento/100);
	}
	
	// Metodos
	@Override
	public double getPrecio() {
		return (this.getPrecioAuxiliar() * descuento); 
	}
	public double getDescuento() {
		return this.descuento;
	}
}
