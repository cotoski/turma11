package exercicios.exercicio04;

public class Animal {
    private String nome, raca, cor;
    private int anoNascimento;
    private Proprietario proprietario; //* associação entre classes

    public Animal(String nome, String raca, String cor, int anoNascimento){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario();
    }

    public Animal(String nome, String raca, String cor, int anoNascimento, String nomeProprietario, String telefone){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nomeProprietario, telefone);
    }

    public String getRaca(){
        return raca;
    }

    public Proprietario getProprietario(){
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario){
        this.proprietario = proprietario;
    }

    public void setProprietario(String nome, String telefone){
        this.proprietario = new Proprietario(nome, telefone);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " raça: " + raca + " cor " + cor + " nascimento: " + anoNascimento + " " + proprietario;
    }


}
