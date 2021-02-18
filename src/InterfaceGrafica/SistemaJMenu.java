package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SistemaJMenu {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem menuItem = new JMenuItem("Olá!");
				
		menu.add(menuItem);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		
		frame.setVisible(true);
	}

}