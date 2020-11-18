package exemplos.exemplo01;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso){
        super(nome); //acionando o construtor da superclasse 'Pessoa'
        this.curso = curso;
    }

    @Override //anotação de sobrescrita
    public String toString(){
        return "Nome: " + getNome() + " curso: " + curso;
    }

/*     public String getNome(){
        return "Joao";
    } */
}