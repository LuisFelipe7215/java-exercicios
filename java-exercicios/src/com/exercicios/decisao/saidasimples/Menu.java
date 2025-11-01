package com.exercicios.decisao.saidasimples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Menu principal");
            System.out.println("1 - Fim");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Consulta");
            int option = sc.nextInt();

            if (option == 1){
                System.out.println("Opção fim escolhida.");
            } else if (option == 2) {
                System.out.println("Opção cadastro escolhida.");
            } else if (option == 3) {
                System.out.println("Opção consulta escolhida.");
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (InputMismatchException e){
            throw new InputMismatchException("A opção deve ser apenas com número.");
        }


    }
}
