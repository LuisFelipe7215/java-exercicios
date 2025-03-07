package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class OtimizacaoCorte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        int tamanho;
        int qtdTabuas;
        int tamanhoPedaco;
        while (opcao != 0) {
            System.out.println("Digite o tamanho da tábua");
            tamanho = sc.nextInt();

            System.out.println("Digite a quantidade de tábuas");
            qtdTabuas = sc.nextInt();

            System.out.println("Digite o comprimento em cm de cada pedaço");
            tamanhoPedaco = sc.nextInt();

            calculaQtdPedacos(qtdTabuas, tamanho, tamanhoPedaco);

            System.out.println("Digite 0 para sair do programa ou 1 para continuar.");
            opcao = sc.nextInt();
        }
        sc.close();
    }

    private static void calculaQtdPedacos(int qtdTabuas, int tamanho, int tamanhoPedaco) {
        int comprimentoTotal = qtdTabuas * (tamanho * 100);
        int qtdPedacos = comprimentoTotal / tamanhoPedaco;
        int qtdRestos = comprimentoTotal % tamanhoPedaco;

        System.out.println("---------------------------------");
        System.out.printf("Tábuas de %d metros%n", tamanho);
        System.out.println("Quantidades de pedaços de 75cm: " + qtdPedacos);
        System.out.println("Quantidades de sobras (em cm): " + qtdRestos);
        System.out.println("---------------------------------");
    }
}
