package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome:");
        // nome = entrada.next(); //até encontrar 'espaço'
        nome = entrada.nextLine(); // até encontrar o 'ENTER'

        System.out.println("Olá " + nome);

        entrada.close();
    }
}
