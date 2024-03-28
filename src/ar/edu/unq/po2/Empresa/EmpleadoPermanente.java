package ar.edu.unq.po2.Empresa;

import java.time.LocalDate;
import java.util.ArrayList;


public class EmpleadoPermanente extends Empleado{

	private int cantidadHijos;
	private int aniosAntiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fecha, 
			float sueldo,int cantidadHijos, int antiguedad) {
		
		super(nombre,direccion, estadoCivil, fecha, sueldo);
		this.cantidadHijos = cantidadHijos;
		this.aniosAntiguedad = antiguedad;
		this.aportes = new ArrayList<DesgloceConcepto>();
	
	}
	public float sueldoBruto() {
		int asignacionPorHijo = 150 * this.cantidadHijos;
		int conyuge = this.estadoCivil != "Casado" ? 0 : 100 ;
		int antiguedad = 50 * this.aniosAntiguedad;
		
		if(!banderaSueldoBruto) {
			this.agregarConcepto("Asignacion por Hijo", asignacionPorHijo);
			this.agregarConcepto("Por cónyuge", conyuge);
			this.agregarConcepto("Por antiguedad", antiguedad);
			this.banderaSueldoBruto = true;
		}
		return this.sueldoBasico + asignacionPorHijo + conyuge + antiguedad ;
		
	}
	
	protected float obraSocial() {
		//Mismo problemas con los magicNumbers.
		float resultado = (float)(this.sueldoBruto() * 0.10 + 20 * this.cantidadHijos);
		if(!banderaObraSocial) { 
			this.agregarConcepto("ObraSocial",resultado);
			this.banderaObraSocial = true;
		}
		return resultado;
	}
	protected float jubilacion() {
		// magicNumbers otra vez.
		float resultado = (float)(this.sueldoBruto() * 0.15);
		if(!banderaJubilacion) {
			this.agregarConcepto("Jubilacion", resultado);
			this.banderaJubilacion = true;
		}
		return resultado;
	}
}
