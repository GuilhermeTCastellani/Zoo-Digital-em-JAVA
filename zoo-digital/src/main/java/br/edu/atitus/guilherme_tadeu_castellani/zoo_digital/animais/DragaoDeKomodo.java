package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;

public class DragaoDeKomodo extends Reptil implements Corredor, Predador, Nadador{

	public DragaoDeKomodo(String nome, int idade, boolean temSangueFrio) {
		super(nome, "Dragão-de-Komodo", idade, true);
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um veado");
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rugindo");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo um pedaço de sua presa");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo de um concorente maior");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando para outra ilha");
		
	}
	
}