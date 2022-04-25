package GUIventanaDeDialogo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPpal extends JPanel implements ActionListener{
	
	JTextField usuario;
	JPasswordField pass;
	JButton validar;
	
	public PanelPpal() {
		
		setLayout(new GridLayout(2, 2, 20, 20));
		usuario = new JTextField();
		add(usuario);
		
		pass = new JPasswordField();
		add(pass);
		
		validar = new JButton("Validar");
		validar.addActionListener(this);
		add(validar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		try {
			JButton b = (JButton) e.getSource();
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(this, "Error inesperado", "Todo esta bien", JOptionPane.ERROR_MESSAGE);
			return;
		}
	
	String usuarioRegistrado = "Daniel";
	String contrasena = "123";
	
	if(!usuario.getText().equals(usuarioRegistrado)) {
		
		Object[] botones = {"Vale", "No vale", "Volver", "Reintentar", "Salir"};
		
		JOptionPane.showMessageDialog(this, "Error, usuario desconocido", "Usuario Incorrecto", JOptionPane.DEFAULT_OPTION);
		return;
	}
	
	if(!pass.getText().equals(contrasena)) {
		JOptionPane.showMessageDialog(this, "Contraseña Incorrecta", "Fueraaaa", JOptionPane.WARNING_MESSAGE);
		return;
	}
	
	JOptionPane.showConfirmDialog(this, "Bienvendio "+usuarioRegistrado, "Bienvenido", JOptionPane.OK_CANCEL_OPTION);
	
	}
}

