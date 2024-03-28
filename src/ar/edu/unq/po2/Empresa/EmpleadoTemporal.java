package ar.edu.unq.po2.Empresa;

import java.time.LocalDate;
import java.util.ArrayList;


public class EmpleadoTemporal extends Empleado{
	
	private LocalDate fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fecha, 
			float sueldo,LocalDate fechaFin, int horasExtras) {
		
		super(nombre, direccion, estadoCivil, fecha, sueldo);
		this.fechaFin = fechaFin;
		this.horasExtras = horasExtras;
		this.aportes = new ArrayList<DesgloceConcepto>();
	
	}
	public float sueldoBruto() {
		
		if(!banderaSueldoBruto) {
			this.agregarConcepto("sueldoBasico", this.sueldoBasico);
			this.agregarConcepto("horasExtras", this.horasExtras);
			this.banderaSueldoBruto = true;
		}
		// Modificar el 40 ya que es un magicNumber.
		return this.sueldoBasico + (this.horasExtras * 40);
	}
	
	protected float obraSocial() {
		//Mismo problemas con los magicNumbers.
		float resultado = (float)(this.sueldoBasico * 0.10);
		if(this.edad() > 50)
			resultado += 25;
		if(!banderaObraSocial) { 
			this.agregarConcepto("ObraSocial",resultado);
			this.banderaObraSocial = true;
		}
		return resultado;
	}
	protected float jubilacion() {
		// MagicNumber en los calculos.
		float resultado = (float)(this.sueldoBasico * 0.10 + 5 * this.horasExtras);
		if(!banderaJubilacion) {
			this.agregarConcepto("Jubilacion", resultado);
			this.banderaJubilacion = true;
		}
		return resultado;
	}
}

