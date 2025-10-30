package com.exercicios.variaveis.caracteresespeciais;

import java.nio.charset.StandardCharsets;

public class CodigoAscii {
    static void main() {
        String chars = "ABC";

        byte[] charsAscii = chars.getBytes(StandardCharsets.US_ASCII);
        System.out.println(charsAscii[0]);
        System.out.println(charsAscii[1]);
    }
}
