package ar.edu.unq.po2.tp6;

public class Propiedad {

	// Instancia de Variables
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	// Constructores
	public Propiedad(String descripcion, String direccion, double valor) {
		
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valor;
	}
	// Metodos
	/*
	 * Retorna el valor que posee la Propiedad.
	 */
	public double getValorFiscal() {
		
		return this.valorFiscal;
	}
}
