package ar.edu.unq.po2.tp9.Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * Parte de la parcela que esta dividida en 4 partes con distintos cultivos.
 */
public class RegionDividida extends Region{

	private List<Region> listaDeRegiones;
	
	public RegionDividida() {
		super();
		listaDeRegiones = new ArrayList<Region>();
	}
	
	@Override
	public int ganancias() {
		
		int acumulador = 0;
		for (Region region : listaDeRegiones) {
			acumulador += region.ganancias();
		}
		return acumulador / 4;
	}
	/*
	 * Agrega una region a la lista en caso de que haya menos de 5 elementos.
	 * No contempla si son todos iguales.
	 */
	@Override
	public void agregarRegion(Region region) {
		
		if(listaDeRegiones.size() <= 4)
			this.listaDeRegiones.add(region);
	}
	@Override
	public void borrarRegion(Region region) {
		
		this.listaDeRegiones.remove(region);
	}
}
