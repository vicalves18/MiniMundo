package br.com.ebix.test;

import br.com.ebix.model.Boletim;

public class TesteBoletim {
	public static void main(String[] args) {
		Boletim boletim = new Boletim();
		boletim.boletimCompleto();
		System.out.println(boletim.toString());
	}
}
