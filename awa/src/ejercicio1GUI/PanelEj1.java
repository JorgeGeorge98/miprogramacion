package ejercicio1GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEj1 extends JPanel implements ActionListener{
	
	JButton boton1, boton2;
	JLabel label;
	
	public PanelEj1() {
		
		setLayout(null);
		
		label = new JLabel("Hola");
		label.setBounds(945, 350, 50, 50);
		add(label);
		
		boton1 = new JButton(":)");
		boton1.setBounds(840, 400, 100, 100);
		boton1.addActionListener(this);
		add(boton1);
		
		boton2 = new JButton(":(");
		boton2.setBounds(960, 400, 100, 100);
		boton2.addActionListener(this);
		add(boton2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		if(b == boton1) {
			label.setText(b.getText());
		}
		
		if(b == boton2) {
			label.setText(b.getText());
		}
		
	}

}
