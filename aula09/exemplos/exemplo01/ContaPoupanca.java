package exemplos.exemplo01;

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
    public boolean sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + taxaSaque ){
            return super.sacar(valor + taxaSaque);
        }
        return false;
    }

}
