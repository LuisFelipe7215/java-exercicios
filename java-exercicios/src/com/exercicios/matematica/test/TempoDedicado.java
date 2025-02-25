package com.exercicios.matematica.test;

public class TempoDedicado {
    public static void main(String[] args) {
        int diasPorAno = 6 * 52;
        int totalMinutos = diasPorAno * 5;
        int tempoHoras = totalMinutos / 60;
        System.out.printf("A pessoa dedicou %dh ao livro ao final do ano.%n", tempoHoras);
    }
}
