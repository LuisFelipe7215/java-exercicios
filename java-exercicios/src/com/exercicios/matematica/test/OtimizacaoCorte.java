package com.exercicios.matematica.test;

public class OtimizacaoCorte {
    public static void main(String[] args) {
        calculaQtdPedacos(10, 3);
        calculaQtdPedacos(10, 4);
        calculaQtdPedacos(10, 5);

        calculaQtdPedacos(12, 3);
        calculaQtdPedacos(12, 4);
        calculaQtdPedacos(12, 5);

    }

    private static void calculaQtdPedacos(int qtdTabuas, int tamanho) {
        final int TAMANHO_PEDACOS = 45;
        int comprimentoTotal = qtdTabuas * (tamanho * 100);
        int qtdPedacos = comprimentoTotal / TAMANHO_PEDACOS;
        int qtdRestos = comprimentoTotal % TAMANHO_PEDACOS;

        System.out.printf("Tábuas de %d metros%n", tamanho);
        System.out.println("Quantidades de pedaços de 75cm: " + qtdPedacos);
        System.out.println("Quantidades de sobras (em cm): " + qtdRestos);
        System.out.println("---------------------------------");
    }
}
