package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro exercício");
        int nota1 = sc.nextInt();

        System.out.println("Digite a nota do segundo exercício");
        int nota2 = sc.nextInt() * 2;

        System.out.println("Digite a nota da prova");
        double notaProva = sc.nextDouble() * 8;

        double notaExercicios = (double) (nota1 + nota2) / 3 * 2;

        double notaFinal = (notaProva + notaExercicios) / 10;

        System.out.printf("Nota final: %.1f", notaFinal);

        sc.close();
    }
}
