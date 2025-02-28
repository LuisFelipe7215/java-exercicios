package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número");
        double num = input.nextDouble();

        System.out.printf("%.1f ^ 2 = %.4f%n", num, Math.pow(num, 2));
        System.out.printf("raiz de %.1f = %.4f%n", num, Math.sqrt(num));
        System.out.printf("log(%.1f) = %.4f%n", num, Math.log(num));
        System.out.printf("e ^ %.1f = %.4f%n", num, Math.exp(num));
        input.close();
    }
}
