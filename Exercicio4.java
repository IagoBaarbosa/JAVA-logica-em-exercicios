/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Faça um algoritmo que calcule a soma dos
 * números inteiros de 1 a 100.
 * Autor(a) : Iago Barbosa
 * Data atual : 15/03/2022
 */

public class Exercicio4 {
    public static void main(String[] args) {
        int valorMaximo = 50;
        int soma = 0;

        calcular(soma, valorMaximo);
    }

    public static void calcular(int soma, int valorMaximo) {
        for (int i = 0; i < valorMaximo; i++) {
            System.out.print(i + " + ");
            soma = soma + 101;
        }
        System.out.println("");
        System.out.println("A soma dos numeros inteiros eh de: " + soma);
    }

}