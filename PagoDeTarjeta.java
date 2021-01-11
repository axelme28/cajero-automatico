package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Operaciones;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PagoDeTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDeTajeta;
	private JTextField txtMontoA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagoDeTarjeta frame = new PagoDeTarjeta();
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
	public PagoDeTarjeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setLocationRelativeTo(null);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBounds(10, 36, 235, 31);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Rellene los datos que se piden a continuacion: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 11, 373, 14);
		contentPane.add(lblNewLabel);
		
		txtDeTajeta = new JTextField();
		txtDeTajeta.setBounds(10, 78, 235, 31);
		contentPane.add(txtDeTajeta);
		txtDeTajeta.setColumns(10);
		
		txtMontoA = new JTextField();
		txtMontoA.setBounds(10, 120, 120, 28);
		contentPane.add(txtMontoA);
		txtMontoA.setColumns(10);
		

		
		JLabel NOtarjeta = new JLabel("Numero de tarjeta");
		NOtarjeta.setForeground(Color.WHITE);
		NOtarjeta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		NOtarjeta.setBounds(288, 78, 114, 28);
		contentPane.add(NOtarjeta);
		
		JLabel nom = new JLabel("Nombre");
		nom.setForeground(Color.WHITE);
		nom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nom.setBounds(278, 40, 58, 23);
		contentPane.add(nom);
		
		JLabel monto = new JLabel("Monto a pagar ");
		monto.setForeground(Color.WHITE);
		monto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		monto.setBounds(183, 122, 96, 23);
		contentPane.add(monto);
		

		
		JLabel lblfondoPtarjeta = new JLabel("New label");
		lblfondoPtarjeta.setIcon(new ImageIcon("C://Users//Axel//Documents//cajero automatico//src//Ventanas//PPP.PNG"));
		lblfondoPtarjeta.setBounds(0, 0, 409, 213);
		contentPane.add(lblfondoPtarjeta);
		
		
		JButton IrMenu = new JButton("ir al Menu");
		IrMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu opc = new Menu();
				opc.setVisible(true);
				setVisible(false);
				
				}
			
		});
		IrMenu.setBounds(155, 176, 89, 23);
		contentPane.add(IrMenu);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((txtNombre.getText().equals(""))||(txtDeTajeta.getText().equals(""))||(txtMontoA.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Favor de rellenar los campos");	
					
				}else {
					Operaciones pago = new Operaciones();
					double monto = Double.parseDouble(txtMontoA.getText());
					pago.pagoTrajeta(monto);
					
				}
			}
		});
		aceptar.setBounds(10, 176, 89, 23);
		contentPane.add(aceptar);
		
		JButton salir = new JButton("salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});;
		salir.setForeground(Color.BLACK);
		salir.setBackground(Color.RED);
		salir.setBounds(298, 176, 89, 23);
		contentPane.add(salir);
	}
}

