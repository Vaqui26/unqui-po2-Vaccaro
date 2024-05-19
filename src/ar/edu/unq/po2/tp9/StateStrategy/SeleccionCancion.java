package ar.edu.unq.po2.tp9.StateStrategy;

public class SeleccionCancion extends Mp3State {
	
	//Instancia de variables
	
	//Constructores
	public SeleccionCancion(Mp3 reproductor) {
		super(reproductor);
	}
	//Metodos
	@Override
	public String play(Song cancion) {
		
		Mp3 reproductor = this.getReproductor();
		Mp3State reproduciendo = new Reproduccion(reproductor);
		reproductor.setEstado(reproduciendo);
		
		return "Reproduciendo la cancion";
	}
	@Override
	public String pause() {
		
		return "Error, no se esta reproduciendo ninguna cancion!";
	}

	@Override
	public void stop() {

	}


}
