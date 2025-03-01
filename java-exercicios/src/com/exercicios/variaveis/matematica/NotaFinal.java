package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do 1º bimestre");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota do 2º bimestre");
        double nota2 = input.nextDouble();

        if ((nota1 < 0 || nota2 < 0) || (nota1 > 10 || nota2 > 10)){
            throw new IllegalArgumentException("Nota não pode ser menor que 0 ou maior que 10");
        }

        double media = (nota1 * 2 + nota2 * 3) / 5;

        System.out.printf("A nota do semestre é: %.2f", media);
        input.close();
    }
}
