package exercicios.exercicio04;

public class App {
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(15, 0, 1);
        Relogio relogio2 = new Relogio(15, 12, 10);

        relogio1.setHora(23);
        relogio1.setMinuto(88);
        relogio1.setSegundo(5);

        String res = relogio1.exibir();

        System.out.println( res );
        
        System.out.println( relogio2.exibir() );

    }

}
