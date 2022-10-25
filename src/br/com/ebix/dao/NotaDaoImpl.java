package br.com.ebix.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.model.Aluno;
import br.com.ebix.model.NotaTeste;

public class NotaDaoImpl implements NotaDao{
	private ArrayList<BigDecimal> notasProvas;
	private Aluno a;
	
	@Override
	public List<BigDecimal> recuperarNota() {
		notasProvas = new ArrayList<BigDecimal>();
		for (int j = 0; j < 3; j++) {
			NotaTeste prova = new NotaTeste();
			//Aluno aluno = new Aluno(a.getMatricula(),a.getNome());
			BigDecimal nota;
			//List a = aluno.getNota();
			nota = prova.getNota();
			//nota = (BigDecimal)a.get(0);
			notasProvas.add(nota);
		}
		return notasProvas;
		
	}

	public ArrayList<BigDecimal> getNotasProvas() {
		return notasProvas;
	}

	public void setNotasProvas(ArrayList<BigDecimal> notasProvas) {
		this.notasProvas = notasProvas;
	}

	public Aluno getA() {
		return a;
	}

	public void setA(Aluno a) {
		this.a = a;
	}

	
}
