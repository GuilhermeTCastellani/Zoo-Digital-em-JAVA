package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Voador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Gaviao extends Ave implements Voador, Predador{

	public Gaviao(String nome, int idade, String corPenas) {
		super(nome, "Gavião", idade, corPenas);
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um pato");
		
	}

	@Override
	public void voar() {
		System.out.println(getNome() + " está voando muito rápido");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está cantando em seu territorio");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está se alimentando de carne");
		
	}
	
}