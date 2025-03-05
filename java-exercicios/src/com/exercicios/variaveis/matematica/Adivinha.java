package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pense em um número...");
        Thread.sleep(1500);
        System.out.println("Multiplique por 2...");
        Thread.sleep(1500);
        System.out.println("Some 6 ao resultado...");
        Thread.sleep(1500);
        System.out.println("Divida o resultado por 2...");
        Thread.sleep(1500);
        System.out.println("Quanto deu? (informe o resultado)");

        int num = sc.nextInt() - 3;

        Thread.sleep(1000);
        System.out.println("Hmm... Estou pensando...");
        Thread.sleep(2000);
        System.out.println("Você pensou no número: " + num);

        sc.close();
    }
}
