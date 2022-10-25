package br.com.ebix.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Prova tem nota
public class Prova implements Nota{

	//mesmo que o getNota()
	@Override
	public BigDecimal notaProva() {
		BigDecimal nota = new BigDecimal(Math.random() * 10);
		nota = nota.setScale(1, RoundingMode.HALF_EVEN);
		return nota;
	}

}
