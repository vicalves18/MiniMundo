package br.com.ebix.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NotaTeste {
	BigDecimal nota = new BigDecimal(Math.random() * 10);

		
	
	public BigDecimal getNota() {
		nota = nota.setScale(1, RoundingMode.HALF_EVEN);
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}
}
