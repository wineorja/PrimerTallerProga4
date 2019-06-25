package controladorTurnero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Servicio;
import vistaTurnero.InterfaceTurnero;

public class ControladorTurnero implements ActionListener{
	
	private InterfaceTurnero vista;
	private Servicio modelo;
	
	
	public ControladorTurnero(InterfaceTurnero vista, Servicio modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		String nombreServicio = vista.getNombreServicio();
		modelo.crearServicios(nombreServicio);
		
		
	}
	


}
