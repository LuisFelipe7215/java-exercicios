package com.exercicios.basico.controledatela;

import java.util.Scanner;

public class AnimacaoHorizontal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas = 25;
        int colunas = 80;

        for (int linha = 5; linha <= linhas; linha++) {
            for (int coluna = 1; coluna <= 15; coluna++) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                for (int i = 1; i <= linhas; i++) {
                    if (i == linha) {
                        for (int j = 1; j <= colunas; j++) {
                            if (j == coluna) {
                                System.out.print("O");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else {
                        System.out.println();
                    }
                }

                System.out.println("\nPressione Enter para continuar...");
                input.nextLine();
            }
        }

        input.close();
    }
}
