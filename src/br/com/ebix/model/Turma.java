package br.com.ebix.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.ebix.dao.AlunoDaoImpl;
import br.com.ebix.dao.NotaDaoImpl;

public class Turma {
	private String turma;
	//private Collection<Aluno> alunos;
	//private AlunoDaoImpl alunos;
	private List<AlunoDaoImpl> alunos;
	
	public Turma(String turma/*Collection<Aluno> alunos*/) {
		this.turma = turma;
		this.alunos =new ArrayList<>();
		
		
//		for(Aluno a : alunos) {
//			if(a.getTurma() == null ) {
//				this.alunos.add(a);
//				a.adicionarTurma(this);
//			}else {
//				System.out.println("Aluno ja matriculado "+ a.getNome() + a.getTurma());
//			}
//		}
		
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

//	public Collection<Aluno> getAlunos() {
//		return alunos;
//	}
//
//	public void setAlunos(Collection<Aluno> alunos) {
//		this.alunos = alunos;
//	}
	
//	public AlunoDaoImpl getAlunos() {
//		return alunos;
//	}
//
//	public void setAlunos(AlunoDaoImpl alunos) {
//		this.alunos = alunos;
//	}
	
	
	
	@Override
	public String toString() {
		return " Turma: "+ this.turma;
	}

	public List<AlunoDaoImpl> getAlunos() {
		AlunoDaoImpl alunos = new AlunoDaoImpl();
		List a = alunos.recuperarAlunos();
		return a;
	}

	public void setAlunos(List<AlunoDaoImpl> alunos) {
		this.alunos = alunos;
	}



}
