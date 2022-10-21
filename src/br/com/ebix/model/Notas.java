package br.com.ebix.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Notas {
	//private Double nota;
	//peso da prova;
	//private Prova prova;

	Random random = new Random();
	double n1 = random.nextDouble()*10;
	double n2 = random.nextDouble()*10;
	double n3 = random.nextDouble()*10;

	
	BigDecimal nota1 = new BigDecimal(n1).setScale(2, RoundingMode.HALF_UP);
	BigDecimal nota2 = new BigDecimal(n2).setScale(2, RoundingMode.HALF_UP);
	BigDecimal nota3 = new BigDecimal(n3).setScale(2, RoundingMode.HALF_UP);
	//double nota = Math.random() *10.0;
	
	//DecimalFormat df = new DecimalFormat("#.00");
	
	public Notas(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		//String.format("%.2f", x)
		//Double.toString(nota1);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
//	public void inserirNotas(Double nota) {
//		this.nota = nota;
//		//this.prova = prova;
//	}
	
//	public void adicionarNota(Double nota) {
//		if(nota == null) {
//			this.setNota(nota);
//		}else {
//			System.out.println("Nota adicionada!");
//		}
//	}
	
	
	public Notas() {
	}	
	
	

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public BigDecimal getNota1() {
		return nota1;
	}

	public void setNota1(BigDecimal nota1) {
		this.nota1 = nota1;
	}

	public BigDecimal getNota2() {
		return nota2;
	}

	public void setNota2(BigDecimal nota2) {
		this.nota2 = nota2;
	}

	public BigDecimal getNota3() {
		return nota3;
	}

	public void setNota3(BigDecimal nota3) {
		this.nota3 = nota3;
	}

	@Override
	public String toString() {
		return " ,Nota1: "+ this.nota1 + " ,Nota2: " + this.nota2 + " ,Nota3: "+ this.nota3;
	}
}
