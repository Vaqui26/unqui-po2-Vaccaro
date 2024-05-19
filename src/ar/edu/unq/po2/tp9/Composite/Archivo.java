package ar.edu.unq.po2.tp9.Composite;

import java.util.Date;

public class Archivo extends TypeFyle{

	//Instancia de variables
	private int tamaño;
	
	//Constructor
	public Archivo(String nombre,int tamaño,Date fecha) {
		super(nombre,fecha);
		this.tamaño = tamaño;
	}
	
	//Metodos
	@Override
	public int getTamaño() {
		
		return this.tamaño;
	}
}
