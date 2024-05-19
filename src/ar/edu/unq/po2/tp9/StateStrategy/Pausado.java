package ar.edu.unq.po2.tp9.StateStrategy;

public class Pausado extends Mp3State {
	
	//Instancia de Variables
	
	//Constructores
	public Pausado(Mp3 reproductor) {
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
		
		return "Error, la cancion ya esta en pausa!";
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}


}
