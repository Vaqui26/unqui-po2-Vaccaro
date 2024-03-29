package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	
	public int numerosPares() {
		
		int contador = 0;
		for (Integer numero : listaNumeros) {
			if(this.esPar(numero))
				contador++;
		}
		return contador;
	}
	private boolean esPar(Integer numero) {
		
		return numero % 2 == 0; 
	}
	public int numerosImpares() {
		
		int contador = 0;
		for(Integer numero : listaNumeros) {
			if(!(this.esPar(numero)))
				contador++;
		}
		return contador;
	}
	public int multiplosDe(int multiplo) {
		
		int contador = 0;
		for(Integer numero : listaNumeros) {
			if(this.esMultiplo(multiplo, numero))
				contador++;
		}
		return contador;
	}
	private boolean esMultiplo(int multiplo, Integer numero) {
		
		return numero % multiplo == 0;
	}
	public void addNumber(Integer numero) {
		
		this.listaNumeros.add(numero);
	}
	/* Ejercicio 2
	 * Contador de digitos pares.
	 */
	public Integer mayorNumeroConDigitosPares() {
		
		Integer maxNumero = 0;
		int maxCantidad = 0;
		for(Integer numero : listaNumeros) {
			
			Integer numRecorrido = numero;
			int contador = 0;
			while(numRecorrido >= 1) {
				int resto = (int)(numRecorrido % 10);
				if(this.esPar(resto) && resto != 0) {
					contador ++;
				}
				numRecorrido = (numRecorrido-resto)/10;
			}
			if(contador > maxCantidad) {
				maxCantidad = contador;
				maxNumero = numero;
			}
			
		}
		
		return maxNumero;
	}
	public int multiplosEntre(int x, int y) {
		
		int maxN = 0;
		int minN = 0;
		if(x > y) {
			maxN = x;
			minN = y;
		}else {
			maxN = y;
			minN = x;
		}
		if( maxN % minN != 0 ) {
			return -1;
		}else {
			return this.mayorNumeroMultiploEntre(maxN, minN);
		}
		
	}
	private int mayorNumeroMultiploEntre(int x, int y) {
		
		int indice = 1000;
		while(indice % x != 0 || indice % y != 0) {
			indice--;
		}
		return indice;
	}
}