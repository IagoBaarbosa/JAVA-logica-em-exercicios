/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Construa um programa que exiba a tabuada N.
 * Autor(a) : Iago Barbosa
 * Data atual : 17/03/2022
 */

import java.util.*;

public class Exercicio11 {
    public static int n = 0;

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o numero da tabuada de sua preferencia");
            Exercicio11.n = in.nextInt();
            calculo();

        }
    }

    public static void calculo() {
        int i = 0;
        for (i = 0; i <= 10; i++) {
            System.out.println(Exercicio11.n + " X " + i + " = " + i * Exercicio11.n);
        }
    }
}