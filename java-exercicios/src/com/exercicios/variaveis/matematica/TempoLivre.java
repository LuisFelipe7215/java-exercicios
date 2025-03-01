package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class TempoLivre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo em minutos disponíveis para estudar");
        final int TEMPO_TOTAL = input.nextInt();
        System.out.println("Digite a quantidade de disciplinas para estudar");
        final int DISCIPLINAS = input.nextInt();

        int tempoDisciplina = TEMPO_TOTAL / DISCIPLINAS;
        int tempoLivre = TEMPO_TOTAL % DISCIPLINAS;

        System.out.println("Tempo dedicado para cada disciplina: " + tempoDisciplina + " minutos");
        System.out.println("Tempo livre: " + tempoLivre + " minutos");
        input.close();
    }
}
