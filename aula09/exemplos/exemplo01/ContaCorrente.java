package exemplos.exemplo01;

public class ContaCorrente extends Conta {
    private static final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }
    
    @Override
    public boolean sacar(double valor) {
        if(valor > 0 && valor <= getSaldo()){
            return super.sacar(valor);
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor > TAXA_DEPOSITO){
            return super.depositar(valor - TAXA_DEPOSITO);
        }
        return false;
    }

}
