package principal;

import java.awt.EventQueue;

import Ventanas.Bienvenida;
import Ventanas.Menu;


public class principal {
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
