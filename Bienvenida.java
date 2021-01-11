package Ventanas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Operaciones;
import sun.invoke.empty.Empty;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Bienvenida extends JFrame {
	
	
	Operaciones opc = new Operaciones();
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textSaldo;

	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(45, 11, 293, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre.");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 66, 95, 27);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		textNombre.setBackground(new Color(255, 255, 255));
		textNombre.setForeground(new Color(0, 0, 0));
		textNombre.setBounds(109, 63, 223, 37);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		//pasando nombre a la clase 
		String nom = textNombre.getText();
		
		opc.setNombre(nom);
		
		

		
		textSaldo = new JTextField();
		textSaldo.setColumns(10);
		textSaldo.setBounds(109, 168, 223, 37);
		contentPane.add(textSaldo);
		
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Efectivo.");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(26, 171, 89, 27);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(255, 0, 0));
		btnCerrar.setBounds(98, 251, 89, 23);
		contentPane.add(btnCerrar);
		
		JButton btnContinuar = new JButton("Aceptar");
		btnContinuar.setBounds(244, 251, 89, 23);
		contentPane.add(btnContinuar);
		//cuando se apriete el boton continuar
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				if ((textNombre.getText().equals(""))||(textSaldo.getText().equals(""))) {
					menu.setVisible(false);
					JOptionPane.showMessageDialog(null, "Favor de rellenar los campos");
				}
				else {
					menu.setVisible(true);
					double saldo = Double.parseDouble(textSaldo.getText());
					opc.setSaldo(saldo);
					setVisible(false);
				}
			}
		});
		
		
		JLabel lblfondobienvenida = new JLabel("New label");
		lblfondobienvenida.setForeground(new Color(255, 255, 255));
		lblfondobienvenida.setIcon(new ImageIcon("C://Users//Axel//Documents//cajero automatico//src//Ventanas//PPP.PNG"));
		lblfondobienvenida.setBounds(0, 0, 409, 285);
		contentPane.add(lblfondobienvenida);
	}
}
