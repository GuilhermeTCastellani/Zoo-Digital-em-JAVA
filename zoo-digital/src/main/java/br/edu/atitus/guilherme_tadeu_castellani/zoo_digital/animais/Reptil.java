package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

public abstract class Reptil extends Animal {
	private boolean temSangueFrio;

	public Reptil(String nome, String especie, int idade, boolean temSangueFrio) {
		super(nome, especie, idade);
		this.temSangueFrio = temSangueFrio;
		lagartear();
	}

	public boolean isTemSangueFrio() {
		return temSangueFrio;
	}

	public void setTemSangueFrio(boolean temSangueFrio) {
		this.temSangueFrio = temSangueFrio;
	}

	// Getter adicional no estilo 'get' para compatibilidade
	public boolean getTemSangueFrio() {
		return this.temSangueFrio;
	}

	public void lagartear() {
		System.out.println(this.getNome() + " está tomando solzinho.");
	}
}