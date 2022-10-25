package br.com.ebix.bo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import br.com.ebix.dao.AlunoDaoImpl;
import br.com.ebix.dao.NotaDaoImpl;
import br.com.ebix.enums.ProvaEnum;
import br.com.ebix.enums.StatusEnum;
import br.com.ebix.model.Aluno;
import br.com.ebix.model.NotaTeste;
import br.com.ebix.model.Notas;
import br.com.ebix.model.Turma;

public class CalculaMedia {
	private ProvaEnum peso;
	//private Notas nota;
	//private double media;
	private ArrayList<BigDecimal> notas;
	private BigDecimal media;
	private Aluno aluno;
	private StatusEnum status;
	private NotaDaoImpl n,n1,n2;
	
//	public Double calculaMedia(ProvaEnum p1,ProvaEnum p2,ProvaEnum p3,Aluno a) {
//		double peso1 = p1.PESO1.getValorPeso();
//		double peso2 = p2.PESO2.getValorPeso();
//		double peso3 = p3.PESO3.getValorPeso();
//		double nota1 = a.getNota().getN1();
//		double nota2 = a.getNota().getN2();
//		double nota3 =a.getNota().getN3();
//		
//		Double media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
//		return media;
//	}
	public BigDecimal calculaMedia(Aluno a) {
		BigDecimal peso1 = ProvaEnum.PESO1.getValorPeso();
		BigDecimal peso2 = ProvaEnum.PESO2.getValorPeso();
		BigDecimal peso3 = ProvaEnum.PESO3.getValorPeso();
		BigDecimal pesoTotal = peso1.add(peso2).add(peso3);
		
		//Aluno aluno = new Aluno(a.getMatricula(), a.getNome());
		//AlunoDaoImpl aluno = new AlunoDaoImpl();
		List b =a.getNota();
		System.out.println("Aluno  Nota1: " + b.get(0));
		System.out.println("Aluno Nota2: " +b.get(1));
		System.out.println("Aluno  Nota3: " +b.get(2));
//		NotaDaoImpl n =(NotaDaoImpl)b.get(0);
//		NotaDaoImpl n1 =(NotaDaoImpl)b.get(1);
//		NotaDaoImpl n2 =(NotaDaoImpl)b.get(2);
		//NotaDaoImpl n = b.get(0);
		//n1 = aluno.getNota().get(1);
		//n2= aluno.getNota().get(3);
		
		BigDecimal nota1 = (BigDecimal) b.get(0);
		System.out.println("Nota1: " + nota1);
		BigDecimal nota2 = (BigDecimal) b.get(1);
		System.out.println("Nota2: " +nota2);
		BigDecimal nota3 = (BigDecimal) b.get(2);
		System.out.println("Nota3: " +nota3);
		
		BigDecimal prova1 = peso1.multiply(nota1);
		BigDecimal prova2 = peso2.multiply(nota2);
		BigDecimal prova3 = peso3.multiply(nota3);
		
		BigDecimal media1 = prova1.add(prova2).add(prova3);
		BigDecimal media2 = media1.divide(pesoTotal, MathContext.DECIMAL128);
		media = media2.setScale(2, RoundingMode.HALF_EVEN);
		
		//BigDecimal media = ((nota1.multiply(peso1))+(nota2.multiply(peso2))+(nota3.multiply(peso3)))/(peso1+peso2+peso3);
		return media;
	}
//	public StatusEnum statusAluno(BigDecimal media) {
//		double mediaStatus = media.doubleValue();
//		if(mediaStatus >=6) {
//			//status = StatusEnum.APROVADO;
//			return StatusEnum.APROVADO;
//		}else if(mediaStatus < 6 && mediaStatus >=4 ) {
//			status = StatusEnum.RECUPERACAO;
//			return StatusEnum.RECUPERACAO;
//		}//else {
//		//	status = StatusEnum.REPROVADO;
//		//}
//		return StatusEnum.REPROVADO;
//	
//	}

	public ProvaEnum getPeso() {
		return peso;
	}

	public void setPeso(ProvaEnum peso) {
		this.peso = peso;
	}
	
	public ArrayList<BigDecimal> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<BigDecimal> notas) {
		this.notas = notas;
	}

	public BigDecimal getMedia() {
		//CalculaMedia media = new CalculaMedia();
		//aluno = new Aluno(aluno.getMatricula(), aluno.getNome());
		//Double m = media.calculaMedia(ProvaEnum.PESO1, ProvaEnum.PESO2,ProvaEnum.PESO3,aluno);
		//BigDecimal m = calculaMedia(ProvaEnum.PESO1, ProvaEnum.PESO2,ProvaEnum.PESO3,aluno);
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public Aluno getAluno() {
		
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
}
