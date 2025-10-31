package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

public abstract class Reptil extends Animal {
	private boolean temSangueFrio;

	public Reptil(String nome, String especie, int idade, boolean temSangueFrio) {
		super(nome, "Reptil", idade);
		this.setTemSangueFrio(temSangueFrio);
	}

	public boolean isTemSangueFrio() {
		return temSangueFrio;
	}

	public void setTemSangueFrio(boolean temSangueFrio) {
		this.temSangueFrio = temSangueFrio;
	}

	public void lagartear() {
		System.out.println(this.getNome() + " está tomando solzinho.");
	}
}