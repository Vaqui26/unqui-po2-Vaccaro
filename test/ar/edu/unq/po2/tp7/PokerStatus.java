package ar.edu.unq.po2.tp7;

public class PokerStatus {
	
	//Instancias de Variables
	
	//Constructores
	
	//Metodos
	/*
	 * Indica verdadero si hay 4 cartas, ingresadas por parametro, tienen el mismo valor numerico.
	 */
	public boolean verificar(String carta1, String carta2, String carta3, 
			String carta4, String carta5) {
		
		String valor1 = transformarCartaAValor(carta1);
		String valor2 = transformarCartaAValor(carta2);
		String valor3 = transformarCartaAValor(carta3);
		String valor4 = transformarCartaAValor(carta4);
		String valor5 = transformarCartaAValor(carta5);
		
		return hayPokerCon(valor1,valor2,valor3,valor4,valor5) ||
				hayPokerCon(valor2,valor1,valor3,valor4,valor5) ||
				hayPokerCon(valor3,valor1,valor2,valor4,valor5) ||
				hayPokerCon(valor4,valor1,valor2,valor3,valor5) ||
				hayPokerCon(valor5,valor1,valor2,valor3,valor4);		
	}
	private String transformarCartaAValor(String carta) {
		
		String valor;
		if(carta.length() > 2) {
			valor = carta.substring(0, 2);
		}else {
			valor = carta.substring(0, 1);
		}
		return valor;
	}
	private boolean hayPokerCon(String valorPrincipal, String valor1, String valor2, String valor3,
			String valor4) {
		
		int contador = 1;
		
		if(valorPrincipal.equals(valor1))
			contador ++;
		if(valorPrincipal.equals(valor2))
			contador ++;
		if(valorPrincipal.equals(valor3))
			contador ++;
		if(valorPrincipal.equals(valor4))
			contador ++;
			
		return contador >= 4;
		
	}

}
