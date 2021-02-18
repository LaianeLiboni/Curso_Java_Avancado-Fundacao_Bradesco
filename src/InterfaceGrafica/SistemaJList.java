package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JList;


public class SistemaJList {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		String[] itens = { "item 1", "item 2"};
		JList list = new JList(itens);
		
		list.setBounds(20, 130, 360, 40);
		
		frame.add(list);
		
		frame.setVisible(true);
	}

}