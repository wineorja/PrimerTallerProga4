package modelo;


public class ConversorEurosPesetas extends ComversorEuros{ 
	//adaptador de clase
	
	public ConversorEurosPesetas() {
		super(166.386D);
		
	}
	
	public double eurosApesetas ( double cantidad) {
		return eurosAmoneda (cantidad);
		
	}
	
	public double pesetasAeuros ( double cantidad) {
		return monedaAeuros (cantidad);
		
	}
	
	
}