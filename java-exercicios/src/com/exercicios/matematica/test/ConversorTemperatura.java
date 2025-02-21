package com.exercicios.matematica.test;

public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.println("Tabela de Fahrenheit em Celsius de 1 a 10");
        double celsius;
        for (int i = 1; i <= 10; i++) {
            celsius = (double) ((i - 32) * 5) / 9;
            System.out.printf("%dºF é igual %sºC%n", i, String.format("%.1f",celsius));
        }
    }
}
