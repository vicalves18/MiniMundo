package br.com.ebix.test;

import java.util.ArrayList;
import java.util.List;

import br.com.ebix.dao.AlunoDaoImpl;
import br.com.ebix.dao.TurmaDao;
import br.com.ebix.dao.TurmaDaoImpl;
import br.com.ebix.model.Aluno;
import br.com.ebix.model.Turma;

public class TestaTurma {

	public static void main(String[] args) {
		
		
		//List lista = recuperarAlunos();
		//Turma turma1 = new Turma("Turma1",lista);
		
		//AlunoDaoImpl lista = new AlunoDaoImpl();
		//lista.recuperarAlunos();
		Turma turma1 = new Turma("Turma1");
		
//		TurmaDaoImpl turma = new TurmaDaoImpl();
//		turma.listarTurmas();
//		System.out.println(turma);
		
//		for (Turma t : turma) {
//			System.out.println(t);
//		}
		
		//List lista2 = new ArrayList<>();
//		lista2.add(aluno1);
//		lista2.add(aluno3);
//		lista2.add(aluno4);
		
		//Turma turma2 = new Turma("Turma2", lista2);
		System.out.println(turma1);
		System.out.println(turma1.getAlunos());
		//System.out.println(lista.recuperarAlunos());
		//System.out.println(turma1.getAlunos());
		//System.out.println("----------");
		//System.out.println(turma2);
		//System.out.println(turma2.getAlunos());
	}
	
//	public static List<Aluno> recuperarAlunos(){
//		List<Aluno> alunos = new ArrayList<>();
//		
//		Aluno aluno1 = new Aluno("1","Aluno1");
//		Aluno aluno2 = new Aluno("2","Aluno2");
//		Aluno aluno3 = new Aluno("3","Aluno3");
//		Aluno aluno4 = new Aluno("4","Aluno4");
//		
//		alunos.add(aluno1);
//		alunos.add(aluno2);
//		alunos.add(aluno3);
//		alunos.add(aluno4);
//		
//		return alunos;
//	}

}
