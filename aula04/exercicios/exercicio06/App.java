package exercicios.exercicio06;

public class App {
    public static void main(String[] args) {
        Robo robo = new Robo(3, 3);

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();
        System.out.println(robo.posicaoAtual());
        robo.moverOeste();
        System.out.println(robo.posicaoAtual());
        robo.moverOeste();
        System.out.println(robo.posicaoAtual());
        robo.moverOeste();
        System.out.println(robo.posicaoAtual());
        robo.moverOeste();
        System.out.println(robo.posicaoAtual());
    }
}