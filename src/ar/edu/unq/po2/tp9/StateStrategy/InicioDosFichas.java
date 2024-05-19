package ar.edu.unq.po2.tp9.StateStrategy;

public class InicioDosFichas extends MaquinaState {

	public InicioDosFichas(MaquinaVideoJuego maquina) {
		super(maquina);
	}

	@Override
	public String presionarBoton() {
		
		this.getMaquina().setCantidadFichas(0);
		return "Comienzo de partida cooperativa";
	}

	@Override
	public void ingresarFicha() {
		// TODO Auto-generated method stub

	}

}
