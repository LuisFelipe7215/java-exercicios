package com.exercicios.test;

import com.exercicios.domain.ApresentacaoFotossintese;

import javax.swing.*;

public class Exer008 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApresentacaoFotossintese apresentacao = new ApresentacaoFotossintese();
            apresentacao.setVisible(true);
        });
    }

}
