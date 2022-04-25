package GUIbordes;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPpal extends JPanel implements ActionListener{
	
	JPanel panelN, panelS, panelE, panelW, panelC;
	
	public PanelPpal() {
		
		setLayout(new BorderLayout());
		
		panelN = new JPanel();
		panelN.setBackground(Color.blue);
		
		panelS = new JPanel();
		panelS.setBackground(Color.magenta);
		
		panelE = new JPanel();
		panelE.setBackground(Color.red);
		
		panelW = new JPanel();
		panelW.setBackground(Color.green);
		
		panelC = new JPanel();
		panelC.setBackground(Color.black);
		
		panelN.setPreferredSize(new Dimension(100, 100));
		panelS.setPreferredSize(new Dimension(100, 100));
		panelE.setPreferredSize(new Dimension(100, 100));
		panelW.setPreferredSize(new Dimension(100, 100));
		
		add(panelN, "North");
		add(panelS, "South");
		add(panelE, "East");
		add(panelW, "West");
		add(panelC, "Center");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

