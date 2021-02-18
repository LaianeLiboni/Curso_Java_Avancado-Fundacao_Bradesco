package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class SistemaJRadioButton {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("radioButton");
		radioButton.setBounds(20, 130, 360, 40);
		frame.add(radioButton);
		
		frame.setVisible(true);
	}

}
