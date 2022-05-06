/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Número primo é aquele que só é divisível
 * por ele mesmo e pela unidade. Fazer um
 * algoritmo que determine e escreva os
 * números primos compreendidos entre um
 * intervalo fornecido pelo usuário.
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 15/03/2022
 */

import java.util.*;

public class Exercicio8 {
    public static int numeroA = 0;
    public static int numeroB = 0;

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Escreva um valor INICIAL");
            Exercicio8.numeroA = in.nextInt();
            System.out.println("Escreva um valor FINAL, obrigatorio ser maior que o INICIAL: ");
            Exercicio8.numeroB = in.nextInt();

            if (Exercicio8.numeroA > Exercicio8.numeroB) {
                System.out.println("!! ERRO !!");
            }

            System.out.println("No intervalo fornecido pelo USUARIO os numeros primos entre eles sao: ");
            for (int i = Exercicio8.numeroA; i < Exercicio8.numeroB; i++) {
                if (numeroEprimo(i)) {
                    System.out.println("O numero " + i + " e primo? " + numeroEprimo(i));
                }
            }
            ///////////////////////////////////////////////////////////////////////
        }
    }

    public static boolean numeroEprimo(int valor) {

        for (int j = 2; j < valor;) {
            if (valor % j == 0) {
                return false;
            }
            return true;
        }
        return false;

    }
}