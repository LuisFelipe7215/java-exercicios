package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class AritmeticaBasica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número");
        double num1 = input.nextDouble();

        System.out.println("Entre com outro número");
        double num2 = input.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);

        if (num2 != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
        } else {
            System.out.println("Divisão por 0 não permitida");
        }

        input.close();
    }
}
