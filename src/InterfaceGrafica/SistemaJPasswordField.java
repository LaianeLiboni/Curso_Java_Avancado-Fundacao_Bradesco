package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class SistemaJPasswordField {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setBounds(20, 130, 360, 40);
		frame.add(passwordTextField);
		
		frame.setVisible(true);
	}

}