package ar.edu.unq.po2.tp5;


public class Caja implements Agencia{

	// Instancia de Variables
	private Mercado mercado;
	private double montoTotal = 0;
	
	// Constructor 
	public Caja(Mercado mercado) {
		
		this.mercado = mercado;
	}
	
	// Metodos
	
	/*
	 * Acumula el precio del producto ingresado por parametro y llama el metodo 'decrementarStockDe' 
	 * de nuestra variable 'mercado'.
	 * Ahora ademas registra el pago de servicios/impuestos.
	 */
	public void registrarProductos(Factura factura) {
		
		montoTotal += factura.montoAPagar();
		if(!factura.esFactura())
			this.mercado.decrementarStockDe((Producto)factura);
		else
			this.registrarPago(factura);
				
	}
	
	/*
	 * Retorna la variable interna 'montoTotal'. Que es resultado de la suma de todos los precios 
	 * de los productos. 
	 */
	public double montoTotalAPagar() {
		
		return montoTotal;
	}
	
	/*
	 * Deja la caja vacia. Deja su montoTotal en 0 y su lista vacia para el siguiente cliente. 
	 * Ademas por cada producto que registro manda el mensaje 'decrementarStockDe' a su variable 'mercado'.
	 */
	public void limpiarCaja() {
		
		this.montoTotal = 0;

	}
	
	/*
	 * Avisa a la Agencia sobre el pago del servicio/impuesto.
	 */
	public void registrarPago(Factura factura) {
		// No se bien como reprensentarlo. 
		//Podria ser agencia.recaudar(factura.montoAPager());
	}
	
}
