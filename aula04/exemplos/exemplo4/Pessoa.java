package exemplos.exemplo4;

public class Pessoa {
    // atributos - caractrísticas
    String nome;

    //método construtor
    Pessoa(String nomePessoa) {
        nome = nomePessoa;
    }

    //métodos - ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }
}