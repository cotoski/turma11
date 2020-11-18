package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Fernando");
        Jogador j2 = new Jogador("Antonio");

        j1.addPontos(5);
        j2.addPontos(10);

        System.out.println(j1);
        System.out.println(j2);
        
        System.out.println(Jogador.getPontos());

        //chamada de um método static, não precisa criar um objeto
        double x =  Math.sqrt(25);
        
    }

}
