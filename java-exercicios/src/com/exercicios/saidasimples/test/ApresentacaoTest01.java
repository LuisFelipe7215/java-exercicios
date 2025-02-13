package com.exercicios.saidasimples.test;

import com.exercicios.saidasimples.domain.ApresentacaoFotossintese;

import javax.swing.*;

public class ApresentacaoTest01 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApresentacaoFotossintese apresentacao = new ApresentacaoFotossintese();
            apresentacao.setVisible(true);
        });
    }

}
