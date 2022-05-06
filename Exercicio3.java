/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Fazer um algoritmo que:
 * o Leia um número indeterminado de linhas
 * contendo cada uma a idade de um indivíduo.
 * o A última linha que não entrará nos cálculos,
 * contém o valor da idade igual a zero.
 * o Calcule e escreva a idade média deste grupo
 * de indivíduos.
 * o Escreva também a maior idade e a menor
 * Autor(a) : Iago Barbosa
 * Data atual : 13/03/2022
 */

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            int[] idade = new int[5];

            alocarIdade(idade, in);
            idadeMedia(idade);
            maiorIdade(idade);
            menorIdade(idade);
        }
    }

    /*
     * Main deve conter o For
     * locar idade deve conter o Try Scanner
     */

    public static void alocarIdade(int[] idade, Scanner in) {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digiete uma idade da posicao [%d]:", i + 1);
            idade[i] = in.nextInt();
        }
    }

    public static void idadeMedia(int[] idade) {
        System.out.println(Arrays.toString(idade));

        int somaElementos = 0;
        for (int x = 0; x < 5; x++) {
            somaElementos += idade[x];
        }

        double soma = somaElementos;
        double media = soma / 5.0;
        System.out.printf("A media das idades eh: %f", media);
    }

    public static void maiorIdade(int[] idade) {
        int maiorId = 0;
        for (int j = 0; j < 5; j++) {
            if (idade[j] > maiorId) {
                maiorId = idade[j];
            }
        }
        System.out.println("");
        System.out.println("maior idade eh: " + maiorId);
    }

    public static void menorIdade(int[] idade) {
        int menorId = idade[0];
        for (int k = 0; k < 5; k++) {
            if (idade[k] < menorId) {
                menorId = idade[k];
            }
        }
        System.out.println("menor idade eh: " + menorId);
    }
}