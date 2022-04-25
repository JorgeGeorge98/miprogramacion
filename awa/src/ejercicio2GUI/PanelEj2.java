package ejercicio2GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj2 extends JPanel implements ActionListener{
	
	JButton b1, b2;
	JLabel l1, l2;
	Integer n1 = 0;
	Integer n2 = 0;
	
	public PanelEj2() {
		
		setLayout(null);
		
		l1 = new JLabel(n1.toString());
		l1.setBounds(405, 200, 50, 10);
		add(l1);
		
		l2 = new JLabel(n1.toString());
		l2.setBounds(515, 200, 50, 10);
		add(l2);
		
		b1 = new JButton("Boton 1");
		b1.setBounds(355, 250, 100, 100);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Boton 2");
		b2.setBounds(475, 250, 100, 100);
		b2.addActionListener(this);
		add(b2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		if(b == b1) {
			n1++;
			l1.setText(n1.toString());
		}
		
		if(b == b2) {
			n2++;
			l2.setText(n2.toString());
		}
	}

}
