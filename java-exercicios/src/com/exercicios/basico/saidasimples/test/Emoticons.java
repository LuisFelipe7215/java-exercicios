package com.exercicios.basico.saidasimples.test;

import java.util.HashMap;
import java.util.Map;

public class Emoticons {
    public static void main(String[] args) {
        Map<String, String> emoticons = new HashMap<>();
        emoticons.put(":)", "feliz");
        emoticons.put(":))", "muito feliz");
        emoticons.put("XD", "sorrindo");
        emoticons.put(":‑(", "triste");
        emoticons.put(":=(", "chorando");
        emoticons.put(">:(", "raiva");
        emoticons.put(":|", "sem expressão");

        emoticons.forEach((a, b) -> System.out.printf("%s %s%n", a, b));
    }
}
