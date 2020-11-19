package exercicios.exercicio04;

import java.util.ArrayList;
import java.util.TreeSet;

public class Gerenciar {
    private ArrayList<Animal> listaAnimais;

    public Gerenciar() {
        listaAnimais = new ArrayList<>();
    }

    public void novoAnimal(String nome, String raca, String cor, int anoNascimento, String nomeProprietario,
            String telefone) {
        listaAnimais.add(new Animal(nome, raca, cor, anoNascimento, nomeProprietario, telefone));
    }

    public String buscaPorRaca(String raca) {
        String saida = "";

        for (Animal animal : listaAnimais) {
            if (animal.getRaca().equalsIgnoreCase(raca)) {
                saida += animal.getProprietario() + "\n";
            }
        }
        return saida;
    }

    public String buscaPorRacaSemRepeticao(String raca) {
        TreeSet<Proprietario> lista = new TreeSet<>();

        for (Animal animal : listaAnimais) {
            if (animal.getRaca().equalsIgnoreCase(raca)) {
                lista.add(animal.getProprietario());
            }
        }
        return lista.toString();
    }

    @Override
    public String toString() {
        String saida = "";

        for (Animal animal : listaAnimais) {
            saida += animal + "\n";
        }
        return saida;
    }
    
}
