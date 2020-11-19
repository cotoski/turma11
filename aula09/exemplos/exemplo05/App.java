package exemplos.exemplo05;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Veiculo> lista = new ArrayList<>();

        lista.add( new Carro());
        lista.add( new Moto() );

        for (Veiculo veiculo : lista) {
            veiculo.acelerar(10);
        }

        System.out.println( lista );
    }
    
}
