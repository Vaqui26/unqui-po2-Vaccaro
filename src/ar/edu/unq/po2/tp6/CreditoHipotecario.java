package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends SolicitudDeCredito implements ValidacionMensual,
ValidacionEdad,ValidacionValorDePropiedad{

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
		
		return this.validacionCuotaMensual() && this.validacionEdad() && this.validarValorDePropiedad();
	}
	/*
	 * Indica verdadero si el 50% del sueldo del cliente es mayor a la cuota mensual.
	 */
	public boolean validacionCuotaMensual() {
		
		double baseMinimaDelSueldo = this.getSolicitante().getSueldoMensual() * 0.50;
		return baseMinimaDelSueldo > this.getMontoCuota();
	}
	/* 
	 * Indica si la edad del solicitante, sumandole los años que dure el credito a pagar, no supera
	 * los 65 años.
	 */
	public boolean validacionEdad() {
		
		int edadFinalizadaElCredito = this.getSolicitante().getEdad() + this.getPlazoCuotas() / 12;
		
		return edadFinalizadaElCredito <= 65 ;
	}
	/*
	 * Indica si el 70% del valor la propiedad en garantia supera el monto solicitado en el credito.
	 */
	public boolean validarValorDePropiedad() {
		
		double baseMinimaDelValorDeLaPropiedad = this.propiedad.getValorFiscal() * 0.70;
		return baseMinimaDelValorDeLaPropiedad > this.getMontoTotal();
	}
}
