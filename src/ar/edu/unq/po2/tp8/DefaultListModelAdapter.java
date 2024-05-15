package ar.edu.unq.po2.tp8;

import javax.swing.DefaultListModel;

/*
 * Clase Adaptador de la clase 'ListaPalabrasOrdenadas', para poder cumplir el polimorfismo en la
 * clase 'Ventana'.
 */
public class DefaultListModelAdapter extends DefaultListModel<String>{

	private ListaPalabrasOrdenadas colaborador;
	
	public DefaultListModelAdapter() {
		
		this.colaborador = new ListaPalabrasOrdenadas();
	}
	
	@Override
	public void addElement(String elemento) {
		
		colaborador.agregarPalabra(elemento);
	}
	@Override
	public int getSize() {
		
		return colaborador.cantidadDePalabras();
	}
	@Override
	public String getElementAt(int index) {
		
		return colaborador.getPalabraDePosicion(index);
	}
}
