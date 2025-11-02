package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;

public class Cobra extends Reptil implements Predador, Nadador{

	public Cobra(String nome, int idade, boolean temSangueFrio) {
		super(nome, "Cobra", idade, temSangueFrio);
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " Esta nadando");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " Esta caçando camundongos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " Esta sibilando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " Esta alimentando-se do camundongo que acabou de caçar");
		
	}
	
}
