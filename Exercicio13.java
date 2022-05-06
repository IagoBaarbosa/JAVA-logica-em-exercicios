/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Tem-se um conjunto de dados contendo a
 * altura e o sexo (masculino, feminino) de 50
 * pessoas. Fazer um algoritmo que calcule e
 * escreva:
 * o - a maior e a menor altura do grupo;
 * o - a média de altura das mulheres;
 * o - o número de homens;
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 02/03/2022
 */

import java.util.*;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] vetA = new int[4];
            int[] vetS = new int[4];
            int i = 0;
            float menor = 0;

            for (i = 0; i < 4; i++) {
                System.out.println("Escolha o sexo da pessoa [1]mulher |ou| [2]homen ");
                vetS[i] = in.nextInt();

                System.out.println("Digite a altura: ");
                vetA[i] = in.nextInt();
            }

            // Menor altura
            menor = vetA[1];
            for (i = 0; i < 4; i++) {
                if (vetA[i] < menor) {
                    menor = vetA[i];
                }
            }
            System.out.println("A menor altura e de: " + menor);

            // Maior altura
            float maior = 0;
            for (i = 0; i < 4; i++) {
                if (vetA[i] > maior) {
                    maior = vetA[i];
                }
            }
            System.out.println("A maior altura e de: " + maior);

            // Media altura das mulheres
            float alturaTotal = 0;
            int qtMulheres = 0;
            for (i = 0; i < 4; i++) {
                if (vetS[i] == 1) {
                    qtMulheres = qtMulheres + 1;
                    alturaTotal = vetA[i];
                }
            }
            System.out.println("A media das altura das mulheres e de: " + (alturaTotal / qtMulheres));

            // Numero de homens
            int nh = 0;
            for (i = 0; i < 4; i++) {
                if (vetS[i] == 2) {
                    nh = nh + 1;
                }
            }
            System.out.println("O numero de homens e de: " + nh);
        }
    }
}