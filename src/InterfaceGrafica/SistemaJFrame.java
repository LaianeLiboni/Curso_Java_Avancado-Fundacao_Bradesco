package InterfaceGrafica;

import javax.swing.JFrame;

public class SistemaJFrame {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		frame.setVisible(true);
	}

}
