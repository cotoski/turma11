package exemplos;

import java.util.HashSet;

public class Exemplo02 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();

        hash.add(10);
        hash.add(5);
        hash.add(9);
        hash.add(75);

        System.out.println(hash);

        System.out.println( hash.contains(75) );
        System.out.println( hash.contains(705) );

    }
    
}
