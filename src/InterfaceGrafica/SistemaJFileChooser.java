package InterfaceGrafica;

import java.io.File;

import javax.swing.JFileChooser;

public class SistemaJFileChooser {

	public static void main(String[] args) {
		
		JFileChooser fileChooser = new JFileChooser();
		
		int retorno = fileChooser.showOpenDialog(null);
		
		if(retorno == JFileChooser.APPROVE_OPTION){
			File file = fileChooser.getSelectedFile();
			System.out.println(file.toString());
		}else {
			System.out.println("Nenhum arquivo foi selecionado");
		}
	}
}
