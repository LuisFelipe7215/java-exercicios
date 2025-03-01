package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class QuantidadeFlexoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sequências de flexões");
        int sequencia = input.nextInt();

        int flexoes = sequencia * (sequencia + 1) / 2;

        System.out.println("A quantidade total de flexões é " + flexoes);
        input.close();
    }
}
