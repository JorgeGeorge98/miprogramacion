package GUI;

import java.awt.event.*;

import javax.swing.*;

public class panelClickMe extends JPanel implements ActionListener{

	JButton botonPlus, botonMinus;
	JLabel numero;
	Integer n = 0;
	
	public panelClickMe(){
		
		setLayout(null);
		
		numero = new JLabel(n.toString());
		numero.setBounds(945, 350, 50, 50);
		add(numero);
		
		botonPlus = new JButton("+");
		botonPlus.setBounds(840, 400, 100, 100);
		botonPlus.addActionListener(this);
		add(botonPlus);
		
		botonMinus = new JButton("-");
		botonMinus.setBounds(960, 400, 100, 100);
		botonMinus.addActionListener(this);
		add(botonMinus);
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() instanceof JButton) {
			JButton b = (JButton) e.getSource();
			
			if(b == botonPlus) {
				n++;
				numero.setText(n.toString());
			}
			
			if(b == botonMinus) {
				n--;
				numero.setText(n.toString());
			}
		}
		
	}
	
	

}
