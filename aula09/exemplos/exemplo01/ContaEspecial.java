package exemplos.exemplo01;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + limite){
            return super.sacar(valor);
        }
        return false;
    }
    
}
