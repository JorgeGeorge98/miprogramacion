package ejercicio4GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCalc extends JPanel implements ActionListener{

	JButton siete, ocho, nueve, division, cuatro, cinco, seis, mult, uno, dos, tres, resta, cero, coma, del, suma, result, ans;
	PanelEj4 pPadre; 
	
	String num1 = "";
	String num2 = "";
	String op = "";
	double resultado = 0;
	boolean checkOperador = false;
	boolean checkOperacion = false;
	
	public PanelCalc(PanelEj4 pPadre) {
		
		this.pPadre = pPadre;
		
		setBounds(290, 120, 400, 500);
		setLayout(new GridLayout(5, 4, 5, 5));
		
		siete = new JButton("7");
		ocho = new JButton("8");
		nueve = new JButton("9");
		division = new JButton("/");
		cuatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		mult = new JButton("*");
		uno = new JButton("1");
		dos = new JButton("2");
		tres = new JButton("3");
		resta = new JButton("-");
		cero = new JButton("0");
		coma = new JButton(".");
		del = new JButton("DEL");
		suma = new JButton("+");
		result = new JButton("=");
		
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);
		division.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		mult.addActionListener(this);
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		resta.addActionListener(this);
		cero.addActionListener(this);
		coma.addActionListener(this);
		del.addActionListener(this);
		suma.addActionListener(this);
		result.addActionListener(this);
		
		add(siete);
		add(ocho);
		add(nueve);
		add(division);
		add(cuatro);
		add(cinco);
		add(seis);
		add(mult);
		add(uno);
		add(dos);
		add(tres);
		add(resta);
		add(cero);
		add(coma);
		add(del);
		add(suma);
		add(result);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		//Numero 1
		if(b != division && b != mult && b != resta && b != suma && b != del && b!= result && !checkOperador) {	
			pPadre.zonaTexto.setText(pPadre.zonaTexto.getText()+b.getText());
			num1 += b.getText();
			System.out.println("Numero 1: "+num1);
		} else if(b == division && !checkOperador || b == mult && !checkOperador || b == resta && !checkOperador || b == suma && !checkOperador){
			pPadre.zonaTexto.setText(pPadre.zonaTexto.getText()+b.getText());
			op += b.getText();
			System.out.println("Operador: "+op);
			checkOperador = true;
		}
		
		//Numero 2
		if(b != division && b != mult && b != resta && b != suma && b != del && b!= result && checkOperador) {	
			pPadre.zonaTexto.setText(pPadre.zonaTexto.getText()+b.getText());
			num2 += b.getText();
			System.out.println("Numero 2: "+num2);
		}
		
		//Borrar
		if(b == del) {
			pPadre.zonaTexto.setText("");
			num1 = "";
			num2 = "";
			op = "";
			resultado = 0;
			checkOperador = false;
		}
		
		//Resultado
		try {
			if(b == result && checkOperador) {
				double numero1 = Double.parseDouble(num1);
				double numero2 = Double.parseDouble(num2);
				
				switch(op) {
				case "+":
					resultado = numero1 + numero2;
					pPadre.zonaTexto.setText(Double.toString(resultado));
					break;
				case "-":
					resultado = numero1 - numero2;
					pPadre.zonaTexto.setText(Double.toString(resultado));
					break;
				case "*":
					resultado = numero1 * numero2;
					pPadre.zonaTexto.setText(Double.toString(resultado));
					break;
				case "/":
					resultado = numero1 / numero2;
					pPadre.zonaTexto.setText(Double.toString(resultado));
					break;
				}
				
				checkOperacion = true;
				num1 = Double.toString(resultado);
				num2 = "";
				op = "";
				checkOperador = false;
			}
			
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Error, valor invalido", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}

	}

