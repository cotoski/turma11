package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {
        linha(20, '-');  // chamada de método com 2 parâmetros
        System.out.println("Sistema de cadastro.");
        linha(25, '_');
        System.out.println("Bem vindo! Escolha a opção no menu abaixo.");
        linha(40, '*');
    }

    static void linha(int tamanho, char simbolo) { // void significa sem retorno
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

}