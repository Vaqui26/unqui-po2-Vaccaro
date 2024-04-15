package ar.edu.unq.po2.tp3;

public class Punto {

	private int x;
	private int y;
	
	public Punto(){
		
		this.setX(0);
		this.setY(0);
		
	}
	public Punto(int x, int y) {
		
		this.setX(x);
		this.setY(y);
	}
	public void moverPunto(int x, int y) {
		
		this.setX(x);
		this.setY(y);
	}
	public Punto nuevoPunto(Punto punto) {
		
		return new Punto(punto.getX() + this.getX(), punto.getY() + this.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean mismoEjeX(int x) {
		
		return this.getX() == x ;
	}
	public boolean mismoEjeY(int y) {
		
		return this.getY() == y ;
	}
}
