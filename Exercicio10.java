/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Anacleto tem 1,50m e cresce 2
 * centímetros por ano, enquanto Felisberto tem
 * 1,10 e cresce 3 centímetros por ano. Construa
 * um programa que calcule e apresente quantos
 * anos serão necessários para que Felisberto
 * seja maior que Anacleto
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 16/03/2022
 */

public class Exercicio10 {
    public static int i = 0;

    public static void main(String[] args) {

        calcularAno();
        System.out.println("O total de anos que demoraria seria de: " + Exercicio10.i);

    }

    public static void calcularAno() {
        double anacleto = 1.5;
        double felisberto = 1.1;

        while (anacleto > felisberto) {
            felisberto = felisberto + 0.03;
            anacleto = anacleto + 0.02;
            Exercicio10.i = Exercicio10.i + 1;
        }
    }
}