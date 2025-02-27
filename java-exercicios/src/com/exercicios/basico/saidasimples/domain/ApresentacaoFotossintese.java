package com.exercicios.basico.saidasimples.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ApresentacaoFotossintese extends JFrame {
    private final JLabel textLabel;
    private final String[] slides = {
            "FOTOSSÍNTESE",
            "A água e os sais minerais absorvidos pelas raízes sobem através dos vasos lenhosos do caule e chegam às folhas.",
            "Nas folhas, existe uma substância verde, a clorofila, que absorve a energia luminosa do sol.",
            "Ao mesmo tempo, por meio dos estômatos presentes nas folhas, a planta absorve gás carbônico do ar.",
            "Usando a energia solar, o gás carbônico e o hidrogênio contido na água retirada do solo," +
                    "\napós complicadas reações químicas, a planta produz açúcares (glicose)."
    };
    private int slideAtual = 0;

    public ApresentacaoFotossintese() {
        setTitle("Fotossíntese - Apresentação");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textLabel = new JLabel(slides[slideAtual], SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.CENTER);
        add(textLabel);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    proximoSlide();
                }
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }

    private void proximoSlide() {
        if (slideAtual < slides.length - 1) {
            slideAtual++;
            textLabel.setText("<html><div style='text-align: center;'>" + slides[slideAtual] + "</div></html>");
        }
    }
}
