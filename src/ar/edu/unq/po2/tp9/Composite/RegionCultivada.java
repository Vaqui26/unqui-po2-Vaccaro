package ar.edu.unq.po2.tp9.Composite;

/*
 * Una parte de la parcela que tiene una unico cultivo.
 */
public class RegionCultivada extends Region{

	private String cultivo;
	
	public RegionCultivada(String cultivo) {
		super();
		this.cultivo = cultivo;
	}
	@Override
	public int ganancias() {
		
		if(cultivo.equals("Soja"))
			return 500;
		else
			return 300;
		
	}
}
