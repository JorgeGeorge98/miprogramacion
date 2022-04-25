package GUIventanaDeDialogo;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame{
	
	public VentanaPpal(){
		
		PanelPpal p = new PanelPpal();
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,75,460,610);
		setVisible(true);
		
	}

}
