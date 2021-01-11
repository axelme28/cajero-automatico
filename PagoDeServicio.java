package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Operaciones;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagoDeServicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagoDeServicio frame = new PagoDeServicio();
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
	public PagoDeServicio() {
		Operaciones opc = new Operaciones();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setLocationRelativeTo(null);
		
		JLabel lblPservicio = new JLabel("Ingrese el moto y luego la opcion deseada");
		lblPservicio.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPservicio.setForeground(Color.WHITE);
		lblPservicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPservicio.setBounds(28, 11, 379, 33);
		contentPane.add(lblPservicio);
		txtMonto = new JTextField();
		txtMonto.setBounds(144, 120, 129, 20);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		JButton btnPluz = new JButton("Pago de luz ");
		btnPluz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double monto = Double.parseDouble(txtMonto.getText());
				opc.pagoServicio(monto, "Luz");
			}
		});
		btnPluz.setBounds(10, 55, 124, 69);
		contentPane.add(btnPluz);
		
		JButton btnPagua = new JButton("Pago de agua ");
		btnPagua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double monto = Double.parseDouble(txtMonto.getText());
				opc.pagoServicio(monto, "Agua");
			}
		});
		btnPagua.setBounds(283, 55, 124, 69);
		contentPane.add(btnPagua);
		
		JButton btnPpredio = new JButton("Pago de predio");
		btnPpredio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double monto = Double.parseDouble(txtMonto.getText());
				opc.pagoServicio(monto, "Predio");
			}
		});
		btnPpredio.setBounds(10, 138, 124, 69);
		contentPane.add(btnPpredio);
		
		JButton btnPtelefone = new JButton("Pago de telefono");
		btnPtelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double monto = Double.parseDouble(txtMonto.getText());
				opc.pagoServicio(monto, "Telefono");
			}
		});
		btnPtelefone.setBounds(283, 138, 124, 69);
		contentPane.add(btnPtelefone);
		
		JLabel lblfondo = new JLabel("New label");
		lblfondo.setIcon(new ImageIcon("C://Users//Axel//Documents//cajero automatico//src//Ventanas//PPP.PNG"));
		lblfondo.setBounds(0, 0, 424, 261);
		contentPane.add(lblfondo);
		

		
		JButton IrMenu = new JButton("Cancelar");
		IrMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu opc = new Menu();
				opc.setVisible(true);
				setVisible(false);
				
				}
			
		});
		IrMenu.setBounds(159, 227, 89, 23);
		contentPane.add(IrMenu);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});;
		Salir.setBounds(318, 227, 89, 23);
		contentPane.add(Salir);
		
		
	}
}



