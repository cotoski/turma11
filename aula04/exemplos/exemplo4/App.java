package exemplos.exemplo4;

public class App{

    public static void main(String args[]){
        Pessoa p1 = new Pessoa("Emerson");
        Pessoa p2 = new Pessoa("Amanda");

        //p1.nome = "Emerson";
        p1.apresentar();

        //p2.nome = "Amanda";
        p2.apresentar();
    }
}