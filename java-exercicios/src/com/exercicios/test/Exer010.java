package com.exercicios.test;

import java.util.ArrayList;
import java.util.List;

public class Exer010 {
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
