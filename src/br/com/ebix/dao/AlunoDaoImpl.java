package br.com.ebix.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.bo.CalculaMedia;
import br.com.ebix.model.Aluno;

public class AlunoDaoImpl implements AlunoDao {
	
	@Override
	public List<Aluno> recuperarAlunos() {
		List<Aluno> alunos = new ArrayList<>();

//		Aluno aluno1 = new Aluno("1", "Aluno1");
//		Aluno aluno2 = new Aluno("2", "Aluno2");
//		Aluno aluno3 = new Aluno("3", "Aluno3");
//		Aluno aluno4 = new Aluno("4", "Aluno4");
//		Aluno aluno5 = new Aluno("5", "Aluno5");
//
//		alunos.add(aluno1);
//		alunos.add(aluno2);
//		alunos.add(aluno3);
//		alunos.add(aluno4);
//		alunos.add(aluno5);
			
		for(int i=1; i<=2 ; i++) {
			
			alunos.add(new Aluno(i,("aluno "+i)));
		}

		return alunos;

	}

}
