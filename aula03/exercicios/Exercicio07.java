package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTDE_TURMAS = 5;
        final int QTDE_ALUNOS = 20;
        double mediaTurma, mediaGeral, mediaAluno;

        mediaGeral = 0;

        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {
            System.out.println("Dados da turma " + turma);
            mediaTurma = 0;

            for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
                System.out.println("Digite a media do aluno " + aluno);
                mediaAluno = teclado.nextDouble();
                mediaTurma = mediaTurma + mediaAluno; //mediaTurma += mediaAluno;
            }

            mediaTurma /= QTDE_ALUNOS;
            mediaGeral += mediaTurma;
            System.out.printf("Média da turma %d = %.2f\n", turma, mediaTurma);
        }
        
        mediaGeral /= QTDE_TURMAS;
        System.out.printf("Média Geral: %.2f\n", mediaGeral);

        teclado.close();
    }
}
