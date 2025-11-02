package br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.*;
import br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

    private static final List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirMenu();
            System.out.print("Escolha uma opção: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    cadastrarAnimal(scanner);
                    break;
                case "2":
                    listarTodos();
                    break;
                case "3":
                    listarCorredores();
                    break;
                case "4":
                    listarNadadores();
                    break;
                case "5":
                    listarVoadores();
                    break;
                case "6":
                    listarPredadores();
                    break;
                case "7":
                    exibirTotal();
                    break;
                case "8":
                    listarComportamentosPorClasse();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("pressione Enter para continuar...");
            scanner.nextLine();
            limparTela();
        }
    }

    private static void imprimirMenu() {
        System.out.println("""
                    ==== Zoo Digital ====");
                1 - Cadastrar Animal
                2 - Listar Todos Animais
                3 - Listar Animais Corredores
                4 - Listar Animais Nadadores
                5 - Listar Animais Voadores
                6 - Listar Animais Predadores
                7 - Exibir Total de Animais
                8 - Listar Comportamentos por Classe
                0 - Sair
                    =============================""");
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println(
                """
                        --- Cadastro de Animal ---
                        === Tipos disponíveis ===
                        1 - Cachorro
                        2 - Gato
                        3 - Leão
                        4 - Pato
                        5 - Golfinho
                        7 - Jacaré
                        8 - Salmão
                        9 - Pinguim
                        10 - Gavião
                        11 - Galinha
                        12 - TubarãoBaleia
                        13 - Peixe Morcego
                        14 - Dragão de Komodo
                        15 - Cobra
                        16 - Lagarto
                        0 - Cancelar cadastro
                        Escolha o tipo (número):
                        """);
        String tipo = scanner.nextLine();

        if (tipo.equals("0")) {
            System.out.println("Cadastro cancelaodo, voltando ao menu principal...");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        int idade = lerInteiro(scanner, "Idade: ");

        Animal novo = null;
        try {
            switch (tipo) {
                case "1": // Cachorro(nome, idade, raca)
                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();
                    novo = new Cachorro(nome, idade, raca);
                    break;
                case "2": // Gato(nome, idade, temPelo) - constructor ignores temPelo param but keep
                          // prompt
                    novo = new Gato(nome, idade, true);
                    break;
                case "3": // Leao(nome, idade, corJuba)
                    System.out.print("Cor da juba: ");
                    String corJuba = scanner.nextLine();
                    novo = new Leao(nome, idade, corJuba);
                    break;
                case "4": // Pato(nome, idade, corPenas)
                    System.out.print("Cor das penas: ");
                    String corPato = scanner.nextLine();
                    novo = new Pato(nome, idade, corPato);
                    break;
                case "5": // Golfinho(nome, idade)
                    novo = new Golfinho(nome, idade);
                    break;
                case "6": // Traira(nome, idade)
                    novo = new Traira(nome, idade);
                    break;
                case "7": // Jacare(nome, idade, temSangueFrio)
                    novo = new Jacare(nome, idade, true);
                    break;
                case "8": // Salmao(nome, idade, tipoAgua)
                    novo = new Salmao(nome, idade, "anádromo");
                    break;
                case "9": // Pinguim(nome, idade, corPenas)
                    System.out.print("Cor das penas: ");
                    String corPinguim = scanner.nextLine();
                    novo = new Pinguim(nome, idade, corPinguim);
                    break;
                case "10": // Gaviao(nome, idade, corPenas)
                    System.out.print("Cor das penas: ");
                    String corGaviao = scanner.nextLine();
                    novo = new Gaviao(nome, idade, corGaviao);
                    break;
                case "11": // Galinha(nome, idade, corPenas)
                    System.out.print("Cor das penas: ");
                    String corGalinha = scanner.nextLine();
                    novo = new Galinha(nome, idade, corGalinha);
                    break;
                case "12": // TubaraoBaleia(nome, idade, tipoAgua)
                    novo = new TubaraoBaleia(nome, idade, "salgada");
                    break;
                case "13": // PeixeMorcego(nome, idade,
                    novo = new PeixeMorcego(nome, idade, "salgada");
                    break;
                case "14": // DragaoDeKomodo(nome, especie, idade, temSangueFrio)
                    novo = new DragaoDeKomodo(nome, idade, true);
                    break;
                case "15": // Cobra(nome, especie, idade, temSangueFrio)
                    novo = new Cobra(nome, idade, true);
                    break;
                case "16": // Lagarto(nome, idade, temSangueFrio)
                    novo = new Lagarto(nome, idade, true);
                    break;
                case "0": // fazer funcionar o cancelar cadastro
                    System.out.println("Cadastro cancelado.");
                    return;
                default:
                    System.out.println("Tipo inválido. Cadastro cancelado.");
                    return;
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o animal: " + e.getMessage());
            return;
        }

        animais.add(novo);
        System.out.println("Animal cadastrado com sucesso: " + novo.getNome());
    }

    private static void listarTodos() {
        System.out.println("--- Lista de Todos os Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal a : animais) {
            System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Espécie: " + a.getEspecie()
                    + extraInfo(a));
            a.emitirSom();
            a.comer();
            System.out.println();
        }
    }

    private static void listarCorredores() {
        System.out.println("--- Animais Corredores ---");
        boolean any = false;
        for (Animal a : animais) {
            if (a instanceof Corredor) {
                any = true;
                System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Espécie: "
                        + a.getEspecie() + extraInfo(a));
                ((Corredor) a).correr();
                System.out.println();
            }
        }
        if (!any)
            System.out.println("Nenhum corredor encontrado.");
    }

    private static void listarNadadores() {
        System.out.println("--- Animais Nadadores ---");
        boolean any = false;
        for (Animal a : animais) {
            if (a instanceof Nadador) {
                any = true;
                System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Espécie: "
                        + a.getEspecie() + extraInfo(a));
                ((Nadador) a).nadar();
                System.out.println();
            }
        }
        if (!any)
            System.out.println("Nenhum nadador encontrado.");
    }

    private static void listarVoadores() {
        System.out.println("--- Animais Voadores ---");
        boolean any = false;
        for (Animal a : animais) {
            if (a instanceof Voador) {
                any = true;
                System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Espécie: "
                        + a.getEspecie() + extraInfo(a));
                ((Voador) a).voar();
                System.out.println();
            }
        }
        if (!any)
            System.out.println("Nenhum voador encontrado.");
    }

    private static void listarPredadores() {
        System.out.println("--- Animais Predadores ---");
        boolean any = false;
        for (Animal a : animais) {
            if (a instanceof Predador) {
                any = true;
                System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Espécie: "
                        + a.getEspecie() + extraInfo(a));
                ((Predador) a).cacar();
                System.out.println();
            }
        }
        if (!any)
            System.out.println("Nenhum predador encontrado.");
    }
    private static String extraInfo(Animal a) {
        StringBuilder sb = new StringBuilder();
        // Peixe -> tipoAgua
        if (a instanceof br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Peixe) {
            br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Peixe p = (br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Peixe) a;
            sb.append(" | Tipo de Água: ").append(p.getTipoAgua());
        }
        // Ave -> corPenas
        if (a instanceof br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Ave) {
            br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Ave av = (br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Ave) a;
            sb.append(" | Cor das penas: ").append(av.getCorPenas());
        }
        // Reptil -> temSangueFrio
        if (a instanceof br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Reptil) {
            br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Reptil r = (br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Reptil) a;
            sb.append(" | Tem sangue frio: ").append(r.getTemSangueFrio());
        }
        // Leao -> corJuba
        if (a instanceof br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Leao) {
            br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Leao l = (br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Leao) a;
            sb.append(" | Cor da juba: ").append(l.getCorJuba());
        }
        // Cachorro -> raca
        if (a instanceof br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Cachorro) {
            br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Cachorro c = (br.edu.atitus.guilherme_tadeu_castellani.zoo_digital.animais.Cachorro) a;
            sb.append(" | Raça: ").append(c.getRaca());
        }
        return sb.toString();
    }

    private static void exibirTotal() {
        System.out.println("Total de animais (contador estático): " + Animal.getContador());
        System.out.println("Total de animais (tamanho da lista): " + animais.size());
    }

    private static void listarComportamentosPorClasse() {
        System.out.println("--- Comportamentos por Classe de Animal ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal a : animais) {
            System.out.println("\nNome: " + a.getNome() + " | Espécie: " + a.getEspecie());
            System.out.println("Comportamentos característicos:");
            
            if (a instanceof Mamifero) {
                System.out.print("Mamífero: ");
                ((Mamifero) a).amamentar();
            }
            if (a instanceof Ave) {
                System.out.print("Ave: ");
                ((Ave) a).botar();
            }
            if (a instanceof Reptil) {
                System.out.print("Réptil: ");
                ((Reptil) a).lagartear();
            }
            if (a instanceof Peixe) {
                System.out.print("Peixe: ");
                ((Peixe) a).respirar();
            }
            
            }
        }
    private static int lerInteiro(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String linha = scanner.nextLine();
            try {
                return Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o terminal.");
        }
    }

}