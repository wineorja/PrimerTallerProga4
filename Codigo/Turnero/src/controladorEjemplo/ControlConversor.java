package controladorEjemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ConversorEurosPesetas;
import vistaEjemplo.InterfazVista;

public class ControlConversor implements ActionListener{
	@SuppressWarnings("rawtypes")
	private InterfazVista vista;
	private ConversorEurosPesetas modelo;
	
	@SuppressWarnings("rawtypes")
	public ControlConversor (InterfazVista vista, ConversorEurosPesetas modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		double cantidad = vista.getCantidad();
		if(evento.getActionCommand().equals(InterfazVista.AEUROS)){
			vista.escribeCambio( cantidad + " pesetas son: " + modelo.pesetasAeuros(cantidad) + " euros ");
			
		}
		else if(evento.getActionCommand().equals(InterfazVista.APESETAS)) {
			vista.escribeCambio(cantidad + " euros son: " + modelo.eurosApesetas(cantidad)+ " pesetas ");
		}
		else
			vista.escribeCambio(" ERROR ");
	}
	

}
