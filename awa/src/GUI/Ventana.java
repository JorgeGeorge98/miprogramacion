package GUI;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

	public Ventana() {
		
		Panel panelPrueba = new Panel();
		add(panelPrueba);
		
		/*panelClickMe pClickMe = new panelClickMe();
		add(pClickMe);*/
		
		setSize(460, 610);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(450, 75);
		setTitle("Ventana");
		setResizable(true);
		//setExtendedState(MAXIMIZED_BOTH); 
		
		ImageIcon img = new ImageIcon("C:\\Users\\Jorge\\Pictures\\pepeIcon.png");
		setIconImage(img.getImage());
		
	}
	
}