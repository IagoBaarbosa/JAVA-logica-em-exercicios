/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Ler três notas de um aluno, calcular a média
 * e informar se ele foi aprovado (Média ? 7),
 * reprovado (Média < 7) ou aprovado com
 * louvor (Média = 10)
 * Autor(a) : Iago Barbosa
 * Data atual : 10/03/2022
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Qual foi sua primeira nota: ");
            float nota1 = in.nextFloat();
            System.out.println("Qual foi sua segunda nota: ");
            float nota2 = in.nextFloat();
            System.out.println("Qual foi sua terceira nota: ");
            float nota3 = in.nextFloat();

            calcularMedia(nota1, nota2, nota3);

        }
    }

    public static void calcularMedia(float nota1, float nota2, float nota3) {

        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media de suas notas foram de: " + media);
        if (media > 7 && media < 10) {
            System.out.println("Voce foi aprovado com media: " + media);
        } else if (media < 7) {
            System.out.println("Voce foi reprovado com media: " + media);
        } else if (media == 10) {
            System.out.println("Aprovado com louvor, com a media: " + media);
        }
    }

}
