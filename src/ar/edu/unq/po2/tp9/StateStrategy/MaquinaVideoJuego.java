package ar.edu.unq.po2.tp9.StateStrategy;

public class MaquinaVideoJuego {

	//Instancia de variables
	private MaquinaState estado;
	private int fichas;
	
	//Constructores
	public MaquinaVideoJuego() {
		
		this.estado = new Apagado(this);
		this.fichas = 0;
	}
	
	//Metodos
	public String presionarBoton() {
		
		return this.estado.presionarBoton();
	}

	public void ingresarFicha() {
		
		this.estado.ingresarFicha();
		
	}

	public int getCantidadFichas() {
		
		return fichas;
	}
	
	public void setCantidadFichas(int cantidad) {
		
		this.fichas = cantidad;
	}
	public void setEstado(MaquinaState estado) {
		
		this.estado = estado;
	}
	
	
}
