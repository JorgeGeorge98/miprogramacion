package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel implements ActionListener{
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	Panel panelPadre;
	
	public PanelBotones(Panel panelPadre) {
		
		this.panelPadre = panelPadre;
		
		setBounds(70, 130, 300, 300);
		setBackground(Color.green);
		setLayout(new GridLayout(3, 3, 10, 10));
		
		b1 = new JButton("1");
		b2 = new JButton("2");		
		b3 = new JButton("3");		
		b4 = new JButton("4");		
		b5 = new JButton("5");		
		b6 = new JButton("6");		
		b7 = new JButton("7");		
		b8 = new JButton("8");	
		b9 = new JButton("9");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource();
		
		String texto = b.getText();
		
		panelPadre.zonaTexto.setText(texto);
		
	}

}
