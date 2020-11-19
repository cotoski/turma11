package exemplos.exemplo01;

import java.util.HashMap;

public class GerenciaConta {
    private HashMap<Integer, Conta> mapaContas;

    public GerenciaConta(){
        mapaContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta){
        mapaContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        mapaContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta){
        mapaContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor){
        Conta conta = mapaContas.get(numeroConta);

        if( conta != null ){
            return conta.depositar(valor);
        }
        return false; //não achou a conta
    }

    public boolean sacar(int numeroConta, double valor){
        Conta conta = mapaContas.get(numeroConta);

        if( conta != null ){
            return conta.sacar(valor);
        }
        return false; //não achou a conta
    }

    public String exibir(int numeroConta){
        Conta conta = mapaContas.get(numeroConta);

        if( conta != null ){
            return conta.toString();
        }
        return "Conta inválida."; //não achou a conta        
    }

}
