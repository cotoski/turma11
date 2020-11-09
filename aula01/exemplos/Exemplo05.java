package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double peso;

        nome = "Huguinho";
        idade = 12;
        peso = 7.5;

        // printf( [String de Formatação] , [dados / variáveis])
        // %s - String, %d - int, %f - double/flot
        // %.2f - 2 casas decimais
        // \n - pula para próxima linha

        // Nome: Huguinho, idade: 12, peso: 7.5 
        System.out.printf( "Nome: %s, idade: %d, peso: %.2f\n" , nome, idade, peso);

    }
}
