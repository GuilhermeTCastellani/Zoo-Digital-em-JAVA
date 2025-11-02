package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Nadador, Corredor, Predador{

	public Lagarto(String nome, int idade, boolean temSangueFrio) {
		super(nome, "Lagarto", idade, true);
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando uma cobra");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " Avistou um predador e saiu correndo");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " Precisou atravessar um rio e nadou");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está guinchando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo ovos de outro animal");
		
	}
	
}