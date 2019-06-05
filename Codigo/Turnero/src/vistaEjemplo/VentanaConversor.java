package vistaEjemplo;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controladorEjemplo.ControlConversor;

public class VentanaConversor extends JFrame implements InterfazVista {

	private JButton convertirApesetas;
	private JButton convertirAeuros;
	private JTextField cantidad;
	private JLabel resultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConversor frame = new VentanaConversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

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
	
	public void escribeCambio(String s) {
		resultado.setText(s);
	}
	public double getCantidad() {
		try {
		     return Double.parseDouble(cantidad.getText());
		}catch (NumberFormatException e) {
		     return 0.0D;
		}
	}
	public void setControlador(ControlConversor c) {
		convertirApesetas.addActionListener(c);
		convertirAeuros.addActionListener(c);
	}
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
		
	}
		

}
