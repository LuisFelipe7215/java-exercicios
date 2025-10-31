package com.exercicios.variaveis.caracteresespeciais;

public class Finais {
    static void main() {
        String name = "Salameico Maleico";

        for (String s : name.split(" ")) {
            System.out.println(s.charAt(s.length() - 1));
        }
    }
}
