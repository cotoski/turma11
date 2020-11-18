package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        int numeroConta;
        double limite, valor;
        ArrayList<Conta> listaContas = new ArrayList<>();
        Conta conta = null;

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer Depósito");
            System.out.println("5-fazer saque");
            System.out.println("6-Exibir saldo");
            System.out.println("7-Sair");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    conta = new ContaCorrente(numeroConta);
                    listaContas.add(conta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = teclado.nextDouble();
                    conta = new ContaEspecial(numeroConta, limite);
                    listaContas.add(conta);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    conta = new ContaPoupanca(numeroConta);
                    listaContas.add(conta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = teclado.nextDouble();
                    for (Conta c : listaContas) {
                        if (c.getNumero() == numeroConta) {
                            c.depositar(valor);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do saque:");
                    valor = teclado.nextDouble();
                    for (Conta c : listaContas) {
                        if (c.getNumero() == numeroConta) {
                            c.sacar(valor);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    for (Conta c : listaContas) {
                        if (c.getNumero() == numeroConta) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 7:

                    break;

                default: // se não for nenhuma das opções acima
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (menu != 7);

        teclado.close();
    }

}
