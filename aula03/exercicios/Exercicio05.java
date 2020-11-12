package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, pares, impares;
        final int MAX_NUMEROS = 10;

        pares = 0;
        impares = 0;

        for (int cont = 1; cont <= MAX_NUMEROS; cont++) {
            System.out.printf("Digite o %dº número:", cont);
            numero = in.nextInt();

            if (numero % 2 == 0) { // verifica se o número é par
                pares++;
            } else {
                impares++;
            }

        }

        System.out.printf("Foram digitados %d par(es) e %d ímpar(es).\n", pares, impares);

        in.close();
    }
}
