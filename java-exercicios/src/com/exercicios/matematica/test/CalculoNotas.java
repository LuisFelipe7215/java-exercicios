package com.exercicios.matematica.test;

import java.util.List;

public class CalculoNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(8.0, 7.5, 10.0, 9.0);

        double mediaFinal = 0;
        double peso = 1;
        for (Double nota : notas) {
            mediaFinal += nota * peso;
            peso++;
        }
        mediaFinal /= 10;

        System.out.println("Notas:");
        notas.forEach(System.out::println);
        System.out.printf("Medial final: %s", String.format("%.1f", mediaFinal));
    }
}
