package com.exercicios.basico.controledatela;

import java.util.Scanner;

public class MenuPosicionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String espacamento = " ".repeat(20);
        String menu = "\n".repeat(2) +
                espacamento + "Menu Relatórios\n" +
                espacamento + "1 - Por nome\n" +
                espacamento + "2 - Por código\n" +
                espacamento + "3 - Por data\n" +
                espacamento + "4 - Fim\n" + "\n"
                + "Opção:";
        System.out.println(menu);
        sc.nextLine();
        sc.close();
    }
}
