package exemplos.exemplo05;

public class Carro implements Veiculo {
    private int velocidade;

    @Override
    public void acelerar(int a) {
        velocidade += a;        
    }

    @Override
    public void frenar(int a) {
        velocidade -= a;
    }
    
    @Override
    public String toString() {
        return "Carro andando a " + velocidade + " km/h";
    }

}
