package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel{
	
	PanelBotones panelBotones;
	JTextField zonaTexto;
	
	public Panel() {
		
		setLayout(null);
		setBackground(Color.blue);
		
		panelBotones = new PanelBotones(this);
		add(panelBotones);
		
		zonaTexto = new JTextField();
		zonaTexto.setBounds(70, 50, 300, 50);
		zonaTexto.setEditable(false);
		add(zonaTexto);
	}
}
