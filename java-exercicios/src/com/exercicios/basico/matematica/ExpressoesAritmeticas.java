package com.exercicios.basico.matematica;

public class ExpressoesAritmeticas {
    public static void main(String[] args) {
        int resultado = 2 * 6 + 11 * 5;
        System.out.println("2 * 6 + 11 * 5 = " + resultado);
        resultado = 20 / -2 / 5;
        System.out.println("20 / -2 / 5 = " + resultado);
        resultado = 20 / 2 * 2;
        System.out.println("20 / 2 * 2 = " + resultado);
        resultado = (3 + 9) / 3 * 4;
        System.out.println("(3 + 9) / 3 * 4 = " + resultado);
        resultado = (5 * 6 / (3 + 2) - 15 * 4) / 6 - 4;
        System.out.println("(5 * 6 / (3 + 2) - 15 * 4) / 6 - 4 = " + resultado);
        resultado = 4 + 32 * 2 - 7 * 2 / (9 - 2);
        System.out.println("4 + 32 * 2 - 7 * 2 / (9 - 2) = " + resultado);
    }
}
