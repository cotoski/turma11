package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double KM_TO_MILHAS = 0.62137;  //Nomes de constantes sempre maiúsculas
        final int MILHA_TO_JARDAS = 1760;
        final int JARDA_TO_PES = 3;
        final int PES_TO_POLEGADA = 12; //final, esta é uma constante, não uma variável
        
        double km, valorConvertido;

        System.out.println("Quantos KM foram rodados? ");
        km = entrada.nextDouble();
        
        System.out.println(km + " km");

        valorConvertido = km * KM_TO_MILHAS;
        System.out.println("Em milhas " + km + "km são " + valorConvertido);

        valorConvertido = valorConvertido * MILHA_TO_JARDAS;
        System.out.println("Em Jardas " + km + "km são " + valorConvertido);

        valorConvertido = valorConvertido * JARDA_TO_PES;
        System.out.println("Em Pés " + km + "km são " + valorConvertido);

        valorConvertido = valorConvertido * PES_TO_POLEGADA;
        System.out.println("Em Polegadas " + km + "km são " + valorConvertido);

        entrada.close();
    }
}
