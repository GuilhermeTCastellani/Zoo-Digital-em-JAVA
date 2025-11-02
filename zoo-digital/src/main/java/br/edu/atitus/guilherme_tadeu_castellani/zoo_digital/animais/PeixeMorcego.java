package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.Predador;


public class PeixeMorcego extends Peixe implements Predador{

    public PeixeMorcego(String nome, int idade, String tipoAgua) {
        super(nome, "Peixe-Morcego", idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pesquenas algas");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando camarões"); 
		
	}
    
    
}
