package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Traira extends Peixe implements Nadador, Predador{

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo lambaris");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um lambari");
		
	}
    
}