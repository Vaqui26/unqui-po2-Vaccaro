package ar.edu.unq.po2.tp6;

/*
 * Este clase sirve para calcular el valor de las cuotas de las Solicitudes de Credito. 
 * Ya que en caso de que se modifique o agrege una nueva clase no se deba modificar la clase de 
 * 'SolicitudDeCredito' sino esta clase. Aplico el primer principio SOLID.
 */
public class AsistenteCalcular implements MontoCuota{

	//Instancia de Variables
	
	//Constructores
	
	//Metodos
	/*
	 * Retorna el valor que tendria una cuota.
	 */
	public double montoCuotaMensual(double montoTotal, int mesesCuotas) {
		
		return montoTotal / mesesCuotas;
	}
}
