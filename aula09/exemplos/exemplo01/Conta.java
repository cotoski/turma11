package exemplos.exemplo01;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numeroConta){
        numero = numeroConta;
        saldo = 0;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "conta: " + numero + " saldo: " + saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor; //saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
}
