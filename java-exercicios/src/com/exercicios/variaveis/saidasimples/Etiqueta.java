package com.exercicios.variaveis.saidasimples;

import java.util.Scanner;

public class Etiqueta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Digite seu nome completo");
        sb.append("Nome: ").append(sc.nextLine()).append("\n");
        System.out.println("Digite seu endereço");
        sb.append("Endereco: ").append(sc.nextLine()).append("\n");
        System.out.println("Digite seu CEP");
        sb.append("CEP: ").append(sc.nextLine()).append("\n");
        System.out.println("Digite seu telefone");
        sb.append("Telefone: ").append(sc.nextLine());

        System.out.println(sb);

    }
}
