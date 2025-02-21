package com.exercicios.matematica.test;

public class Imposto {
    public static void main(String[] args) {
        calculaImpostoRenda(22_000);
    }

    private static void calculaImpostoRenda(double renda) {

        String rendaFormatada = String.format("%.2f", renda);

        double impostoTotal = impostoTotais(renda);

        double rendaLiquida = renda - impostoTotal;

        String impostoTotalFormatado = String.format("%.2f", impostoTotal);

        System.out.printf("Você terá que pagar R$%s de impostos%n", impostoTotalFormatado);
        System.out.printf("Renda bruta: R$%s%n", rendaFormatada);
        System.out.printf("Renda líquida: R$%s%n", String.format("%.2f", rendaLiquida));
        System.out.println("----------------------------------------");
    }

    private static double impostoTotais(double renda) {
        double tributo;
        double impostoTotal = 0;
        String tributoFormatado;

        if (renda <= 1200) {
            System.out.println("----------------------------------------");
            System.out.println("Sua renda está na faixa de R$1.200,00");
            System.out.printf("A renda está isenta de tributação%n");
            System.out.println("----------------------------------------");
            return 0;
        }

        if (renda >= 1201) {
            System.out.println("----------------------------------------");
            System.out.println("Sua renda está na faixa de R$1.201,00 até R$5.000,00");
            tributo = renda * 0.10;
            impostoTotal += tributo;
            tributoFormatado = String.format("%.2f", tributo);
            System.out.printf("Será cobrado R$%s de imposto%n", tributoFormatado);
            System.out.println("----------------------------------------");
        }

        if (renda >= 5001) {
            System.out.println("Sua renda está na faixa de R$5.001,00 até R$10.000,00");
            tributo = renda * 0.15;
            impostoTotal += tributo;
            tributoFormatado = String.format("%.2f", tributo);
            System.out.printf("Será cobrado R$%s de imposto%n", tributoFormatado);
            System.out.println("----------------------------------------");
        }

        if (renda > 10_000) {
            System.out.println("Sua renda está na faixa acima de R$10.000,00");
            tributo = renda * 0.20;
            impostoTotal += tributo;
            tributoFormatado = String.format("%.2f", tributo);
            System.out.printf("Será cobrado R$%s de imposto%n", tributoFormatado);
            System.out.println("----------------------------------------");
        }

        return impostoTotal;
    }
}
