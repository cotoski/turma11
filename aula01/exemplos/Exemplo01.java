package exemplos;

/**
 * Exemplo01 Documentação para o leitor do código
 */

/*
 * comentário de bloco
 */

// comentário de linha

public class Exemplo01 { // nome da classe = nome do arquivo

    public static void main(String[] args) {  // programa principal

        System.out.print("Meu primeiro ");  // print não pula linha
        System.out.println("programa Java!");  // println (LN = new Line - pula para próxima linha)

        System.out.println("2 + 3");
        System.out.println(2 + 3);  // '+' operador de soma
        System.out.println("2 + 3 = " + 2 + 3); // '+' = concatenação
        System.out.println("2 + 3 = " + (2 + 3) );  // () alteram a ordem de prioridade
    }

}