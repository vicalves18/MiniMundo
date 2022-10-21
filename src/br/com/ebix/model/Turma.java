package br.com.ebix.model;

import java.util.ArrayList;
import java.util.Collection;

public class Turma {
	private String turma;
	private Collection<Aluno> alunos;
	
	public Turma(String turma, Collection<Aluno> alunos) {
		this.turma = turma;
		this.alunos = new ArrayList<>();
		
		for(Aluno a : alunos) {
			if(a.getTurma() == null ) {
				this.alunos.add(a);
				a.adicionarTurma(this);
			}else {
				System.out.println("Aluno ja matriculado "+ a.getNome() + a.getTurma());
			}
		}
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public String toString() {
		return " Turma: "+ this.turma;
	}
}
