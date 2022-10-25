package br.com.ebix.test;

import br.com.ebix.bo.CalculaMedia;
import br.com.ebix.enums.ProvaEnum;
import br.com.ebix.model.Aluno;
import br.com.ebix.model.Notas;
import br.com.ebix.model.Prova;

public class TestaMedia {

	public static void main(String[] args) {
//		CalculaMedia media = new CalculaMedia();
//		Notas nota1 = new Notas();
//		nota1.getN1();
//		nota1.getN2();
//		nota1.getN3();
//		
//		
//		System.out.println(nota1);
		//System.out.println(media.calculaMedia(ProvaEnum.PESO1, ProvaEnum.PESO2,ProvaEnum.PESO3,nota1));
		//System.out.println(media.calculaMedia(ProvaEnum., nota1));
		
		Aluno aluno = new Aluno(1, "aluno");
		System.out.println(aluno);
		Aluno aluno2 = new Aluno(2, "aluno2");
		System.out.println(aluno2);
		
		CalculaMedia m = new CalculaMedia();
		m.calculaMedia(aluno);
		System.out.println(m.calculaMedia(aluno));
		m.calculaMedia(aluno2);
		System.out.println(m.calculaMedia(aluno2));
	}

}
