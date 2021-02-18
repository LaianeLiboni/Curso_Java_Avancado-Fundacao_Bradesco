package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JTextArea;



public class SistemaJTextArea {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 130, 360, 40);
		frame.add(textArea);
		
		frame.setVisible(true);
	}

}
