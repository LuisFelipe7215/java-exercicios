package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Entre com a nota %d%n", i);
            media += sc.nextInt();
        }
        media /= 3;

        System.out.println("A média das notas é: " + media);
        sc.close();
    }
}
