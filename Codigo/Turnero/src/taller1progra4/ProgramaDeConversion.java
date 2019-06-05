package taller1progra4;

import controladorEjemplo.ControlConversor;
import modelo.ConversorEurosPesetas;
import vistaEjemplo.InterfazVista;
import vistaEjemplo.VentanaConversor;

public class ProgramaDeConversion {
	public static void main(String[] args) {
		//el modelo
		ConversorEurosPesetas modelo = new ConversorEurosPesetas();
		
		// la vista:
		  InterfazVista vista = new VentanaConversor();
		
		
		// y el control:
		 ControlConversor control = new ControlConversor(vista, modelo);
		 
		 // configura la vista:
		 vista.setControlador(control);
		 
		 // y arranca la interfaz vista:
		 vista.arranca();
		 
	}
	

}
