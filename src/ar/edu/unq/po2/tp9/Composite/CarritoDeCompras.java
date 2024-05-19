package ar.edu.unq.po2.tp9.Composite;

import java.util.List;

public class CarritoDeCompras {

	//Instancia de Variables
	List<Product> listaProductos;
	
	//Constructores
	public CarritoDeCompras(List<Product> lista) {
		
		this.setElements(lista);
	}
	//Metodos
	private void setElements(List<Product> lista) {
		
		this.listaProductos = lista;
	}
	public List<Product> getElements(){
		
		return this.listaProductos;
	}
	public int totalRounded() {
		
		return this.listaProductos.size();
	}
	public float total() {
		
		float acumulador = 0;
		for (Product producto : listaProductos) {
			acumulador += producto.getPrice();
		}
		return acumulador;
	}
}
