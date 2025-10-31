package com.exercicios.variaveis.caracteresespeciais;

import java.nio.charset.StandardCharsets;

public class SomaAscii {
    static void main() {
        String abc = "ABC";
        int asciiSum = 0;

        for (byte b : abc.getBytes(StandardCharsets.US_ASCII)) {
            asciiSum += b;
        }
        System.out.printf("Soma de todos o caracteres ASCII de %s é %d", abc, asciiSum);
    }
}
