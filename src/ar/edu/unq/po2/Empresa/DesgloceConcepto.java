package ar.edu.unq.po2.Empresa;

public class DesgloceConcepto {

	private String nombreConcepto;
	private float monto;
	
	public DesgloceConcepto(String nombre, float monto){
		
		this.nombreConcepto = nombre;
		this.monto = monto;
	}
	public String getNombreConcepto() {
		
		return this.nombreConcepto;
	}
	public float getMonto() {
		
		return this.monto;
	}
}
