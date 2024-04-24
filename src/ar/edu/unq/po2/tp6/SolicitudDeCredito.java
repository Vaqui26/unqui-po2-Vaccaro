package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	//Instancia de Variables
	private Cliente solicitante;
	private double montoTotal;
	private int plazoEnMeses;
	private AsistenteCalcular asistente;
	
	//Constructores
	/*
	 * Constructor vacio para herencia.
	 */
	public SolicitudDeCredito() {
		
	}
	public SolicitudDeCredito(Cliente solicitante, double montoSolicitado, int meses) {
		
		this.solicitante = solicitante;
		this.montoTotal = montoSolicitado;
		this.plazoEnMeses = meses;
		this.asistente = new AsistenteCalcular();
	}
	//Metodos
	/*
	 * Metodo abstracto para que cada solicitud tenga su propia validacion.
	 */
	abstract public boolean chequeoDeSolicitud();
	
	/*
	 * Retorna el valor solicitado del credito.
	 */
	public double getMontoTotal() {
		
		return this.montoTotal;
	}
	/*
	 * Retorna la cantidad de meses que posee la solicitud de credito.
	 */
	public int getPlazoCuotas() {
		
		return this.plazoEnMeses;
	}
	public double getMontoCuota() {
		
		return asistente.montoCuotaMensual(this.montoTotal, this.plazoEnMeses);
	}
	/*
	 * Retorna el cliente que solicito el credito.
	 */
	public Cliente getSolicitante() {
		
		return this.solicitante;
	}
}
