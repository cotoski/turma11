package exercicios.exercicio03;

public class ContaPoupanca extends Conta{
    private static double taxaSaque = 0.1;

    public ContaPoupanca(int numeroConta){
        super(numeroConta);
    }

    public static void setTaxaSaque(double taxa){
        if(taxa > 0){
            taxaSaque = taxa;
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + taxaSaque ){
            super.sacar(valor + taxaSaque);
        }
    }

}
