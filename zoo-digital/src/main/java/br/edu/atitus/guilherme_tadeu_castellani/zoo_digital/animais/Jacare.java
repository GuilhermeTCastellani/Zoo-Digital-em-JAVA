package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Corredor, Predador{

	public Jacare(String nome,int idade, boolean temSangueFrio) {
		super(nome, "jacaré", idade, temSangueFrio);
	}
	

	@Override
	public void cacar() {
		System.out.println("Está caçando uma capivara");
		
	}

	@Override
	public void correr() {
		System.out.println("Está Trotando");
		
	}

	@Override
	public void nadar() {
		System.out.println("Está Nadando em direção sua presa");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O Jacare esta rosnando");
		
	}

	@Override
	public void comer() {
		System.out.println("O jacare esta se alimentando de uma carcaça");
		
	}

	
	
}
