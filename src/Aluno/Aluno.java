package Aluno;

public class Aluno extends Pessoa{
	
	private String nome;
	private int matricula;
	private String turno;
	private int semestre = 1;
	private int faltas = 0;
	private double nota1, nota2, nota3;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int numeroMatricula) {
		this.matricula = numeroMatricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public Aluno() {
		System.out.println("Construindo um aluno");
	}
	
	public Aluno (int numeroMatricula) {
		this.matricula = numeroMatricula;
		System.out.println("Novo aluno - matricula " + this.matricula);
	}
	
	
	public Aluno(String nomeAluno, int numeroMatricula) {
		this.nome = nomeAluno;
		this.matricula = numeroMatricula;
		System.out.println("Novo aluno - nome: "+ this.nome+" - matricula: " + this.matricula);
	}

	public double calcularMediaProvas(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public int proximoSemestre() {
		return this.semestre + 1;
	}
	
	public int quantidadeDeFaltas() {
		return this.faltas;
	}

	

}
