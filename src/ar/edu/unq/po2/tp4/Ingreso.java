package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	// Variables de Instancia
	private String mes;
	private String concepto;
	private double montoPercibido;
	
	// Constructores
	public Ingreso() {
		
	}
	public Ingreso(String mes, String concepto, double monto) {
		
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = monto;
	}
	
	//Metodos
	public double getMontoPercibido() {
		
		return this.montoPercibido;
	}
	public double getMontoImponible() {
		
		return this.montoPercibido;
	}
}
