package Ventanas;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Operaciones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Menu extends JFrame {
	RetiroDeEfectivo opc_retiro = new RetiroDeEfectivo();
	PagoDeTarjeta opc_pagoTarjeta = new PagoDeTarjeta();
	Operaciones opc = new Operaciones();
	PagoDeServicio opc_Pagoser = new PagoDeServicio();
	
	private JPanel contentPane;
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Menu principal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(21, -2, 381, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnretiro = new JButton("Retiro de efectivo");
		btnretiro.setBounds(63, 44, 128, 78);
		contentPane.add(btnretiro);
		btnretiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				opc_retiro.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnCsaldo = new JButton("Consulta de saldo");
		btnCsaldo.setBounds(213, 44, 128, 78);
		contentPane.add(btnCsaldo);
		btnCsaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showInternalMessageDialog(null, "Tu saldo es de "+opc.ObtenerSaldo());
					
			}
		});
		
		JButton btnPtarjeta = new JButton("Pago de tarjeta");
		btnPtarjeta.setBounds(63, 152, 128, 78);
		contentPane.add(btnPtarjeta);
		btnPtarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				opc_pagoTarjeta.setVisible(true);
				setVisible(false);
					
			}
		});
		
		JButton btnPservicio = new JButton("Pago de servicio");
		btnPservicio.setBounds(213, 152, 128, 78);
		contentPane.add(btnPservicio);
		btnPservicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				opc_Pagoser.setVisible(true);
				setVisible(false);
					
			}
		});
		
		JLabel lblfondomenu = new JLabel("New label");
		lblfondomenu.setIcon(new ImageIcon("C://Users//Axel//Documents//cajero automatico//src//Ventanas//PPP.PNG"));
		lblfondomenu.setBounds(0, -2, 434, 263);
		contentPane.add(lblfondomenu);
	}

}
