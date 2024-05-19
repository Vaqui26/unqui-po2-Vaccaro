package ar.edu.unq.po2.tp9.StateStrategy;

public class PantallaInicio extends MaquinaState{

	public PantallaInicio(MaquinaVideoJuego maquina) {
		super(maquina);
	}
	@Override
	public String presionarBoton() {
		
		return "Necesita ingresar minimo una ficha para jugar!";
	}
	
	public void ingresarFicha() {
		
		MaquinaVideoJuego maquina = this.getMaquina();
		maquina.setCantidadFichas(1);
		MaquinaState unaFicha = new InicioUnaFicha(maquina);
		maquina.setEstado(unaFicha);
	}
}
