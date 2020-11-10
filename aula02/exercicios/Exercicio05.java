package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean aceita; //true ou false

        System.out.println("Digite a senha:");
        senha = entrada.nextLine();

        aceita = senha.equals("R10p5");

        if( aceita == true ){
            System.out.println("Acesso concedido.");
        }else{
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}