/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Fazer um algoritmo que calcule e escreva a soma dos
 * 50 primeiros termos da seguinte serie:
 * 1000/1 - 997/2 + 994/3 - 991/4 + ...
 * Autor(a) : Iago Barbosa
 * Data atual : 16/03/2022
 */

// DUVIDA, RESOLVER PROBLEMA

public class Exercicio9 {
    public static void main(String[] args) {
        int denominador = 0;
        int numerador = 0;
        float somaTotal = 0;

        for (denominador = 0; denominador < 50; denominador++) {
            numerador = 1000 - (3 * (denominador - 1));
            System.out.println(numerador);
            System.out.println(" " + denominador);
            System.out.println("   ");

            if (denominador % 2 == 0) {
                System.out.println("+");
                somaTotal = somaTotal + (numerador / denominador);
            } else {
                System.out.println("-");
                somaTotal = somaTotal - (numerador / denominador);
            }
        }
        System.out.println("SOMA: " + somaTotal);
    }
}