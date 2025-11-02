package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Corredor, Predador{

	public Jacare(String nome,int idade, boolean temSangueFrio) {
		super(nome, "Jacaré", idade, temSangueFrio);
	}
	

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando uma capivara");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está Trotando");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está Nadando em direção sua presa");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rosnando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está se alimentando de uma carcaça");
		
	}

	
	
}
