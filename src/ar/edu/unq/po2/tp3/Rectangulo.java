package ar.edu.unq.po2.tp3;

import java.io.IOException;

public class Rectangulo {

	private Punto puntoInicial;
	private int ancho;
	private int longitud;
	
	public Rectangulo(Punto punto, int ancho, int longitud) {
		
		if(ancho <= 0 || longitud <= 0) {
			System.out.println("Ambos numeros ingresados deben ser mayor a cero.");
			return;
		}			
		this.setearVariables(punto, ancho, longitud);
	}

	private void setearVariables(Punto punto, int ancho, int longitud) {
		
		this.puntoInicial = punto;
		this.ancho = ancho;
		this.longitud = longitud;
	}
	public int ancho() {
		
		return this.getAncho() * this.getLongitud();
	}
	private int getAncho() {
		
		return this.ancho;
	}
	private int getLongitud() {
		
		return this.longitud;
	}
	public int perimetro() {
		
		return  this.ancho() * 2;
	}
	public boolean esHorizontal() {
		
		return this.getAncho() > this.getLongitud();
	}
	public boolean esVertical() {
		
		return this.getLongitud() > this.getAncho();
	}
}
