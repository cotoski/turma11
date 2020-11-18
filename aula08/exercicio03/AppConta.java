package exercicio03;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1111);
        ContaEspecial ce = new ContaEspecial(22222, 100);

        cc.depositar(100);
        cc.sacar(500);
        cc.sacar(50);
        System.out.println(cc);

        ce.depositar(200);
        ce.sacar(250);
        System.out.println(ce);
    }
}
