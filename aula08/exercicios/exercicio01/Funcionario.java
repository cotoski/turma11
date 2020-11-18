package exercicios.exercicio01;

public class Funcionario {
    private String nome;
    private double salario;

    //public Funcionario(){}

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void aumentarSalario(double perc){
        salario = salario + salario * perc;
    }

    public String imprimir(){
        return "Funcionario: " + nome + " : " + salario;
    }
    
}
