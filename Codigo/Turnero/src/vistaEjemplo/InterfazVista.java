package vistaEjemplo;

import controladorEjemplo.ControlConversor;

public interface InterfazVista {
	void setControlador(ControlConversor c);
	void arranca ();              //comienza la visualizacion
	
	double getCantidad();         //cantidad a convertir
	void escribeCambio(String s); // texto con la conversion
	
	// constantes que definen las posibles operaciones:
	static final String AEUROS="Pesetas a Euros";
	static final String APESETAS="Euros a Pesetas";

}

