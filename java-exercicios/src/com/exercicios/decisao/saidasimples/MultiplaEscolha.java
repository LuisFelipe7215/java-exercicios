package com.exercicios.decisao.saidasimples;

import java.util.Scanner;

public class MultiplaEscolha {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha dentre as alternativas abaixo uma fabricante de placa de vídeo: ");
        System.out.println("A) Nvidia");
        System.out.println("B) Amd");
        System.out.println("C) Gigabyte");
        System.out.println("D) Intel");
        System.out.println("E) Geforce");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("C")){
            System.out.println("Opção correta");
        } else{
            System.out.println("Opção incorreta");
        }

    }
}
