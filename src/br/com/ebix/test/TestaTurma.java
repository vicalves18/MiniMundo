package br.com.ebix.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.dao.AlunoDaoImpl;
import br.com.ebix.dao.NotaDaoImpl;
import br.com.ebix.dao.TurmaDao;
import br.com.ebix.dao.TurmaDaoImpl;
import br.com.ebix.model.Aluno;
import br.com.ebix.model.BoletimAluno;
import br.com.ebix.model.Turma;

public class TestaTurma {

	public static void main(String[] args) {
		
		
		//List lista = recuperarAlunos();
		//Turma turma1 = new Turma("Turma1",lista);
		
		//AlunoDaoImpl lista = new AlunoDaoImpl();
		//lista.recuperarAlunos();
		
		
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
		//System.out.println(turma1);
		//System.out.println(turma1.getAlunos());
		
//		Aluno aluno = new Aluno("1", "Aluno1");
//		List b = aluno.getNota();
//		System.out.println(b);
//		System.out.println(b.get(0));
//		System.out.println(b.get(1));
//		System.out.println(b.get(2));
		
//		NotaDaoImpl nota = new NotaDaoImpl();
//		List<BigDecimal> n = nota.recuperarNota();
//		System.out.println(n);
//		System.out.println(n.get(0));
//		System.out.println(n.get(1));
//		System.out.println(n.get(2));
		
		Turma turma1 = new Turma("Turma1");
		//BoletimAluno boletim = new BoletimAluno();
		//boletim.gerarBoletim();
		//System.out.println(boletim);
		//System.out.println(lista.recuperarAlunos());
		System.out.println(turma1.getAlunos());
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
