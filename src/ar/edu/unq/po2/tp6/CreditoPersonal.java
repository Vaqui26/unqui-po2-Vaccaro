package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends SolicitudDeCredito implements ValidacionAnual,ValidacionMensual{

	//Instancia de Variables
	
	//Constructores
	public CreditoPersonal(Cliente cliente, double montoTotal, int meses) {
		
		super(cliente, montoTotal, meses);
		
	}
	//Metodos
	/*
	 * Indica verdadero si la solicitud de credito fue aceptada, sino falso.
	 */
	public boolean chequeoDeSolicitud() {
		
		return this.validacionIngresoAnual() && this.validacionCuotaMensual();
		
	}
	/*
	 * Indica verdadero si el cliente tiene un ingreso anual mayorigual a 15000.
	 */
	public boolean validacionIngresoAnual() {
		
		return this.getSolicitante().getSueldoAnual() >= 15000;
	}
	/*
	 * Indica verdadero si la el 70% del sueldo mensual del cliente es mayor a la cuota mensual.
	 */
	public boolean validacionCuotaMensual() {
		
		double baseMinimaDelSueldo = this.getSolicitante().getSueldoMensual() * 0.70;
		return baseMinimaDelSueldo > this.getMontoCuota();
	}
}
