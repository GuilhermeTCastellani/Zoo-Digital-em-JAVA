package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Nadador, Predador{
	
	private String corJuba;
	
	public Leao(String nome, int idade, String corJuba) {
		super(nome, "Leão/oa", idade, true);
		this.corJuba = corJuba;
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um gnu");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando para atravessar o rio");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " saiu correndo");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rugindo");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está cpmendo um bife");

	}

	public String getCorJuba() {
		return corJuba;
	}
	
}