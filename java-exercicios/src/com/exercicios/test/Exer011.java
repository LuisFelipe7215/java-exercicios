package com.exercicios.test;

import java.util.ArrayList;
import java.util.List;

public class Exer011 {
    public static void main(String[] args) {
        List<String> java = new ArrayList<>();
        java.add("        ((");
        java.add("         ))");
        java.add("    ====JAVA====");
        java.add("         ))");
        java.add("        ((");
        java.add(" /\\_/\\");
        java.add("( o.o )   ~~");
        java.add(">  ^  <");

        for (String s: java){
            System.out.println(s);
        }
    }
}
