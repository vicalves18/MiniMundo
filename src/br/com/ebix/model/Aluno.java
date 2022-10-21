package br.com.ebix.model;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String matricula;
	private Turma turma;
	private Notas nota;
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = new Notas();
		
	}
	
	public void adicionarTurma(Turma turma) {
		if(this.turma == null) {
			this.setTurma(turma);
		}else {
			System.out.println("Aluno "+getNome() + ", esta matriculado na turma: "+getTurma());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
//	public ArrayList<Notas> getNotas() {
//		return notas;
//	}
//
//	public void setNotas(ArrayList<Notas> notas) {
//		this.notas = notas;
//	}
	
//	public Notas registrarNota(double nota) {
//		for(Notas n:notas) {
//			if(n.getNota() == null ) {
//				this.notas.add(n);
//				n.adicionarNota();
//				return n;
//			}
//		}
//		Notas n = new Notas();
//		notas.add(n);
//		return n;
//	}

	public Notas getNota() {
		//String.format("%.2f", x)
		return nota;
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "\nMatricula: "+this.matricula+ ", Nome: "+this.nome + getNota() + "," + getTurma() ;
	}
	
}
