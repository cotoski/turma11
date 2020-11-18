package exercicio03;

public class ContaCorrente extends Conta {
    private static final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }
    
    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo()){
            super.sacar(valor);
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > TAXA_DEPOSITO){
            super.depositar(valor - TAXA_DEPOSITO);
        }
    }

}
