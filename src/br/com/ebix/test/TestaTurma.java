package br.com.ebix.test;

import java.util.ArrayList;
import java.util.List;

import br.com.ebix.model.Aluno;
import br.com.ebix.model.Turma;

public class TestaTurma {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("1","Aluno1");
		Aluno aluno2 = new Aluno("2","Aluno2");
		Aluno aluno3 = new Aluno("3","Aluno3");
		Aluno aluno4 = new Aluno("4","Aluno4");
		
		List lista = new ArrayList();
		lista.add(aluno1);
		lista.add(aluno2);
		
		Turma turma1 = new Turma("Turma1",lista);
		
		List lista2 = new ArrayList<>();
		lista2.add(aluno1);
		lista2.add(aluno3);
		lista2.add(aluno4);
		
		Turma turma2 = new Turma("Turma2", lista2);
		
		System.out.println(turma1);
		System.out.println(turma1.getAlunos());
		System.out.println("----------");
		System.out.println(turma2);
		System.out.println(turma2.getAlunos());
	}

}
