package com.exercicios.variaveis.caracteresespeciais;

public class Iniciais {
    static void main() {
        String name = "Salameico Maleico";

        for (String s : name.split(" ")){
            System.out.println(s.charAt(0));
        }
    }
}
