package InterfaceGrafica;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class SistemaJCheckBox {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("checkBox");
		checkBox.setBounds(20, 130, 360, 40);
		
		
		frame.add(checkBox);
		
		frame.setVisible(true);
	}

}