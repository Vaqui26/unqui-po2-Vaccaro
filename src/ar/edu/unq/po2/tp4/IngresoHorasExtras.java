package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso{
	
	// Variables de Instancia
	private int horasExtras;
	
	// Constructores
	public IngresoHorasExtras(String mes, String concepto, double monto, int horasExtras) {
		
		super(mes,concepto,monto);
		this.horasExtras = horasExtras;
	}
	
	//Metodos
	@Override
	public double getMontoImponible() {
		
		return 0;
	}
 
}
