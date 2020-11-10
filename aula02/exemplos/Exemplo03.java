package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int a;
        boolean res;
        String palavra1;
        String palavra2;

        a = 5;
        palavra1 = "teste";
        palavra2 = "testE";

        res = (a == 5);

        System.out.println( res );

        // (palavra1 == palavra2)
        res = (palavra1.equals(palavra2));
        System.out.println( res );

        res = (palavra1.equalsIgnoreCase(palavra2)); //ignora maiúsculas/minúsculas
        System.out.println( res );
    }
}
