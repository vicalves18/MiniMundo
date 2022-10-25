package br.com.ebix.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

import br.com.ebix.bo.CalculaMedia;
import br.com.ebix.bo.VerificarStatusAluno;
import br.com.ebix.dao.NotaDaoImpl;
import br.com.ebix.enums.ProvaEnum;
import br.com.ebix.enums.StatusEnum;

public class BoletimAluno {
	private CalculaMedia media;
	private VerificarStatusAluno status;
	private ArrayList<NotaDaoImpl> notas;
	private Aluno aluno;

	public void gerarBoletim() {
		Aluno aluno = new Aluno(getAluno().getMatricula(), getAluno().getNome());
		CalculaMedia media = new CalculaMedia();
		media.calculaMedia(aluno);
		
		
		//array Notas
		//media.calculaMedia(aluno|notas);
		//status = status.statusAluno(aluno, media);
		//if (status == StatusEnum.RECUPERACAO) {
			//fazerPf();
			//calcularMediaFinal();
			//statusAlunoFinal();
		//}

	}

	public CalculaMedia getMedia() {
		return media;
	}

	public void setMedia(CalculaMedia media) {
		this.media = media;
	}

	public VerificarStatusAluno getStatus() {
		return status;
	}

	public void setStatus(VerificarStatusAluno status) {
		this.status = status;
	}

	public ArrayList<NotaDaoImpl> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<NotaDaoImpl> notas) {
		this.notas = notas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


}
