package com.exercicios.basico.controledatela;

import java.util.Scanner;

public class Fotossintese {
    public static final String RESET = "\033[0m";
    public static final String VERMELHO = "\033[31m";
    public static final String VERDE = "\033[32m";
    public static final String AZUL = "\033[34m";
    public static final String AMARELO = "\033[33m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto1 = "A fotossíntese é um processo realizado pelas plantas.";
        String texto2 = "Ela utiliza luz solar para produzir energia em forma de glicose.";
        String texto3 = "As folhas absorvem luz " + VERDE + "verde" + RESET + " e liberam oxigênio.";

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(VERMELHO + texto1 + RESET);
        System.out.println("\nPressione Enter para continuar...");
        input.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();


        System.out.println(AZUL + texto2 + RESET);
        System.out.println("\nPressione Enter para continuar...");
        input.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(AMARELO + texto3 + RESET);
        System.out.println("\nPressione Enter para sair...");
        input.nextLine();

        input.close();
    }

}
