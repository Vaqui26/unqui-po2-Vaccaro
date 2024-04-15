package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public int sumar(List<Integer> lista) {
		
		int acumulador = 0;
		for (Integer numero : lista) {
			acumulador += numero;
		}
		return acumulador;
	}
	public int restar(List<Integer> lista) {
		
		int acumulador = 0;
		for (Integer numero : lista) {
			acumulador -= numero;
		}
		return acumulador;
	}
	public int multiplicar(List<Integer> lista) {
		
		int acumulador = 1;
		for (Integer numero : lista) {
			acumulador *= numero;
		}
		return acumulador;
	}
}
