package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class ConversorPolegada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em cm");
        double cm = sc.nextDouble();

        System.out.printf("%-10s %s%n", "CM", "INCH");
        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %.2f%n", cm, cm / 2.54);
            cm += 10;
        }

        sc.close();
    }
}
