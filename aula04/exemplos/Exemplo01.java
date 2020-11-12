package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();  // chamada de método
        System.out.println("Sistema de cadastro.");
        linha();
        System.out.println("Bem vindo! Escolha a opção no menu abaixo.");
        linhaMaior();
    }

    static void linha() {
        System.out.println("--------------------");
    }

    static void linhaMaior() {
        System.out.println("-------------------------------------------");
    }
    
}