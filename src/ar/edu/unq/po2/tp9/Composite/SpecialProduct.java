package ar.edu.unq.po2.tp9.Composite;

public class SpecialProduct extends Product{

	//Constructores
	public SpecialProduct(String nombre,float precio) {
		super(nombre,precio);
	}
	//Metodos
	@Override
	public float getPrice() {
		
		return (float)(this.getPriceAuxiliar() * 0.9);
	}
}
