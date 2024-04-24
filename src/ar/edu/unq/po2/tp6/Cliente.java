package ar.edu.unq.po2.tp6;

public class Cliente {

	// Instancia de Variables
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoMensual;
	private Propiedad propiedad;
	
	// Constructores
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldo,
			Propiedad propiedad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoMensual = sueldo;
		this.propiedad = propiedad;
		
	}
	// Metodos
	/*
	 * Retorna el 'nombre' del Cliente.
	 */
	public String getNombre() {
		
		return this.nombre;
	}
	/*
	 * Retorna la 'edad' del Cliente.
	 */
	public int getEdad() {
		
		return this.edad;
	}
	/*
	 * Retorna el 'sueldoMensual' del Cliente.
	 */
	public double getSueldoMensual() {
		
		return this.sueldoMensual;
	}
	/*
	 * Retorna la remuneracion anual del Cliente. 
	 */
	public double getSueldoAnual() {
		
		return this.sueldoMensual * 12; 
	}
	/*
	 * Retorna la 'propiedad' del Cliente.
	 * Observacion : la propiedad no quiere decir que el cliente viva en esta misma.
	 */
	public Propiedad getPropiedad() {
		
		return this.propiedad;
	}
}
