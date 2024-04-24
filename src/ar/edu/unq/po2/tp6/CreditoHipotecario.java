package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends SolicitudDeCredito implements ValidacionMensual,ValidacionEdad{

	//Instancia de Variables
	private Propiedad propiedad;
	
	//Constructores
	public CreditoHipotecario(Cliente solicitante, double montoSolicitado, int meses) {
		
		super(solicitante,montoSolicitado,meses);
		this.propiedad = solicitante.getPropiedad();
	}
	//Metodos
	/*
	 * Indica verdadero si la solicitud cumple con todas las validaciones.
	 */
	public boolean chequeoDeSolicitud() {
		
		return !(this.validacionCuotaMensual()) && this.validacionEdad();
	}
	/*
	 * Indica verdadero si la cuota mensual supera el 50% del sueldo mensual del cliente.
	 */
	public boolean validacionCuotaMensual() {
		
		double baseMinimaDelSueldo = this.getSolicitante().getSueldoMensual() * 0.50;
		return baseMinimaDelSueldo < this.getMontoCuota();
	}
	/* 
	 * Indica si la edad del solicitante, sumandole los años que dure el credito a pagar, no supera
	 * los 65 años.
	 */
	public boolean validacionEdad() {
		
		int edadFinalizadaElCredito = this.getSolicitante().getEdad() + this.getPlazoCuotas() / 12;
		
		return edadFinalizadaElCredito <= 65 ;
	}
}
