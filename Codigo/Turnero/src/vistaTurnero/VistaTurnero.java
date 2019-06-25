package vistaTurnero;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladorTurnero.ControladorTurnero;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaTurnero extends JFrame implements InterfaceTurnero{

	private JPanel contentPane;
	private JTextField textNombreServicio;
	private JButton botonServicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaTurnero frame = new VistaTurnero();
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
	public VistaTurnero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearServicios = new JLabel("CREAR SERVICIOS");
		lblCrearServicios.setBounds(194, 33, 91, 14);
		contentPane.add(lblCrearServicios);
		
		JLabel lblNombreServicio = new JLabel("Nombre Servicio:");
		lblNombreServicio.setBounds(83, 80, 91, 14);
		contentPane.add(lblNombreServicio);
		
		textNombreServicio = new JTextField();
		textNombreServicio.setBounds(184, 77, 86, 20);
		contentPane.add(textNombreServicio);
		textNombreServicio.setColumns(10);
		
		botonServicio = new JButton("ACEPTAR");
		botonServicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		botonServicio.setBounds(184, 204, 89, 23);
		contentPane.add(botonServicio);
	}

	@Override
	public void setControlador(ControladorTurnero controladorTurnero) {
		botonServicio.addActionListener(controladorTurnero);
		
		
	}

	@Override
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
		
	}

	@Override
	public String getNombreServicio() {
		return textNombreServicio.getText();
	}

	@Override
	public void escribeCambio(String s) {
		// TODO Auto-generated method stub
		
	}
}
