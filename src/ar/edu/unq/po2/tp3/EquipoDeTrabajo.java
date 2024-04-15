package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	private String nombreEquipo;
	private List<Persona> listaEquipo;
	
	public EquipoDeTrabajo(String nombre) {
		
		this.setNombreEquipo(nombre);
		listaEquipo = new ArrayList<Persona>();
	}
	
	private void setNombreEquipo(String nombre) {
		
		this.nombreEquipo = nombre;
	}
	public String getNombreEquipo() {
		
		return this.nombreEquipo;
	}
	public int promedioEdad() {
		
		int acumulador = 0;
		for (Persona persona : listaEquipo) {
			acumulador += persona.edad();
		}
		
		return acumulador / listaEquipo.size();
	}
}
