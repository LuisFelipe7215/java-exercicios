package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class SomaIdades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade da criança");
        int idade = input.nextInt();

        int idadesSomadas = idade * (idade + 1) / 2;

        System.out.println("A soma de todas as idades é " + idadesSomadas);
        input.close();
    }
}
