package ar.edu.unq.po2.tp9.StateStrategy;

public abstract class Mp3State {

	//Instancias de Variables
	private Mp3 reproductor;
	//Constructores
	public Mp3State() {
		
	}
	public Mp3State(Mp3 reproductor) {
		
		this.reproductor = reproductor;
	}
	//Metodos
	public String play(Song cancion) {
		
		Mp3 reproductor = this.getReproductor();
		Mp3State reproduciendo = new Reproduccion(reproductor);
		reproductor.setEstado(reproduciendo);
		
		return "Reproduciendo la cancion";
	}
	
	public abstract String pause();
	
	public void stop() {
		
		Mp3 reproductor = this.getReproductor();
		Mp3State seleccion = new SeleccionCancion(reproductor);
		reproductor.setEstado(seleccion);
	
	}
	
	public Mp3 getReproductor() {
		
		return this.reproductor; 
	}
}
