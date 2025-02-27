package com.exercicios.basico.saidasimples.test;

import java.util.ArrayList;
import java.util.List;

public class PalavraGrande {
    public static void main(String[] args) {
        List<String> sol = new ArrayList<>();
        sol.add("********  ********  *");
        sol.add("*         *      *  *");
        sol.add("*         *      *  *");
        sol.add("********  *      *  *");
        sol.add("       *  *      *  *");
        sol.add("       *  *      *  *");
        sol.add("********  ********  ********");

        for (String s: sol){
            System.out.println(s);
        }
    }
}
