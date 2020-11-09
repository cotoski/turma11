package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2;
        double media;

        System.out.println("Digite as duas notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        // media = (nota1 + nota2) / 2; // não calcula o valor correto
        // media = (nota1 + nota2) / 2.0;
        // media = (double)(nota1 + nota2) / 2;

        media = (nota1 + nota2) / 2;

        System.out.println("Média = " + media);

        entrada.close();
    }
}
