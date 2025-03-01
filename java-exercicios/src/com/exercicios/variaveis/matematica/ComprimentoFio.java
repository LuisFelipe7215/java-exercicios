package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class ComprimentoFio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a largura da casa em metros");
        final double LARGURA = input.nextDouble();

        System.out.println("Digite a altura da casa em metros");
        final double ALTURA = input.nextDouble();

        double diagonal = Math.sqrt(Math.pow(LARGURA, 2) + Math.pow(ALTURA, 2)) * 100;
        System.out.printf("É necessário comprar no mínimo %scm de fio.%n", String.format("%.0f", diagonal));
        input.close();
    }
}
