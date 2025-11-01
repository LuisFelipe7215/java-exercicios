package com.exercicios.decisao.saidasimples;

import java.util.Scanner;

public class MultiplaEscolha2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma categoria de pergunta: ");
        System.out.println("1 - Placa de vídeo");
        System.out.println("2 - Fonte de alimentação");
        int option = sc.nextInt();

        String input = getInput(option, sc);


        if ((input.equalsIgnoreCase("C") && option == 1)
                || (input.equalsIgnoreCase("B") && option == 2)){
            System.out.println("Opção correta");
        } else{
            System.out.println("Opção incorreta");
        }

    }

    private static String getInput(int option, Scanner sc) {
        String input;
        if (option == 1){
            System.out.println("Escolha dentre as alternativas abaixo uma fabricante de placa de vídeo: ");
            System.out.println("A) Nvidia");
            System.out.println("B) Amd");
            System.out.println("C) Gigabyte");
            System.out.println("D) Intel");
            System.out.println("E) Geforce");
        } else {
            System.out.println("Escolha dentre as alternativas abaixo a voltagem correta do fio de cor branca da fonte de alimentação: ");
            System.out.println("A) 5v");
            System.out.println("B) -5v");
            System.out.println("C) 12v");
            System.out.println("D) -12v");
            System.out.println("E) 3.3v");
        }
        input = sc.next();
        return input;
    }
}
