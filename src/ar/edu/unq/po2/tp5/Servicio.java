package ar.edu.unq.po2.tp5;

public class Servicio implements Factura{

	// Instanci de Variables
	private double costoPorUnidad;
	private int unidadesConsumidas;
	
	// Constructores
	public Servicio(double costo, int consumo) {
		
		this.costoPorUnidad = costo;
		this.unidadesConsumidas = consumo;
	}
	
	// Metodos
	/*
	 * Retorna el monto a Pagar del mismo Servicio.
	 */
	public double montoAPagar() {
		
		return this.costoPorUnidad * this.unidadesConsumidas;
	}
	/*
	 * Retorna verdadero al ser una Factura.
	 */
	public boolean esFactura() {
		
		return true;
	}
}
