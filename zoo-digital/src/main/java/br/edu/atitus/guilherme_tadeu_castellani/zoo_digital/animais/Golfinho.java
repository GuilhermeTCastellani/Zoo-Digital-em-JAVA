package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Golfinho extends Mamifero implements Nadador, Predador{

    public Golfinho(String nome, int idade) {
        super(nome, "Golfinho", idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() +  " está assoviando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixinhos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em mar aberto");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando uma Sardinha");
		
	}

    
    
    
}