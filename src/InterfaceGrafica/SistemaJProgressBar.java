package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class SistemaJProgressBar {
	
	public static void main(String [] args) {
		
		JFrame frame = new JFrame ("Meu frame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
		progressBar.setValue(50);

		progressBar.setBounds(20, 130, 360, 15);
		
		frame.add(progressBar);
		
		frame.setVisible(true);
	}

}
