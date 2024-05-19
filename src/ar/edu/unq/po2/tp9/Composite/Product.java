package ar.edu.unq.po2.tp9.Composite;

public class Product {
	
	//Instancia de Variables
	private String name;
	private float price;
	
	//Constructores
	public Product() {
		
	}
	public Product(String nombre, float precio) {
		
		this.name= nombre;
		this.price = precio;
	}
	//Metodos
	public String getName() {
		
		return name;
	}
	public float getPrice() {
		
		return price;
	}
	protected float getPriceAuxiliar() {
		
		return price;
	}
}
