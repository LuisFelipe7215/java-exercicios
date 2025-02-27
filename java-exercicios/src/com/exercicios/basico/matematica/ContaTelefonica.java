package com.exercicios.basico.matematica;

import java.text.DecimalFormat;

public class ContaTelefonica {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double assinatura = 17.90;
        double interurbanos = 34.29;
        double custoChamadas = 23 * 0.20;
        double custoImpulsos = calculaCustoImpulso();
        double custoTotal = assinatura + interurbanos + custoImpulsos + custoChamadas;

        System.out.println("Assinatura: R$" + df.format(assinatura));
        System.out.println("Impulsos: R$" + df.format(custoImpulsos));
        System.out.println("Interurbanos: R$" + df.format(interurbanos));
        System.out.println("Chamadas: R$" + df.format(custoChamadas));
        System.out.println("Valor total: R$" + df.format(custoTotal));
    }

    private static double calculaCustoImpulso(){
        final double TAXA_IMPULSO = 0.04;
        return  Math.round((254 - 90) * TAXA_IMPULSO * 100.0) / 100.0;
    }
}
