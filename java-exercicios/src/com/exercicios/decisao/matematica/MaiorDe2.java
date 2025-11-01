package com.exercicios.decisao.matematica;

import java.util.Scanner;

public class MaiorDe2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();


        if (num1 > num2){
            System.out.printf("%d é maior que %d", num1, num2);
        } else if (num1 < num2){
            System.out.printf("%d é maior que %d", num2, num1);
        } else{
            System.out.println("O números são iguais");
        }
    }
}
