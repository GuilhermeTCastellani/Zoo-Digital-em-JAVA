package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais;

public abstract class Peixe extends Animal {
    private String tipoAgua; //Água doce ou salgada

    public Peixe(String nome, String especie, int idade, String tipoAgua) {
        super(nome, especie, idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void respirar(){
        System.out.println(this.getNome() + " está respirando através das brânquias.");
    }
    
    
}