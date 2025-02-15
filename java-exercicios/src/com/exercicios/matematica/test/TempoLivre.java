package com.exercicios.matematica.test;

public class TempoLivre {
    public static void main(String[] args) {
        final int TEMPO_TOTAL = 100;
        final int DISCIPLINAS = 6;
        int tempoDisciplina = TEMPO_TOTAL / DISCIPLINAS;
        int tempoLivre = TEMPO_TOTAL % DISCIPLINAS;

        System.out.println("Tempo dedicado para cada disciplina: " + tempoDisciplina + " minutos");
        System.out.println("Tempo livre: " + tempoLivre + " minutos");

    }
}
