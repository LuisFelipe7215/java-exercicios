package com.exercicios.controledatela.test;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int altura = 10;
        int largura = 80;
        int meio = largura / 2;

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                if (i == altura / 2 && j == i) {
                    System.out.print("LF");
                    j++;
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println("\nPressione qualquer tecla para sair...");
        input.nextLine();
        input.close();
    }
}
