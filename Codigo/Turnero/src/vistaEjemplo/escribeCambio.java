package vistaEjemplo;

public class escribeCambio {

	public void escribeCambio(String s) {
		resultado.setText(s);

	}
	
	public double getCantidad() {
		try {
			return Double.parseDouble(Cantidad.getText());
		}
		catch (NumberFormatException e) {
			return 0.0D;
		}
	}

	public void setControlador(ControlConversor c) {
		convertirApesetas.addActionListener(c);
		convertirAeuros.addActionListener(c);
	}
	
	public void arranca() {
		pack(); //coloca los componentes
		setLocationRelativeTo(null); //centra la ventana de la pantalla
		setVisible,(true); // visualiza la ventana
	}

}
