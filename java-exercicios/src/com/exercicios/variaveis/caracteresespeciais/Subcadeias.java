package com.exercicios.variaveis.caracteresespeciais;

public class Subcadeias {
    static void main() {
        String letras = "ABCDEFGHIJKLMNOPQRST";

        String divisao1 = letras.substring(0, 10);
        String divisao2 = letras.substring(10, 20);

        System.out.println(divisao1);
        System.out.println(divisao2);
    }
}
