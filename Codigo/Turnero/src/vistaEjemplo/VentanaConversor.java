package vistaEjemplo;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaConversor extends JFrame implements InterfazVista<Object>{
	//private static final long serialVersionUID = 1L;
	private JButton convertirApesetas;
	private JButton convertirAeuros;
	private JTextField cantidad;
	private JLabel resultado;
	
	
	public VentanaConversor() {
		super ("Conversor de Euros yPesetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel PanelPrincipal = new JPanel ();
		PanelPrincipal.setLayout(new BorderLayout (10,10));
		
		cantidad = new JTextField(8);
		JPanel panelaux = new JPanel(); panelaux.add(cantidad);
		PanelPrincipal.add(panelaux, BorderLayout.NORTH);
		
		resultado = new JLabel("Indique una Cantidad y pulse ono de los botones");
		JPanel panelaux2 = new JPanel(); panelaux2.add(resultado);
		PanelPrincipal.add(panelaux2, BorderLayout.CENTER);
		
		convertirApesetas = new JButton ("A pesetas");
		convertirApesetas.setActionCommand(APESETAS);
		convertirAeuros = new JButton ("A euros");
		convertirAeuros.setActionCommand(AEUROS);
		JPanel botonera = new JPanel();
		botonera.add(convertirApesetas); botonera.add(convertirAeuros);
		PanelPrincipal.add(botonera, BorderLayout.SOUTH);
		getContentPane().add(PanelPrincipal);
	}


	@Override
	public void getControlador(Object c) {
		
	}


	@Override
	public void arranca() {
		
	}


	@Override
	public double getCantidad() {
		return 0;
	}


	@Override
	public void escribeCambio(String s) {
		
	
}
	

}
