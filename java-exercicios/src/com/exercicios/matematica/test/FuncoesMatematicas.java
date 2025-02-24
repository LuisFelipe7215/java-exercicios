package com.exercicios.matematica.test;

import java.util.Scanner;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a raiz quadrada de 169");
        double resposta = input.nextDouble();
        double resultado = Math.sqrt(169);
        verificaResultado(resposta, resultado);
        System.out.printf("Raiz quadrada de 169: %.1f%n", resultado);

        System.out.println("Digite o resultado da potência de 17^2");
        resposta = input.nextDouble();
        resultado = Math.pow(17,2);
        verificaResultado(resposta, resultado);
        System.out.printf("Potência de 17^2: %.1f%n", resultado);

        System.out.println("Digite o cosseno(0)");
        resposta = input.nextDouble();
        resultado = Math.cos(0);
        verificaResultado(resposta, resultado);
        System.out.printf("Cosseno(0): %.1f%n", resultado);

        System.out.println("Digite o arredondamento de 1.65 para inteiro");
        resposta = input.nextDouble();
        resultado = Math.round(1.65);
        verificaResultado(resposta, resultado);
        System.out.printf("Arredondamento para inteiro de 1.65: %.1f%n", resultado);

        input.close();
    }

    private static void verificaResultado(double resposta, double resultado){
        System.out.println("Sua resposta foi: " + resposta);
        System.out.println(Math.abs(resposta - resultado) < 0.0001 ? "A resposta está correta" : "A resposta está incorreta");
    }
}
