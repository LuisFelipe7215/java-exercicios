package com.exercicios.variaveis.caracteresespeciais;

public class Iniciais {
    static void main() {
        String name = "Salameico Maleico";

        char[] chars = name.toCharArray();
        StringBuilder initials = new StringBuilder();

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                initials.append(c);
            }
        }

        System.out.println(initials);
    }
}
