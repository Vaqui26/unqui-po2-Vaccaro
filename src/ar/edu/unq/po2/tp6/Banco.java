package ar.edu.unq.po2.tp6;

import java.util.List;
import java.util.ArrayList;

public class Banco {

	// Instancia de Variables
		private List<Cliente> clientes;
		private List<SolicitudDeCredito> solicitudesDeCredito;
		// Tambien puedo poner como tipo de la lista 'montoCuota' ya que toda solicitud conoce esta
		// interfaz. Pero decidi dejarlos asi por el momento.
		
	// Constructores
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	}
	// Metodos
	/*
	 * Agrega a la lista 'clientes' un nuevo cliente ingresado por parametro.
	 */
	public void agregarCliente(Cliente cliente) {
		
		this.clientes.add(cliente);
	}
	/*
	 * Agrega a la lista 'solicitudesDeCredito' una nueva solicitud ingresada por parametro.
	 * Observacion : la agrega a la lista indiscriminando el tipo de solicitud y si fue aceptada o no.
	 */
	public void agregarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		
		this.solicitudesDeCredito.add(solicitud);
	}
	/*
	 * Retorna la suma total de todas las solicitudes de Credito que fueron aceptadas. 
	 */
	public double montoTotalADesembolsar() {
		
		double acumulador = 0;
		for (SolicitudDeCredito solicitud: solicitudesDeCredito) {
			acumulador += solicitud.getMontoTotal();
		}
		return acumulador;
	}
}
