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
	 * Indica verdadero si las primeras 5 cartas ingresadas por parametros le ganan a las otras 5 basandose en las jugadas del poker.
	 * Observacion : las cartas del 1 al 5 representan una mano, y las de 6 al 10 la mano a comparar. 
	 */
	public boolean verificarSiManoGanaContra(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5,
			Carta carta6, Carta carta7, Carta carta8, Carta carta9, Carta carta10) {
		
		String jugadaDelPrimerJugador = this.verificar(carta1, carta2, carta3, carta4, carta5);
		String jugadaDelSegundoJugador = this.verificar(carta6, carta7, carta8, carta9, carta10);
		
		if(jugadaDelPrimerJugador.equals("Poquer") && !(jugadaDelSegundoJugador.equals("Poquer"))) {
			return true;
		}else if (jugadaDelPrimerJugador.equals("Poquer") && jugadaDelSegundoJugador.equals("Poquer")) {
			Carta cartaMasFuertePrimerJugador = this.cartaMasFuerteConPoker(carta1,carta2,carta3);
			Carta cartaMasFuerteSegundoJugador = this.cartaMasFuerteConPoker(carta6,carta7,carta8);
			
			return cartaMasFuertePrimerJugador.esSuperiorA(cartaMasFuerteSegundoJugador);
		} else if(jugadaDelSegundoJugador.equals("Poquer")) {
			return false;
		}
		if(jugadaDelPrimerJugador.equals("Color") && !(jugadaDelSegundoJugador.equals("Color"))){
			return true;
		}else if(jugadaDelPrimerJugador.equals("Color") && jugadaDelSegundoJugador.equals("Color")){
			Carta cartaMasFuertePrimerJugador = this.cartaMasFuerteDe(carta1,carta2,carta3,carta4,carta5);
			Carta cartaMasFuerteSegundoJugador = this.cartaMasFuerteDe(carta6,carta7,carta8,carta9,carta10);
			
			return cartaMasFuertePrimerJugador.esSuperiorA(cartaMasFuerteSegundoJugador);
		} else if(jugadaDelSegundoJugador.equals("Color")) {
			return false;
		}
		if(jugadaDelPrimerJugador.equals("Trio") && !(jugadaDelSegundoJugador.equals("Trio"))) {
			return true;
		}else if(jugadaDelPrimerJugador.equals("Trio") && jugadaDelSegundoJugador.equals("Trio")){
			Carta cartaMasFuertePrimerJugador = this.cartaMasFuerteConTrio(carta1,carta2,carta3,carta4,carta5);
			Carta cartaMasFuerteSegundoJugador = this.cartaMasFuerteConTrio(carta6,carta7,carta8,carta9,carta10);
			
			return cartaMasFuertePrimerJugador.esSuperiorA(cartaMasFuerteSegundoJugador);
		} else if(jugadaDelSegundoJugador.equals("Trio")) {
			return false;
		}
		
		Carta cartaMasFuertePrimerJugador = this.cartaMasFuerteDe(carta1,carta2,carta3,carta4,carta5);
		Carta cartaMasFuerteSegundoJugador = this.cartaMasFuerteDe(carta6,carta7,carta8,carta9,carta10);
		
		return cartaMasFuertePrimerJugador.esSuperiorA(cartaMasFuerteSegundoJugador);
	}
	/*
	 * Retorna la carta con mayor valor.
	 * Predondicion : las carta que ingresan por parametro deben venir de una mano que contenga poker.
	 */
	private Carta cartaMasFuerteConPoker(Carta carta1, Carta carta2, Carta carta3) {
		
		if(carta1.getValor() == carta2.getValor())
			return carta1;
		else
			return carta3;
	}
	/*
	 * Retorna la carta con mayor valor.
	 * Observacion : con valor no nos referimos al numerico sino al peso que tiene jugando al poker.
	 */
	private Carta cartaMasFuerteDe(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		Carta cartaMasFuerte;
		
		if(carta1.esSuperiorA(carta2))
			cartaMasFuerte = carta1;
		else
			cartaMasFuerte = carta2;
		if(carta3.esSuperiorA(cartaMasFuerte))
			cartaMasFuerte = carta3;
		if(carta4.esSuperiorA(cartaMasFuerte))
			cartaMasFuerte = carta4;
		if(carta5.esSuperiorA(cartaMasFuerte))
			cartaMasFuerte = carta5;
		
		return cartaMasFuerte;
	}
	/*
	 * Retorna la carta donde su valor se repite 3 veces entre las 5 cartas.
	 * Observacion: no es la mejor solucion pero para el ejercicio resuelve.
	 */
	private Carta cartaMasFuerteConTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		int valor1 = carta1.getValor();
		int valor2 = carta2.getValor();
		int valor3 = carta3.getValor();
		int valor4 = carta4.getValor();
		int valor5 = carta5.getValor();
		
		if(valor1 == valor2 && valor1 == valor3)
			return carta1;
		if(valor1 == valor2 && valor1 == valor4)
			return carta1;
		if(valor1 == valor2 && valor1 == valor5)
			return carta1;
		if(valor2 == valor3 && valor2 == valor4)
			return carta2;
		if(valor2 == valor3 && valor2 == valor5) {
			return carta2;
		}else {
			return carta3;
		}
	}

}
