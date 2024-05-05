package ar.edu.unq.po2.tp7;

public class Carta {
	
	// Instacia de Variables
	Palo palo;
	ValorNumerico valor;
	
	//Constructor
	public Carta(Palo palo, ValorNumerico valor) {
		
		this.palo = palo;
		this.valor = valor;
	}
	
	//Metodos
	/*
	 * Retorna el valor numerico que posee la carta.
	 */
	public int getValor() {
		return this.valor.getValor();
	}
	/*
	 * Retorna el palo que posee la carta.
	 */
	public String getPalo() {
		return this.palo.getPalo();
	}
	/*
	 * Indica si la carta es superior, en valor de la carta, a la carta ingresada por parametro.
	 */
	public boolean esSuperiorA(Carta carta) {
		
		return this.valor.esSuperior(carta.valor);
	}
	/*
	 * Indica si la carta ingresada por parametro posee el mismo palo que la carta.
	 */
	public boolean esMismoPaloQue(Carta carta) {
		
		return this.palo.mismoPalo(carta.palo);
	}
}
