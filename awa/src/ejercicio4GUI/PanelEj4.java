package ejercicio4GUI;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class PanelEj4 extends JPanel{
	
	JTextField zonaTexto;
	PanelCalc panelC;
	
	public PanelEj4() {
		
		setLayout(null);
		setBackground(Color.blue);
		
		panelC = new PanelCalc(this);
		add(panelC);
		
		zonaTexto = new JTextField();
		zonaTexto.setBounds(290, 50, 400, 50);
		zonaTexto.setEditable(false);
		add(zonaTexto);
	
	}


}
