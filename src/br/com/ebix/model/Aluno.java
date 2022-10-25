package br.com.ebix.model;

public class Aluno {
	private String nome;
	private int matricula;
	private Boletim boletim;

	public Aluno() {

	}

	public Aluno(int matricula) {
		gerarMatricula(matricula);
		gerarNome(matricula);
		boletimAluno();
	}

	public void gerarNome(int matricula) {
		this.nome = "Aluno" + matricula;
	}

	public void gerarMatricula(int matricula) {
		this.matricula = matricula;

	}

	public void boletimAluno() {
		Boletim b = new Boletim();
		b.boletimCompleto();
		this.boletim = b;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Boletim getBoletim() {
		return boletim;
	}

	@Override
	public String toString() {
		return  "Matricula: " + this.getMatricula() + ", Nome:" + this.getNome() + ", Notas:" 
				+ this.getBoletim().getNotasProvas() + ", Media: " + this.getBoletim().getMedia() 
				+ " ,Status:" + this.getBoletim().getStatus();
	}
  
}

