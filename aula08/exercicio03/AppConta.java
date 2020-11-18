package exercicio03;

public class AppConta {
    public static void main(String[] args) {
        Conta c = new Conta(1111);

        c.depositar(100);
        c.sacar(500);
        c.sacar(50);

        System.out.println(c);
    }
}
