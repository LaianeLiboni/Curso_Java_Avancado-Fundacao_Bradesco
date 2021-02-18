package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class SistemaJComboBox {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		String[] itens = {"item 1", "item 2"};
		JComboBox comboBox = new JComboBox(itens);
		comboBox.setBounds(20, 130, 360, 40);
		frame.add(comboBox);
		
		frame.setVisible(true);
	}

}
