package br.com.ebix.test;

import br.com.ebix.bo.VerificarStatusAluno;
import br.com.ebix.model.Aluno;

public class TesteStatus {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(1,"aluno1");
		aluno.getMedia();
		VerificarStatusAluno status = new VerificarStatusAluno();
		//status.statusAluno(aluno.getMedia(), aluno);
		System.out.println(status);
	}
}
