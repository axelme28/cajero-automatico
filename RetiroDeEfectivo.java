package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Operaciones;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RetiroDeEfectivo extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	Operaciones opc = new Operaciones();

	public RetiroDeEfectivo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 358, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setLocationRelativeTo(null);
		
		JLabel lbltxtefe = new JLabel("Ingrese la cantidad a retirar");
		lbltxtefe.setForeground(Color.WHITE);
		lbltxtefe.setFont(new Font("Arial", Font.PLAIN, 20));
		lbltxtefe.setHorizontalAlignment(SwingConstants.CENTER);
		lbltxtefe.setBounds(32, 11, 296, 23);
		contentPane.add(lbltxtefe);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double retiro = Double.parseDouble(textCantidad.getText());
				opc.retiro(retiro);
				
			}
		});
		btnAceptar.setBounds(32, 183, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C://Users//Axel//Documents//cajero automatico//src//Ventanas//PPP.PNG"));
		lblNewLabel.setBounds(0, 0, 349, 219);
		contentPane.add(lblNewLabel);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(102, 107, 152, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Otra Cantidad");
		lblNewLabel_1.setBounds(148, 128, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton IrMenu = new JButton("Ir al Menu");
		IrMenu.setBounds(137, 183, 89, 23);
		contentPane.add(IrMenu);
		
		IrMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Menu opc = new Menu();
				opc.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton salir = new JButton("Salir");
		salir.setBounds(239, 183, 89, 23);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});;
		contentPane.add(salir);
	}
}
