package InterfaceGrafica;

import javax.swing.JFrame;

import javax.swing.JScrollBar;


public class SistemaJScrollBar {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
		scrollBar.setBounds(20, 130, 360, 40);
		frame.add(scrollBar);
		
		frame.setVisible(true);
	}

}

