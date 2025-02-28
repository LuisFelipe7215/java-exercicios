package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 1;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Entre com %dº número%n", i);
            media *= input.nextInt();
        }

        media = Math.cbrt(media);

        System.out.printf("A média geométrica é %.2f", media);
        input.close();
    }
}
