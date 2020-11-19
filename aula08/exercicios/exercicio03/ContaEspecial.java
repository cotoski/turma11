package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + limite){
            super.sacar(valor);
        }
    }
    
}
