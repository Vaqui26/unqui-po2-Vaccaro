package ar.edu.unq.po2.tp9.StateStrategy;

public class InicioUnaFicha extends MaquinaState {

	public InicioUnaFicha(MaquinaVideoJuego maquina) {
		super(maquina);
	}

	@Override
	public String presionarBoton() {
		
		MaquinaVideoJuego maquina = this.getMaquina();
		maquina.setCantidadFichas(0);
		
		return "Comienzo de partida con un solo jugador";
	}

	@Override
	public void ingresarFicha() {
		
		MaquinaVideoJuego maquina = this.getMaquina();
		maquina.setCantidadFichas(2);
		MaquinaState dosfichas = new InicioDosFichas(maquina);
		maquina.setEstado(dosfichas);

	}

}
