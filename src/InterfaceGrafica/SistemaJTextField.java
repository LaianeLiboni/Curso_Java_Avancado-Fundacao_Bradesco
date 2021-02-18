package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SistemaJTextField {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(20, 130, 360, 40);
		frame.add(textField);
		
		frame.setVisible(true);
	}

}