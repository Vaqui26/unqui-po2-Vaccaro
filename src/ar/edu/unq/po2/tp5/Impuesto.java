package ar.edu.unq.po2.tp5;

public class Impuesto implements Factura{

	// Instancia de Variables
	private double tasa;
	
	// Constructor
	public Impuesto(double tasa) {
		
		this.tasa = tasa;
	}
	
	// Metodos
	/* 
	 * Retora el monto a pagar del mismo Impuesto.
	 */
	public double montoAPagar() {
		
		return tasa;
	}
	/*
	 * Retorna true al ser una Factura.
	 */
	public boolean esFactura() {
		
		return true;
	}
}
