package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 0;
        double pesos = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Entre com %dº número%n", i);
            media += input.nextInt() * i;
            pesos += i;
        }

        media = media / pesos;

        System.out.printf("A média ponderada é %.2f", media);
        input.close();
    }
}
