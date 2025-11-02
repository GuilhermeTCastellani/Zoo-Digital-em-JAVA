package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

public abstract class Ave extends Animal{
    
    public Ave(String nome,String especie, int idade, String corPenas) {
        super(nome, especie, idade);
        this.corPenas = corPenas;
    }

    private String corPenas;

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    
    public void botar(){
        System.out.println(this.getNome() + " está chocando.");
    }
}
