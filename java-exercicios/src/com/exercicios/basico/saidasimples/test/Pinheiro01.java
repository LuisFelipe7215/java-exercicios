package com.exercicios.basico.saidasimples.test;

import java.util.ArrayList;
import java.util.List;

public class Pinheiro01 {
    public static void main(String[] args) {
        List<String> pinheiro = new ArrayList<>();
        pinheiro.add("       P");
        pinheiro.add("      /^\\");
        pinheiro.add("     XSXSX");
        pinheiro.add("    X#X#X#X");
        pinheiro.add("   X$X#$$X$X");
        pinheiro.add("  X***&&&)))-");
        pinheiro.add(" X@@@XXX¨¨¨XXX");
        pinheiro.add("X+++===///!!!XX");
        pinheiro.add("       XX");
        pinheiro.add("       XX");
        pinheiro.add("      XXXX");

        pinheiro.forEach(System.out::println);

    }
}
