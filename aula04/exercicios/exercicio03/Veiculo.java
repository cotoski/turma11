package exercicios.exercicio03;

public class Veiculo {
    String marca, modelo;
    double consumo;

    public Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public void exibir(){
        System.out.println( "Modelo: " + modelo + " marca: " + marca );
    }

    public double consumo(){
        return consumo;
    }

}