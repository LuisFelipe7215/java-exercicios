package com.exercicios.variaveis.caracteresespeciais;

import java.nio.charset.StandardCharsets;

public class AsciiNome {
    static void main() {
        String name = "Salameico";

        String initialLetter = name.substring(0, 1);
        String finalLetter = name.substring(name.length() - 1);

        System.out.println("Nome: " + name);
        System.out.println("Letra Inicial: " + initialLetter);
        System.out.println("Código ASCII: " + initialLetter.getBytes(StandardCharsets.US_ASCII)[0]);
        System.out.println("Última Letra: " + finalLetter);
        System.out.println("Código ASCII: " + finalLetter.getBytes(StandardCharsets.US_ASCII)[0]);
    }
}
