package ejercicio1GUI;

import javax.swing.JFrame;

public class VentanaEj1 extends JFrame{
	
	public VentanaEj1() {
		
		PanelEj1 p = new PanelEj1();
		add(p);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450, 75, 460, 610);
		setTitle("Ejercicio1");
		setResizable(true);
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
	}

}
