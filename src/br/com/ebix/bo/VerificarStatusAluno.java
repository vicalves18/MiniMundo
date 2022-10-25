package br.com.ebix.bo;

import java.math.BigDecimal;

import br.com.ebix.enums.StatusEnum;
import br.com.ebix.model.Aluno;
import br.com.ebix.model.Notas;

public class VerificarStatusAluno {
	private Notas notas;
	private Aluno aluno;
	private BigDecimal media;
	private StatusEnum status;
	private BigDecimal b1,b2;
	
	public void statusAluno() {
		//BigDecimal m =a.getMedia();
		//b1 = new BigDecimal(6);
		double mediaAluno = media.doubleValue();
		if(mediaAluno >= 6 ) {
			status = StatusEnum.APROVADO;
		}else if((mediaAluno <6) && (mediaAluno >=4)) {
			status = StatusEnum.RECUPERACAO;
		}else {
			status = StatusEnum.REPROVADO;
		}
//		if(mediaStatus >= 6) {
//			status = StatusEnum.APROVADO;
//			return status;
//		}
//		if((mediaStatus < 6) || (mediaStatus >=4) ) {
//			status = StatusEnum.RECUPERACAO;
//			return status;
//		}else {
//			status = StatusEnum.REPROVADO;
//			return status;
//		}
		//return StatusEnum.REPROVADO;
	}
	
	public void statusAlunoFinal() {
		double mediaAluno = media.doubleValue();
		if (mediaAluno >= 5) {
			status = StatusEnum.APROVADO;
		} else {
			status = StatusEnum.REPROVADO;
		}
	}
	
	public Notas getNotas() {
		return notas;
	}
	public void setNotas(Notas notas) {
		this.notas = notas;
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
