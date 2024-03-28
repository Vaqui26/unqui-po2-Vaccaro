 package ar.edu.unq.po2.Empresa;

import java.time.LocalDate;
import java.util.List;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	String estadoCivil;
	LocalDate fechaNacimiento; 
	float sueldoBasico;
	List<DesgloceConcepto> aportes;
	boolean banderaSueldoBruto = false;
	boolean banderaObraSocial = false;
	boolean banderaJubilacion = false;
 	
	public Empleado() {
		
	}
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fecha, float sueldo) {
		this.setearVariables(nombre, direccion, estadoCivil, fecha, sueldo);
	}
	
	void setearVariables(String nombre, String direccion, String estadoCivil, LocalDate fecha, float sueldo) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fecha;
		this.sueldoBasico = sueldo;
	}
	public int edad() {
		// Consultar como obtener bien el año, o si hay funciones para manejar las fechas.
		int edad = (LocalDate.now()).getYear() - this.fechaNacimiento.getYear();
		return edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public abstract float sueldoBruto();
	
	public float retenciones() {
		
		return this.obraSocial() + this.jubilacion();
	}
	
	abstract float obraSocial();
	
	abstract float jubilacion();
	
	void agregarConcepto(String nombre, float monto) {
		
		DesgloceConcepto concepto = new DesgloceConcepto(nombre, monto);
		this.aportes.add(concepto);
		
	}
	// Consultar por como representar en el UML.
	public List<DesgloceConcepto> getAportes(){
		// Lo malo de esto es que dejo a disponsicion que se me modifique la lista propia desde fuera.
		return this.aportes;
	}
	
}
