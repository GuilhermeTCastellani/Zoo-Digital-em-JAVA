package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Voador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Galinha extends Ave implements Voador, Corredor, Predador{

	public Galinha(String nome, int idade, String corPenas) {
		super(nome, idade, corPenas);
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando minhocas");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo");
		
	}

	@Override
	public void voar() {
		System.out.println(getNome() + " saiu voando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está cacarejando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo milho");
		
	}
	
}
