package com.exercicios.basico.saidasimples.test;

import java.util.ArrayList;
import java.util.List;

public class Pinheiro02 {
    public static void main(String[] args) {
        List<String> pinheiro = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        pinheiro.add("       X");
        pinheiro.add("      XXX");
        pinheiro.add("     XXXXX");
        pinheiro.add("    XXXXXXX");
        pinheiro.add("   XXXXXXXXX");
        pinheiro.add("  XXXXXXXXXXX");
        pinheiro.add(" XXXXXXXXXXXXX");
        pinheiro.add("XXXXXXXXXXXXXXX");
        pinheiro.add("       XX");
        pinheiro.add("       XX");
        pinheiro.add("      XXXX");

        for (String string : pinheiro) {

            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == 'X') {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
