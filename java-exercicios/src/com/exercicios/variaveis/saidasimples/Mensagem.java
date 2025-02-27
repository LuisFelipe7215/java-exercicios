package com.exercicios.variaveis.saidasimples;

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensagem1 = sc.nextLine();
        String mensagem2 = sc.nextLine();
        String mensagem3 = sc.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.print(mensagem1.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(mensagem2.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(mensagem3.charAt(i));
        }


    }
}
