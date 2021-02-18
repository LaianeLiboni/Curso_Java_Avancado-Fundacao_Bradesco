package Aluno;

public class Sistema{

	public static void main(String[] args) {
		
		//System.out.println("Instanciando a classe Aluno");
		//Aluno joao = new Aluno(347508);
		//Aluno renato = new Aluno("Renato", 250006);
		
		//joao.setMatricula(347508);
		//System.out.println("Média: " + joao.calcularMediaProvas(7.5, 8.8, 9.5));
		//System.out.println("Próximo semestre: " + joao.proximoSemestre());
		//System.out.println("Quantidade de faltas: " + joao.quantidadeDeFaltas());
		//System.out.println("A matricula do aluno João é: " + joao.getMatricula());
		
		System.out.println("Rodando um sistema...");
		
		Aluno [] alunos = new Aluno[50];
		
		int indice = 74;
		
		//if(indice >= 0 && indice < 50) {
			//System.out.println(alunos[indice]);
		//}else {
			//System.out.println("Aluno inexistente");
		//}
		
		//tratamento de exceções
		try {
			// teta executar esse comando
			System.out.println(alunos[indice]);
		}catch(ArrayIndexOutOfBoundsException erro) {
			// se houver algum erro no bloco anterior esse comando será executado
			System.out.println("Aluno inexistente");
		}catch(Exception erro) {
			// pode-se usar um catch para cada tipo de erro possivel no bloco try
			System.out.println("exceção inesperada");
		}finally {
			// esse comando será executado sempre
		}System.out.println("executou o finally");
		

	}

}
