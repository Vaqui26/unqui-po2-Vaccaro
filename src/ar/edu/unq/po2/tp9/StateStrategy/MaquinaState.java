package ar.edu.unq.po2.tp9.StateStrategy;

public abstract class MaquinaState {
	
	//Instancias de variables
	private MaquinaVideoJuego maquina;
	
	//Constructores
	public MaquinaState() {
		
	}
	public MaquinaState(MaquinaVideoJuego maquina) {
		
		this.maquina = maquina;
	}
	public abstract String presionarBoton();
	
	public abstract void ingresarFicha();
	
	public MaquinaVideoJuego getMaquina() {
		return this.maquina;
	}
}
