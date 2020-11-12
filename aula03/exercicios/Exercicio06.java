package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares = 0, impares = 0;
        double media = 0;
        final int QTDE_NUMEROS = 10;

        for (int i = 0; i < QTDE_NUMEROS; i++) {
            System.out.println("Digite o próximo valor inteiro:");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                media = media + numero;
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("Média dos valores pares: %.2f\n", (media / pares));
        System.out.printf("Porcentagem de números ímpares: %.1f %%\n", (double) impares / QTDE_NUMEROS * 100);

        teclado.close();
    }
}
