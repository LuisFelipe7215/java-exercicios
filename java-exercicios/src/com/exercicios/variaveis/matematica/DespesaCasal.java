package com.exercicios.variaveis.matematica;

import java.util.Scanner;

public class DespesaCasal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a renda do marido: ");
        double rendaMarido = sc.nextDouble();

        System.out.print("Digite o valor das despesas pagas pelo marido: ");
        double despesaMarido = sc.nextDouble();

        System.out.print("Digite a renda da esposa: ");
        double rendaEsposa = sc.nextDouble();

        System.out.print("Digite o valor das despesas pagas pela esposa: ");
        double despesaEsposa = sc.nextDouble();

        imprimeTabela(despesaMarido, despesaEsposa, rendaMarido, rendaEsposa);

        sc.close();
    }

    private static void imprimeTabela(double despesaMarido, double despesaEsposa, double rendaMarido, double rendaEsposa) {
        double totalDespesas = despesaMarido + despesaEsposa;
        double partePagaMarido = (despesaMarido / totalDespesas) * 100;
        double partePagaEsposa = (despesaEsposa / totalDespesas) * 100;
        double totalRenda = rendaMarido + rendaEsposa;
        double valorDevidoMarido = totalDespesas * (rendaMarido / totalRenda);
        double valorDevidoEsposa = totalDespesas * (rendaEsposa / totalRenda);
        double saldoMarido = despesaMarido - valorDevidoMarido;
        double saldoEsposa = despesaEsposa - valorDevidoEsposa;

        String tabela = String.format(
                """
                        ITEM           MARIDO   ESPOSA   TOTAL
                        ============== ======= ======= =======
                        Despesas pagas %7.2f %7.2f %7.2f
                        %% pago        %7.2f %7.2f %7.0f
                        Valor devido   %7.2f %7.2f %7.2f
                        Saldo         %7.2f %7.2f
                        """,
                despesaMarido, despesaEsposa, totalDespesas,
                partePagaMarido, partePagaEsposa, 100.0,
                valorDevidoMarido, valorDevidoEsposa, totalDespesas,
                saldoMarido, saldoEsposa
        );

        System.out.println(tabela);
    }
}
