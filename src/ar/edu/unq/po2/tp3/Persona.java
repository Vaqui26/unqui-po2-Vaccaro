package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	public Persona(String nombre,String apellido, Date fecha) {
		
		this.setearVariables(nombre,apellido,fecha);
	}
	
	private void setearVariables(String nombre,String apellido, Date fecha) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNacimiento(fecha);
		
	}
	
	private void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	private void setFechaNacimiento(Date fecha) {
		
		this.fechaNacimiento = fecha;
	}
	
	public String getNombre() {
		
		return this.nombre + " " + this.apellido;
	}
	
	public Date getFechaNacimiento() {
		
		return this.fechaNacimiento;
	}
	public int edad() {
		
		return LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
 	}
	/* Pregunta 1 : cualquier objeto que llame al metodo edad de una Persona no sabra como se calcula
	 * este mismo. Excelente pregunta, supongo que es 'polimorfismo' aunque se q no.
	 */
	public boolean menorQue(Persona persona) {
		
		return this.edad() > persona.edad();
	}
}
