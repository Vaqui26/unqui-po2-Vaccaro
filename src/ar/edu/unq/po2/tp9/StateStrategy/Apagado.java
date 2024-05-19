package ar.edu.unq.po2.tp9.StateStrategy;

public class Apagado extends MaquinaState {
	
	//Constructores
	public Apagado(MaquinaVideoJuego maquina) {
		super(maquina);
	}
	
	@Override
	public String presionarBoton() {
		
		MaquinaVideoJuego maquina = this.getMaquina();
		MaquinaState newState = new PantallaInicio(maquina);
		maquina.setEstado(newState);
		return "Ingrese Fichas para jugar!";
		
	}

	public void ingresarFicha() {
		// TODO Auto-generated method stub

	}

}
