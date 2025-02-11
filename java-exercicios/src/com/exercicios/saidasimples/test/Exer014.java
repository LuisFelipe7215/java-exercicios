package com.exercicios.saidasimples.test;

import java.util.ArrayList;
import java.util.List;

public class Exer014 {
    public static void main(String[] args) {
        List<String> pinheiro = new ArrayList<>();
        pinheiro.add("       *");
        pinheiro.add("      ***");
        pinheiro.add("     *****");
        pinheiro.add("    *******");
        pinheiro.add("   *********");
        pinheiro.add("  ***********");
        pinheiro.add(" *************");
        pinheiro.add("***************");
        pinheiro.add("       **");
        pinheiro.add("       **");
        pinheiro.add("      ****");
        pinheiro.forEach(System.out::println);

    }
}
