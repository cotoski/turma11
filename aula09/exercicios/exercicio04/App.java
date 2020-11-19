package exercicios.exercicio04;

public class App {
    public static void main(String[] args) {
        //Animal animal = new Animal("Mel", "vira-lata", "bege", 2010);
        // Proprietario proprietario = new Proprietario("Sara", "(11) 1234-5678");
        //animal.setProprietario(proprietario);

        Gerenciar animais = new Gerenciar();

        animais.novoAnimal("Mel", "vira-lata", "bege", 2010, "Sara", "(11) 1234-5678");
        animais.novoAnimal("Lulu", "Rotwailer", "branco", 2000, "Ricardo", "(11) 1111-5678");
        animais.novoAnimal("Rex", "Rotwailer", "preto", 2015, "Ricardo", "(11) 1111-5678");


        System.out.println(animais.buscaPorRacaSemRepeticao("Rotwailer"));

    }
}
