package ar.edu.unq.po2.tp9.StateStrategy;

public class Mp3 {

	//Instancia de variables
	private Mp3State estado;
	
	//Constructor
	public Mp3() {
		estado = new SeleccionCancion(this);
	}
	
	//Metodos
	public String play(Song cancion) {
		
		return estado.play(cancion);
		
	}
	public String pause() {
		
		return estado.pause();
	}
	public void stop() {
		
		estado.stop();
	}
	public void setEstado(Mp3State estado) {
		
		this.estado = estado; 
	}
}
