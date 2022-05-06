/*  Disciplina   : [Linguagem e Lógica de Programação]
 Professor   : Yuri Titi
 Descrição   :   Determinar se um número é par ou ímpar e
                 positivo ou negativo

 Autor(a)    : Iago Barbosa
 Data atual  : 08/03/2022 */

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int numero = 0;
      System.out.println("Informe um valor Inteiro: ");
      numero = in.nextInt();
      parOuImpar(numero);
      positivoOuNegativo(numero);
    }
  }

  public static void parOuImpar(int n) {
    if (n % 2 == 0) {
      System.out.println("O numero e PAR");
    } else {
      System.out.println("O numero e IMPAR");
    }
  }

  public static void positivoOuNegativo(int n) {
    if (n >= 0) {
      System.out.println("O numero e POSITIVO");
    } else {
      System.out.println("O numero e NEGATIVO");
    }
  }
}