package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Nadador,Corredor, Predador{

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, "Cachorro", idade, true);
        this.raca = raca;
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua ração");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bolinha");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando estilo cachorrinho");
    }


    public String getRaca() {
        return raca;
    }


	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando uma mosca");
		
	}
    
}