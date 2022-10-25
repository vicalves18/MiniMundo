package br.com.ebix.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

import br.com.ebix.enums.ProvaEnum;
import br.com.ebix.enums.StatusEnum;

public class Boletim {
	private ArrayList<BigDecimal> notasProvas;
	private BigDecimal media;
	private StatusEnum status;

	public void gerarNotas(int i) {
		notasProvas = new ArrayList<BigDecimal>();
		for (int j = 0; j < i; j++) {
			Prova prova = new Prova();
			BigDecimal nota;
			nota = prova.notaProva();
			notasProvas.add(nota);
		}
	}

	public void calcularMedia() {
		BigDecimal peso1 = ProvaEnum.PESO1.getValorPeso();
		BigDecimal peso2 = ProvaEnum.PESO2.getValorPeso();
		BigDecimal peso3 = ProvaEnum.PESO3.getValorPeso();
		BigDecimal pesoTotal = peso1.add(peso2).add(peso3);
		
		BigDecimal prova1 = peso1.multiply(notasProvas.get(0));
		BigDecimal prova2 = peso2.multiply(notasProvas.get(1));
		BigDecimal prova3 = peso3.multiply(notasProvas.get(2));
		
		media = prova1.add(prova2).add(prova3);
		media = media.divide(pesoTotal, MathContext.DECIMAL128);
		media = media.setScale(2, RoundingMode.HALF_EVEN);
	}


	public void statusAluno() {
		double mediaAluno = media.doubleValue();
		if (mediaAluno >= 6) {
			status = StatusEnum.APROVADO;
		} else if ((mediaAluno < 6) && (mediaAluno >= 4)) {
			status = StatusEnum.RECUPERACAO;
		} else {
			status = StatusEnum.REPROVADO;
		}
	}


	public void boletimCompleto() {
		gerarNotas(3);
		calcularMedia();
		statusAluno();
		if (status == StatusEnum.RECUPERACAO) {
			//logica pra provafinal
		}
	}

	public ArrayList<BigDecimal> getNotasProvas() {
		return notasProvas;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public StatusEnum getStatus() {
		return status;
	}
	
	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public String toString() {
		String toString = "Media: " + getMedia() + ", Status: " + getStatus() + ", Notas: "
				+ getNotasProvas();
		return toString;
	}


}
