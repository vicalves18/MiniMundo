package br.com.ebix.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.bo.CalculaMedia;
import br.com.ebix.bo.VerificarStatusAluno;
import br.com.ebix.dao.NotaDaoImpl;
import br.com.ebix.enums.ProvaEnum;
import br.com.ebix.enums.StatusEnum;

public class Aluno {
	private String nome;
	private int matricula;
	private Turma turma;
	//private Notas nota;
	private List<NotaDaoImpl> nota;
	private CalculaMedia media;
	private VerificarStatusAluno situacao;
	private StatusEnum status;
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = new ArrayList<>();
		
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
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


	public List<BigDecimal> getNota() {
		NotaDaoImpl nota = new NotaDaoImpl();
		
//		NotaDaoImpl notas = new NotaDaoImpl();
		//List<BigDecimal> n = nota.recuperarNota();
		List a = nota.recuperarNota();
		return a;
	}

	public void setNota(List<NotaDaoImpl> nota) {
		this.nota = nota;
	}
	
	public CalculaMedia getMedia() {
		return media;
	}

	public void setMedia(CalculaMedia media) {
		this.media = media;
	}

//	public <VerificaSituacaoAluno> StatusEnum getSituacao() {
//		VerificarStatusAluno situ = new VerificarStatusAluno();
//		Aluno a = new Aluno(getMatricula(), getNome());
//		status = situ.statusAluno(a.getMedia(), a);
//		return status;
//	}

	public void setSituacao(VerificarStatusAluno situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "\nMatricula: "+getMatricula()+ ", Nome: "+getNome()+ getNota() + ", Media: " + getMedia() /*+ ", Situacao: " + getSituacao()*/;
	}


	
}
