package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, "Pinguim", idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de peixes");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando krill");
		
	}
    
}