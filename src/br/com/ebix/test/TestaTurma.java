package br.com.ebix.test;

import br.com.ebix.model.Turma;

public class TestaTurma {
	public static void main(String[] args) {
		Turma turmaA = new Turma("A");
		System.out.println(turmaA);
		System.out.println("------------------------");
		Turma turmaB = new Turma("B");
		System.out.println(turmaB);
		System.out.println("------------------------");
		Turma turmaC = new Turma("C");
		System.out.println(turmaC);
	}
}
