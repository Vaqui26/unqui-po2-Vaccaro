package ar.edu.unq.po2.tp9.Composite;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeArchivos implements FyleSystem{

	//Instancia de variables
	private List<TypeFyle> listaArchivos;
	
	//Constructores
	public SistemaDeArchivos(List<TypeFyle> lista) {
		
		this.listaArchivos = new ArrayList<TypeFyle>();
		this.listaArchivos = lista;
	}
	//Metodos
	public int totalSize() {
		
		int acumulador = 0;
		for (TypeFyle archivo : listaArchivos) {
			acumulador += archivo.getTamaño();
		}
		return acumulador;
	}
	public TypeFyle lastModified() {
		
		TypeFyle ultimoArchivoModificado = listaArchivos.getFirst();
		for (TypeFyle archivo : listaArchivos) {
			if(ultimoArchivoModificado.getUltimaFecha().before(archivo.getUltimaFecha()))
				ultimoArchivoModificado = archivo;
		}
		return ultimoArchivoModificado;
	}
	public TypeFyle oldestElement() {
		
		TypeFyle archivoMasViejo = listaArchivos.getFirst();
		for (TypeFyle archivo : listaArchivos) {
			if(archivoMasViejo.getUltimaFecha().after(archivo.getUltimaFecha()))
				archivoMasViejo = archivo;
		}
		return archivoMasViejo;
	}
	@Override
	public void printStructure() {

		// Muestra los archivos por pantalla.
		
	}
	
}
