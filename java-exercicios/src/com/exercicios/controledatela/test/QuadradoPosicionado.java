package com.exercicios.controledatela.test;

public class QuadradoPosicionado {
    public static void main(String[] args) {
        String espacamento = " ".repeat(20);
        String quadrado =
                "\n".repeat(6) +
                        espacamento + "XXXXX\n" +
                        (espacamento + "X   X\n").repeat(3) +
                        espacamento + "XXXXX\n";

        System.out.print(quadrado);
    }
}
