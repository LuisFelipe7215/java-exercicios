package com.exercicios.decisao.matematica;

import java.util.Scanner;

public class MaiorDe3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();


        if (num1 > num2 && num1 > num3){
            System.out.printf("%d é maior que %d e maior que %d", num1, num2, num3);
        } else if (num2 > num1 && num2 > num3){
            System.out.printf("%d é maior que %d e maior que %d", num2, num1, num3);
        } else if (num3 > num1 && num3 > num2){
            System.out.printf("%d é maior que %d e maior que %d", num3, num2, num1);
        } else {
            System.out.println("O números são iguais");
        }
    }
}
