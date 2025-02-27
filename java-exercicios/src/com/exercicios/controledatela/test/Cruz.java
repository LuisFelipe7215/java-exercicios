package com.exercicios.controledatela.test;

import java.util.Scanner;

public class Cruz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int linha = 1; linha <= 20; linha++) {
            if (linha == 10) {
                System.out.println("=".repeat(39) + "#");
            } else {
                System.out.printf("%39s#%n", "");
            }
        }

        System.out.println("\nPressione qualquer tecla para sair...");
        input.nextLine();
        input.close();
    }
}
