package exercicios.exercicio04;

public class Proprietario implements  Comparable<Proprietario>  {
    private String nome, telefone;

    public Proprietario() {
        this.nome = "Não cadastrado";
        this.telefone = "-";
    }

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Proprietario: " + nome + " [" + telefone + "]";
    }

    @Override
    public int compareTo(Proprietario outro) {
        if (nome.equals(outro.getNome())) {
            return 0;
        }
        return 1;
    }


}
