package ar.edu.unq.po2.Empresa;


import java.time.LocalDate;
import java.util.List;

public class ReciboHaberes {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private List<DesgloceConcepto> aportesEmpleado;
	
	
	public ReciboHaberes(Empleado empleado, LocalDate fechaEmision) {
		
		this.nombreEmpleado = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = empleado.sueldoBruto();
		this.sueldoNeto = empleado.sueldoNeto();
		this.aportesEmpleado = empleado.getAportes();
	}
}
