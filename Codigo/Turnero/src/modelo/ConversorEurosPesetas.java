package modelo;

/*public class ConversorEurosPesetas{
	
	private ComversorEuros conversor;
	
	public ConversorEurosPesetas() {
		conversor = new ComversorEuros (166.386D);
	}
	
	public double eurosApesetas(double cantidad) {
		return conversor.eurosAmoneda(cantidad);
	}
	
	public double pesetasAeuros(double cantidad) {
		return conversor.monedaAeuros(cantidad);
	}
}*/
public class ConversorEurosPesetas extends ComversorEuros{ 
	//adaptador de clase
	//private ComversorEuros conversor;
	public ConversorEurosPesetas() {
		super(166.386D);
		//conversor = new ComversorEuros (166.386D);
	}
	
	public double eurosApesetas ( double cantidad) {
		return eurosAmoneda (cantidad);
		//return conversor.eurosAmoneda(cantidad);
		
	}
	
	public double pesetasAeuros ( double cantidad) {
		return monedaAeuros (cantidad);
		//return conversor.monedaAeuros(cantidad);
	}
	
	//public double eurosApesetas ( double cantidad) {
		//return conversor.eurosAmoneda(cantidad);
	//private ComversorEuros conversor;
	
	//public CoversorEurosPesetas () {
		//conversor = new ComversorEuros (166.386D);
	

}