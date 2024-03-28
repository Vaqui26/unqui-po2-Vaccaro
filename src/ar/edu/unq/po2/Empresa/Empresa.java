package ar.edu.unq.po2.Empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private int cuil;
	private List<Empleado> empleados;
	private List<ReciboHaberes> recibos;
	
	public Empresa(String nombre, int cuil) {
		this.nombre = nombre;
		this.cuil = cuil;
		this.empleados = new ArrayList<Empleado>();
		this.recibos = new ArrayList<ReciboHaberes>();
		
	}
	public float montoTotalSueldoNetos() {
		
		float acumuladorSueldoNeto = 0;
		for (Empleado empleado : empleados) {
			acumuladorSueldoNeto += empleado.sueldoNeto();
		}
		return acumuladorSueldoNeto;
		
	}
	public float montoTotalSueldoBrutos() {
		
		float acumuladorSueldoBruto = 0;
		for (Empleado empleado : empleados) {
			acumuladorSueldoBruto += empleado.sueldoBruto();
		}
		return acumuladorSueldoBruto;
	}
	public float montoTotalRetenciones() {
		
		float acumuladorRetenciones = 0;
		for (Empleado empleado : empleados) {
			acumuladorRetenciones += empleado.retenciones();
		}
		return acumuladorRetenciones;	
	}
	public void liquidacionSueldos() {
		// por cada empleado que posea la empresa, crea un 'ReciboHaberes' guardandolo en la lista.
		// Utilizar un foreach para recorrer la lista 'empleados'.
		for (Empleado empleado : empleados) {
			ReciboHaberes recibo = new ReciboHaberes(empleado, LocalDate.now());
			this.recibos.add(recibo);
		}
	}
}
