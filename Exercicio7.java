/*
 * Disciplina : [Linguagem e Lógica de Programação]
 * Professor : Yuri Titi
 * Descrição : Numa eleição existem três candidatos
 * identificados pelos números 1, 2 e 3. Faça um
 * algoritmo que compute o resultado de uma
 * eleição. Inicialmente o programa deve pedir o
 * número total de votantes. Em seguida, deve
 * pedir para cada votante votar (informando o
 * número do candidato) e ao final mostrar o
 * número de votos de cada candidato
 * 
 * Autor(a) : Iago Barbosa
 * Data atual : 15/03/2022
 */

import java.util.*;

public class Exercicio7 {

    public static int cand1 = 0;
    public static int cand2 = 0;
    public static int cand3 = 0;
    public static int nulo = 0;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Quantas pessoas iram votar? ");
            int numeroVotantes = in.nextInt();

            for (int i = 1; i <= numeroVotantes; i++) {
                contadorCandidato(i);
                int votos = in.nextInt();
                contadorDeVotos(votos);
            }
            contadorVotos(numeroVotantes);
        }
    }

    ///////////////////////////////////////////////////////////////
    public static void contadorVotos(int numeroVotantes) {
        System.out.println("O numero de votantes e de: " + numeroVotantes);
        System.out.println("O candidato [1] recebeu: " + cand1 + " votos");
        System.out.println("O candidato [2] recebeu: " + cand2 + " votos");
        System.out.println("O candidato [3] recebeu: " + cand3 + " votos");
        System.out.println("Houveram: " + nulo + " votos nulos");
    }

    ///////////////////////////////////////////////////////////////
    public static void contadorCandidato(int i) {
        System.out.println("Eleitor numero: " + i);
        System.out.println("Digite o numero do seu candidato");
        System.out.println("Digite [1] - para candidato 01");
        System.out.println("Digite [2] - para candidato 02");
        System.out.println("Digite [3] - para candidato 03");
    }
    /////////////////////////////////////////////////////////////

    public static void contadorDeVotos(int votos) {
        switch (votos) {
            case 1:
                Exercicio7.cand1 = Exercicio7.cand1 + 1;
                break;
            case 2:
                Exercicio7.cand2 = Exercicio7.cand2 + 1;
                break;
            case 3:
                Exercicio7.cand3 = Exercicio7.cand3 + 1;
                break;
            default:
                Exercicio7.nulo = Exercicio7.nulo + 1;
        }
    }
}