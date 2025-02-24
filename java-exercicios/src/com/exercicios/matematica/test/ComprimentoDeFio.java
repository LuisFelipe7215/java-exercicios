package com.exercicios.matematica.test;

public class ComprimentoDeFio {
    public static void main(String[] args) {
        double diagonal = Math.sqrt(Math.pow(11.5, 2) + Math.pow(6.3, 2)) * 100;
        System.out.printf("É necessário comprar no mínimo %scm de fio.%n", String.format("%.0f", diagonal));
    }
}
