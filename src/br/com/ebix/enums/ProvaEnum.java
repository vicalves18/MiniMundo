package br.com.ebix.enums;

import java.math.BigDecimal;

public enum ProvaEnum {
	PESO1(new BigDecimal(1.0)),
	PESO2(new BigDecimal(1.2)),
	PESO3(new BigDecimal(1.4)),
	PESOESPECIAL(new BigDecimal(2.0));
	
	//public double valorPeso;
	private BigDecimal valorPeso;
	ProvaEnum(BigDecimal d) {
		valorPeso = d;
	}
	public BigDecimal getValorPeso() {
		return valorPeso;
	}
	public void setValorPeso(BigDecimal valorPeso) {
		this.valorPeso = valorPeso;
	}
}
