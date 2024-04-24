package ar.edu.unq.po2.tp6;

/*
 * Interfaz para responder cuanto es el valor de las cuotas a pagar.
 * Hecho en una interfaz ya que puede variar 
 */
public interface MontoCuota {

	public double montoCuotaMensual(double montotTotal,int mesesCuotas);
}
