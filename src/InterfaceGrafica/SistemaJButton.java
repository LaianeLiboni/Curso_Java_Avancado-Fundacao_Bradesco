package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SistemaJButton {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JButton button = new JButton("Botão");
		button.setBounds(20, 130, 360, 40);
		frame.add(button);
		
		frame.setVisible(true);
	}

}