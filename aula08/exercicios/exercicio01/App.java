package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Danilo", 3000);
        Gerente g = new Gerente("Camila", 4000, 4);

        Funcionario func = new Gerente("Carlos", 5000, 10);

        f.aumentarSalario(0.1);
        System.out.println(f.imprimir());
        System.out.println(g.imprimir());

        func.aumentarSalario(0.1);
        System.out.println(func.imprimir());
    }
    
}
