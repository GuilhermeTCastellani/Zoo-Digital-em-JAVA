package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements Corredor, Predador{

	public Gato(String nome, int idade, boolean temPelo) {
		super(nome, idade, true);
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um rato");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo do cachorro");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está miando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo ração");
		
	}
	
}