package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {

	// Variables de Instancia
	private List<Ingreso> ingresos;
	
	// Constructores
	public Trabajador() {
		
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	//Metodos
	public void agregarIngreso(Ingreso ingreso) {
		
		this.ingresos.add(ingreso);
	}
	public double getTotalPercibido() {
		
		double acumulador = 0;
		for (Ingreso ingreso : ingresos) {
			acumulador += ingreso.getMontoPercibido();
		}
		return acumulador;
	}
	public double getMontoImponible() {
		
		double acumulador = 0;
		for (Ingreso ingreso : ingresos) {
			acumulador += ingreso.getMontoImponible();
		}
		return acumulador;
	}
	public double getImpuestoAPagar() {
		
		return this.getMontoImponible() * 0.2;
	}
}
