package br.com.ebix.model;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private String t;
	private int cont;
	private String alun = "";
	
	public Turma(String turma) {
		this.t = turma;
		criarTurma(turma);
	}

	public Turma() {
	}

	//turma dao impl
	public void criarTurma(String turma) {
		for (int i = 1; i <= 20; i++) {
			this.alunos.add(new Aluno(i));
		}
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		for (cont = 0; cont < alunos.size(); cont++) {
			String a = alunos.get(cont).toString();
			alun =alun.concat(a + "\n");
		}
		return  "Turma: "+ this.t +"\n"+ alun;
	}
}
