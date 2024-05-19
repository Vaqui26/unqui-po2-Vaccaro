package ar.edu.unq.po2.tp9.Composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directorio extends TypeFyle{

	//Instancia de variables
	private List<TypeFyle> listaArchivos;
	//Constructores
	public Directorio(String nombre, Date fecha) {
		super(nombre,fecha);
		this.listaArchivos = new ArrayList<TypeFyle>();
	}

	//Metodos
	public void agregarFyle(TypeFyle archivo) {
		
		this.listaArchivos.add(archivo);
		
	}
	public int getTamaño() {
		
		int acumulador = 0;
		for (TypeFyle archivo : listaArchivos) {
			acumulador += archivo.getTamaño();
		}
		
		return acumulador;
	}
}
