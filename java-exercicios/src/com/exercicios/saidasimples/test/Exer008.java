package com.exercicios.saidasimples.test;

import com.exercicios.saidasimples.domain.ApresentacaoFotossintese;

import javax.swing.*;

public class Exer008 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApresentacaoFotossintese apresentacao = new ApresentacaoFotossintese();
            apresentacao.setVisible(true);
        });
    }

}
