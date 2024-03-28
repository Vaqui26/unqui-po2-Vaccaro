package ar.edu.unq.po2.Empresa;

import java.time.LocalDate;
import java.util.ArrayList;


public class EmpleadoContratado extends Empleado{

	private int numeroContrato;
	private String medioPago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fecha, 
			float sueldo,int numeroContrato, String medioPago) {
		
		super(nombre, direccion, estadoCivil, fecha, sueldo);
		this.numeroContrato = numeroContrato;
		this.medioPago = medioPago;
		this.aportes = new ArrayList<DesgloceConcepto>();
	
	}
	public float sueldoBruto() {
		
		return this.sueldoBasico;
	}
	protected float obraSocial() {
		
		return 0;
	}
	protected float jubilacion() {
		
		return 0;
	}
	@Override
	public float retenciones() {
		// Reutilizo una de las banderas ya creadas en la clase 'Empleado'. Y hay magicNumber.
		int retencionConstante = 50;
		if(!banderaObraSocial) {
			this.agregarConcepto("Gastos Administrativos Contractuales", retencionConstante);
			this.banderaObraSocial = true;
		}
		return retencionConstante;
	}
	// Consultar como representar una sobreescritura de un metodo del UML.
}
