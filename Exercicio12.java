/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Fazer um algoritmo para calcular e
 * escrever a seguinte soma:
 * 37x38/1 + 36x37/2 + 35x36/2 + ... + 1x2/37
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 17/03/2022
 */

public class Exercicio12 {
    public static void main(String[] args) {
        int denominador, numeradorA, numeradorB = 0;
        float somaTotal = 0;

        for (denominador = 1; denominador < 38; denominador++) {
            numeradorA = 37 - (denominador - 1);
            numeradorB = numeradorA + 1;

            somaTotal = somaTotal + ((numeradorA * numeradorB) / denominador);
            System.out.println(" ( " + numeradorA + " x " + numeradorB + " )/ " + denominador);
        }
        System.out.println(" A soma e de: " + somaTotal);
    }
}