/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Fazer um algoritmo para calcular e escrever a
 * soma dos cubos dos números pares
 * compreendidos entre B e A (B > A). B e A são
 * lidos pelo teclado.
 * Autor(a) : Iago Barbosa
 * Data atual : 15/03/2022
 */

import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Escreva um valor: ");
            int a = in.nextInt();
            System.out.println("Escreva outro valor que seja maior que o anterior: ");
            int b = in.nextInt();
            if (a > b) {
                System.out.println("================================");
                System.out.println("ERRO, le o enunciado novamente!!");
                System.out.println("================================");
            }

            float valorTotal = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    valorTotal += (i ^ 3);
                    System.out.println(i);
                }
            }
            System.out.println("A soma dos cubos dos numeros pares sao: " + valorTotal);
        }
    }
}
