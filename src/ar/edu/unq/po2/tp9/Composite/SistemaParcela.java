package ar.edu.unq.po2.tp9.Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * Sistema el cual se encarga de contar la cantidad que genera una parcela por año.
 * Observacion : una parcela se represenata como una lista de 'Region'.
 */
public class SistemaParcela {

	
	private List<Region> parcela;
	
	public SistemaParcela(List<Region> parcela) {
		
		this.parcela = parcela;
	}
	
	public int gananciaDeLaParcela() {
		
		int acumulador = 0;
		for (Region region : parcela) {
			acumulador += region.ganancias();
		}
		return acumulador;
	}
}
