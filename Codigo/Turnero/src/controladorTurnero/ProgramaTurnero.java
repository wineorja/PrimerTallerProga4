package controladorTurnero;

import modelo.Servicio;
import vistaTurnero.InterfaceTurnero;
import vistaTurnero.VistaTurnero;

public class ProgramaTurnero {

	public static void main(String[] args) {
		//el modelo
				Servicio modelo = new Servicio();
				
				// la vista:
				  InterfaceTurnero vista = new VistaTurnero();
				
				
				// y el control:
				 ControladorTurnero control = new ControladorTurnero(vista, modelo);
				 
				 // configura la vista:
				 vista.setControlador(control);
				 
				 // y arranca la interfaz vista:
				 vista.arranca();

	}

}
