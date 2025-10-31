package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;

public class TubaraoBaleia extends Peixe implements Nadador{

	public TubaraoBaleia(String nome, int idade, String tipoAgua) {
		super(nome, idade, "Salgada");
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está estalando sua dentição");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está se alimentando de plâncton");
		
	}

}