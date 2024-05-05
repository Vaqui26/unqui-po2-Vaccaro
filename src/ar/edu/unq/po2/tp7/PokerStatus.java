package ar.edu.unq.po2.tp7;

public class PokerStatus {
	
	//Instancias de Variables
	
	//Constructores
	
	//Metodos
	/*
	 * Retorna 'Poquer', 'Trio', 'Color', en caso de que las cartas ingresadas coincidan con alguna
	 * jugadas anteriormente mencionada. Si no retorna 'Nada' mostrando que no posee ninguna jugada del Poker.
	 */
	public String verificar(Carta carta1, Carta carta2, Carta carta3, 
			Carta carta4, Carta carta5) {
		
		if(hayPokerCon(carta1,carta2,carta3,carta4,carta5) ||
			hayPokerCon(carta2,carta1,carta3,carta4,carta5) ||
			hayPokerCon(carta3,carta1,carta2,carta4,carta5) ||
			hayPokerCon(carta4,carta1,carta2,carta3,carta5) ||
			hayPokerCon(carta5,carta1,carta2,carta3,carta4)) {
			return "Poquer";
		} else if(hayColorYPaloCon(carta1,carta2,carta3,carta4,carta5)) {
			return "Color";
		}else if(hayTrioCon(carta1,carta2,carta3,carta4,carta5) ||
				hayTrioCon(carta2,carta1,carta3,carta4,carta5) ||
				hayTrioCon(carta3,carta1,carta2,carta4,carta5) ||
				hayTrioCon(carta4,carta1,carta2,carta3,carta5) ||
				hayTrioCon(carta5,carta1,carta2,carta3,carta4)){
			return "Trio";
		}
		return "Nada";
	
	}
	/*
	 * Retorna el valor numerio que posee la carta ingresada por parametro.
	 */
	private String transformarCartaAValor(String carta) {
		
		String valor;
		if(carta.length() > 2) {
			valor = carta.substring(0, 2);
		}else {
			valor = carta.substring(0, 1);
		}
		return valor;
	}
	/*
	 * Indica verdadero si existen 4 valores iguales entre los 5 parametros.
	 */
	private boolean hayPokerCon(Carta cartaPrincipal, Carta carta1, Carta carta2, Carta carta3,
			Carta carta4) {
		
		int contador = 1;
		
		if(cartaPrincipal.getValor() == carta1.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta2.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta3.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta4.getValor())
			contador ++;
			
		return contador >= 4;
		
	}
	/*
	 * Indica verdaderos si existe 3 valores iguales entre los 5 parametros ingresados.
	 */
	private boolean hayTrioCon(Carta cartaPrincipal, Carta carta1, Carta carta2, Carta carta3,
			Carta carta4) {
		
		int contador = 1;
		
		if(cartaPrincipal.getValor() == carta1.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta2.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta3.getValor())
			contador ++;
		if(cartaPrincipal.getValor() == carta4.getValor())
			contador ++;
			
		return contador >= 3;
		
	}
	/*
	 * Indica verdadero en caso de que las 5 cartas ingresadas por parametro tenga el mismo tipo de palo.
	 */
	private boolean hayColorYPaloCon(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		if(!(carta1.esMismoPaloQue(carta2)))
			return false;
		if(!(carta2.esMismoPaloQue(carta3)))
			return false;
		if(!(carta3.esMismoPaloQue(carta4)))
			return false;
		if(!(carta4.esMismoPaloQue(carta5)))
			return false;
		
		// En caso de que no haya entrado a ningun if quiere decir que todas las cartas poseen el mismo palo.
		return true; 	
	}
	/*
	 * Retorna el palo que posee la carta ingresada por parametro.
	 */
	private String transformarCartaEnColor(String carta) {
		
		String color;
		if(carta.length() > 2) {
			color = carta.substring(2,3);
		}else {
			color = carta.substring(1, 2);
		}
		return color;
	}

}
