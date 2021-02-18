package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SistemaJLabel {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JLabel label = new JLabel("Hello World!", JLabel.CENTER);
		label.setBounds(20, 130, 360, 40);
		frame.add(label);
		
		frame.setVisible(true);
	}

}
