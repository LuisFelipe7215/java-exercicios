package com.exercicios.matematica.test;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        int count = 0;

        while (count < 4) {
            System.out.printf("Entre com a %d° nota%n", count + 1);
            media += (input.nextDouble());
            count++;
        }

        media = media / count;

        int largura = count + 4;

        for (int i = 0; i < largura; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("* " + String.format("%.2f", media) + " *");

        for (int i = 0; i < largura; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
