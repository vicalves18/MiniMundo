package br.com.ebix.enums;

public enum StatusEnum {
	APROVADO(1),
	REPROVADO(2),
	RECUPERACAO(3);

	private int status;
	StatusEnum(int i) {
		status = i;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	} 
	
}
