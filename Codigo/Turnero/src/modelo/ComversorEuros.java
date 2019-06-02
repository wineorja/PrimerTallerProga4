package modelo;

public class ComversorEuros {
	private double cambio;
	
	public ComversorEuros (double valorCambio) {
		//valor de la moneda de 1 euro
		cambio = valorCambio;
		
	}
	
	public double eurosAmoneda ( double cantidad) {
		return cantidad * cambio;
	}
	
	public double monedaAeuros ( double cantidad) {
		return cantidad / cambio;
	}
 
}
