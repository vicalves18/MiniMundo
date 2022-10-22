package br.com.ebix.dao;

import java.util.Collection;
import java.util.List;

import br.com.ebix.model.Aluno;

public interface AlunoDao {
	//public Collection<Aluno> getAlunos();
	
	public List<Aluno> recuperarAlunos();
}
