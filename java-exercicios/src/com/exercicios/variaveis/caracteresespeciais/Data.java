package com.exercicios.variaveis.caracteresespeciais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    static void main() {
        LocalDate localDate = LocalDate.parse("10/10/10", DateTimeFormatter.ofPattern("dd/MM/yy"));

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth().getValue());
        System.out.println(localDate.getDayOfMonth());
    }
}
