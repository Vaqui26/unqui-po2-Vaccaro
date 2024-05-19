package ar.edu.unq.po2.tp9.Composite;

import java.util.Date;

public abstract class TypeFyle {

	//Instancia de variables
	
	private String nombre;
	private Date fecha;
	
	//Constructores
	
	public TypeFyle() {
		
	}
	public TypeFyle(String nombre, Date fecha) {
		
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	//Metodos
	
	public String getNombre() {
		
		return this.nombre;
	}
	public Date getUltimaFecha() {
		
		return this.fecha;
	}
	public abstract int getTamaño();
}
