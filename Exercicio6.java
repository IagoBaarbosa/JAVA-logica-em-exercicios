/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Faça um algoritmo que lê uma temperatura
 * em Fahrenheit e calcula a temperatura
 * correspondente em Celsius. Ao final o
 * programa deve exibir as duas temperaturas.
 * - Usar a fórmula: C = (5 * (F-32) / 9)
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 15/03/2022
 */

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite uma temperatura em Fahrenheit: ");
            float temp1 = in.nextFloat();
            System.out.println("");
            System.out.println("A temperatura convertida para Celsius e de: " + (5 * (temp1 - 32) / 9));
            System.out.println("A temperatura em Fahrenheit e de :" + temp1);
            System.out.println("");
            System.out.println("Quer converter de Celsiu para Dahrenheit? [1 para SIM][2 para NAO] ");
            int resposta = in.nextInt();
            if (resposta == 1) {
                System.out.println("Digite uma temperatura em Celsius: ");
                float temp2 = in.nextFloat();
                System.out.println("");
                System.out
                        .println("A temperatura convertida de Celsius para Fahrenheit e de: " + (9 * temp2 + 160) / 5);
            } else {
                System.out.println("Ok, muito obrigado!");
            }
        }

    }
}