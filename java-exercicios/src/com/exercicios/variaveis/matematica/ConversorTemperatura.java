package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura atual em graus Fahrenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.printf("%.1f°F = %.1fºC", fahrenheit, celsius);
        sc.close();
    }
}
