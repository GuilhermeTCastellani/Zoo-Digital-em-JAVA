package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Salmao extends Peixe implements Nadador, Predador{

	public Salmao(String nome, int idade, String tipoAgua) {
		super(nome, "Salmão", idade, "Anádromo");
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando camarões");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando para a costa");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está borbulhando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está alimentando-se de krill");
		
	}
	
}