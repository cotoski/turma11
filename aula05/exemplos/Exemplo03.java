package exemplos;

import java.util.Stack;

public class Exemplo03 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push( 10 );  //empilhar - inserir na pilha
        pilha.push( 11 );
        pilha.push( 12 );
        pilha.push( 13 );
        
        while ( ! pilha.isEmpty() ) {
            System.out.println(pilha.pop());
        }

    }
}
