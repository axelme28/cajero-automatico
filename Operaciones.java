package Operaciones;

import javax.swing.JOptionPane;


public class Operaciones {
	
	public static double SaldoActual;
	public static String Nombre;
	

	
	public void retiro(double retiro) {
		if (SaldoActual>=retiro) {
			
			
			int opc = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere retirar"+retiro);
			//0 =yes, 1 = no, 2 = cancel
			if (opc==0) {
				SaldoActual -= retiro;
				
			}else if(opc==1) {
				
			}else if(opc==2) {
				
			}
			JOptionPane.showInternalMessageDialog(null, "Retiro realizado con exito");
			
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public void pagoServicio(double servicio,String tipo) {
		if (SaldoActual>=servicio) {
			
			SaldoActual -= servicio;
			JOptionPane.showMessageDialog(null, "Pago de "+tipo+" realizado con exito");
		
			
			
		}else {
			JOptionPane.showInternalMessageDialog(null, "Error: No dispones el saldo duficinete para relizar esta operacion");
		}
		
	}
		
		
	
	
	public void pagoTrajeta(double motTarj) {
		if (SaldoActual>=motTarj) {
			SaldoActual -= motTarj;
			JOptionPane.showInternalMessageDialog(null, "Transferencia relizada con exito");
		}else {
			JOptionPane.showInternalMessageDialog(null, "Error: No dispones el saldo duficinete para relizar esta operacion");
		}
		
		
	}
	
	public double ObtenerSaldo() {
		return SaldoActual;
	}
	
	public void setSaldo(double saldo) {
		SaldoActual = saldo;
	}
	
	public void setNombre(String nom) {
		Nombre = nom;
	}
	
	

}
