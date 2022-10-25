package br.com.ebix.bo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import br.com.ebix.model.Aluno;

public class CalculaMediaFinal {
	private BigDecimal media;
	private List<Aluno> aluno;
	
	public BigDecimal calcularMediaFinal(Aluno a) {
		BigDecimal peso = new BigDecimal(2.0);
		//inserir array com as 3 notas
		//media = media.add(notas.get(3).divide(peso);
		
		media = media.setScale(1, RoundingMode.HALF_EVEN);
		return media;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	
}
