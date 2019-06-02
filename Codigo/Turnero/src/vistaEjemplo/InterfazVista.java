package vistaEjemplo;

public interface InterfazVista<ControlConversor> {
	void getControlador(ControlConversor c);
	void arranca ();  //comienza la visualizacion
	
	double getCantidad(); //cantidad a convertir
	void escribeCambio(String s); // texto con la conversion
	//resultado.setText(s);
	
	// constantes que definen las posibles operaciones:
	static final String AEUROS="Pesetas a Euros";
	static final String APESETAS="Euros a Pesetas";

}





//public void escribeCambio (String s) {
	//resultado.setText(s);
	
//}