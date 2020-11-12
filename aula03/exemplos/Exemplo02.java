package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double nota, soma, media;
        int cont;
        final int QTDE_ESTUDANTES = 3; //constante

        soma = 0;
        cont = 1;
        while ( cont <= QTDE_ESTUDANTES ) {
            System.out.println("Digite a nota do estudante:");
            nota = entrada.nextDouble();
            soma = soma + nota;
            cont++;    
        }

        media = soma / QTDE_ESTUDANTES;
        System.out.printf("Média = %.2f\n", media);

        entrada.close();
    }
}
