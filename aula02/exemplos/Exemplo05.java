package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroInteiro;
        double numeroDouble;

        numeroDouble = 12.999;// entrada.nextInt();

        numeroInteiro = (int) numeroDouble; // casting - conversão explicita

        System.out.println(numeroDouble);
        System.out.println(numeroInteiro);

        entrada.close();
    }
}
