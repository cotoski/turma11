package exemplos.exemplo01;

//uma classe abstrata serve como modelo para outras classes

public abstract class Pessoa {// extends Object{ //superclasse
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){}
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override //anotação de sobrescrita
    public String toString(){
        return "Nome: " + nome;
    }
}
