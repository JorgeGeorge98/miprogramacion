package ejercicio2GUI;

import javax.swing.JFrame;

public class VentanaEj2 extends JFrame{
	
	public VentanaEj2() {
		
		PanelEj2 p = new PanelEj2();
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 700);
		setTitle("Ejercicio2");
		setVisible(true);
	}

}
