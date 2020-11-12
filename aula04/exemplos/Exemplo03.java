package exemplos;

public class Exemplo03 {

    public static void main(String[] args) {
        int a, b, resposta;

        a = 5;
        b = 10;

        resposta = soma(a, b);
        System.out.println("Soma = " + resposta);
    }

    //o método 'soma' recebe dois parâmtros inteiros, e retorna um valor inteiro
    static int soma(int n1, int n2) {
        int resultado;

        resultado = n1 + n2;

        return resultado;
    }

}
