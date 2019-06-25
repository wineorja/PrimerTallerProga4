package vistaTurnero;

import controladorTurnero.ControladorTurnero;

public interface InterfaceTurnero {
	void setControlador(ControladorTurnero controladorTurnero);
	void arranca ();              //comienza la visualizacion
	
	String getNombreServicio();         //cantidad a convertir
	void escribeCambio(String s); // texto con la conversion
	

}
