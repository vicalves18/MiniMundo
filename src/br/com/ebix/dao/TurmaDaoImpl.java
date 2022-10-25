package br.com.ebix.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ebix.model.Turma;

public class TurmaDaoImpl implements TurmaDao{

	@Override
	public List<Turma> listarTurmas() {
		List<Turma> turmas= new ArrayList<>();
	
		Turma turma1 = new Turma("Turma1");
		
		turmas.add(turma1);
		
		return turmas;
	}

}
