package ejercicio4GUI;

import javax.swing.JFrame;

public class VentanaEj4 extends JFrame{
	
	public VentanaEj4() {
		
		PanelEj4 p = new PanelEj4();
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 700);
		setTitle("Calculadora");
		setResizable(false);
		setVisible(true);
	}

}
