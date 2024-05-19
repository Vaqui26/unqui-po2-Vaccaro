package ar.edu.unq.po2.tp9.StateStrategy;

public class Reproduccion extends Mp3State {

	//Instancia de Variables
	
	//Constructor
	public Reproduccion(Mp3 reproductor) {
		super(reproductor);
	}
	//Metodos
	@Override
	public String play(Song cancion) {
		
		return "Error, ya hay una cancion reproduccion.";
	}
	@Override
	public String pause() {
		
		Mp3 reproductor = this.getReproductor();
		Mp3State pausa = new Pausado(reproductor);
		reproductor.setEstado(pausa);
		return "Pausa";
	}

	@Override
	public void stop() {
		
		Mp3 reproductor = this.getReproductor();
		Mp3State seleccion = new SeleccionCancion(reproductor);
		reproductor.setEstado(seleccion);
	}


}
