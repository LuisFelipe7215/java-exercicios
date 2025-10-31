package com.exercicios.variaveis.caracteresespeciais;

public class Sorteio {
    static void main() {
        String firstPrize = "34.582";
        String secondPrize = "54.098";

        String finalPrize = firstPrize.split("\\.")[1] + "." + secondPrize.split("\\.")[1];
        System.out.println(finalPrize);
    }
}
