package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();  // lê um número inteiro do teclado e armazena na variável 'numero'
        System.out.println("você digitou " + numero);

        entrada.close(); // encerra a conexão com o teclado
    }
}
