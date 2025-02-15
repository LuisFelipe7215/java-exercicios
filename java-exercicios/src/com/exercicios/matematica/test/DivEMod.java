package com.exercicios.matematica.test;

import java.util.Scanner;


public class DivEMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto é 37 mod 13?");
        int resposta = sc.nextInt();
        int resultado = 37 % 13;
        System.out.println(verificaResposta(resposta, resultado));

        System.out.println("Quanto é 41 div 7?");
        resposta = sc.nextInt();
        resultado = 41 / 7;
        System.out.println(verificaResposta(resposta, resultado));

        System.out.println("Quanto é 11 div 3 mod 2?");
        resposta = sc.nextInt();
        resultado = 11 / 3 % 2;
        System.out.println(verificaResposta(resposta, resultado));

        System.out.println("Quanto é 11 mod 3 div 2?");
        resposta = sc.nextInt();
        System.out.println(verificaResposta(resposta, resultado));
    }

    private static String verificaResposta(int resposta, int resultado) {
        System.out.println("Resposta: " + resposta);
        System.out.println("Resultado: " + resultado);
        return resposta == resultado ? "O valor informado está correto" : "O valor informado está incorreto";
    }
}
