package com.exercicios.basico.matematica;

public class Imposto {
    public static void main(String[] args) {
        calculaImpostoRenda(1200);
        calculaImpostoRenda(2500);
        calculaImpostoRenda(6000);
        calculaImpostoRenda(12000);
    }

    private static void calculaImpostoRenda(double renda) {
        double impostoTotal = impostoTotais(renda);
        double rendaLiquida = renda - impostoTotal;

        System.out.printf("Renda bruta: R$%.2f%n", renda);
        System.out.printf("Imposto total a pagar: R$%.2f%n", impostoTotal);
        System.out.printf("Renda líquida após impostos: R$%.2f%n", rendaLiquida);
        System.out.println("----------------------------------------");
    }

    private static double impostoTotais(double renda) {
        double impostoTotal = 0;

        System.out.println("----------------------------------------");

        if (renda <= 1200) {
            System.out.println("Faixa 1: Isento de impostos.");
            return 0; // Isento de impostos
        }

        if (renda > 1200 && renda <= 5000) {
            double tributo = (renda - 1200) * 0.10;
            impostoTotal += tributo;
            System.out.printf("Faixa 2: (R$1.201 até R$%.2f) - Imposto: R$%.2f%n", renda, tributo);
        }

        if (renda > 5000 && renda <= 10_000) {
            double tributo = (renda - 5000) * 0.15;
            impostoTotal += tributo;
            System.out.printf("Faixa 3: (R$5.001 até R$%.2f) - Imposto: R$%.2f%n", renda, tributo);
        }

        if (renda > 10_000) {
            double tributo = (renda - 10_000) * 0.20;
            impostoTotal += tributo;
            System.out.printf("Faixa 4: (Acima de R$10.000) - Imposto: R$%.2f%n", tributo);
        }

        return impostoTotal;
    }
}