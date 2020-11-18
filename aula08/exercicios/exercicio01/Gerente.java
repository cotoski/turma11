package exercicios.exercicio01;

public class Gerente extends Funcionario{
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios){
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public void aumentarSalario(double perc){
        super.aumentarSalario(perc + 0.2);
    }

    @Override
    public String imprimir(){
        //return super.imprimir() + " - " + nFuncionarios;
        return "Nome: " + getNome() + " : " + nFuncionarios;
    }
    
}
