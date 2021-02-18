package Aluno;

public class Sistema{

	public static void main(String[] args) {
		
		//System.out.println("Instanciando a classe Aluno");
		//Aluno joao = new Aluno(347508);
		//Aluno renato = new Aluno("Renato", 250006);
		
		//joao.setMatricula(347508);
		//System.out.println("M�dia: " + joao.calcularMediaProvas(7.5, 8.8, 9.5));
		//System.out.println("Pr�ximo semestre: " + joao.proximoSemestre());
		//System.out.println("Quantidade de faltas: " + joao.quantidadeDeFaltas());
		//System.out.println("A matricula do aluno Jo�o �: " + joao.getMatricula());
		
		System.out.println("Rodando um sistema...");
		
		Aluno [] alunos = new Aluno[50];
		
		int indice = 74;
		
		//if(indice >= 0 && indice < 50) {
			//System.out.println(alunos[indice]);
		//}else {
			//System.out.println("Aluno inexistente");
		//}
		
		//tratamento de exce��es
		try {
			// teta executar esse comando
			System.out.println(alunos[indice]);
		}catch(ArrayIndexOutOfBoundsException erro) {
			// se houver algum erro no bloco anterior esse comando ser� executado
			System.out.println("Aluno inexistente");
		}catch(Exception erro) {
			// pode-se usar um catch para cada tipo de erro possivel no bloco try
			System.out.println("exce��o inesperada");
		}finally {
			// esse comando ser� executado sempre
		}System.out.println("executou o finally");
		

	}

}
