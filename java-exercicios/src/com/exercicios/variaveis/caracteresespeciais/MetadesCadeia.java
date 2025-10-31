package com.exercicios.variaveis.caracteresespeciais;

public class MetadesCadeia {
    static void main() {
        String text = """
    Java is a powerful, versatile programming language used worldwide for building enterprise applications,
    mobile apps, and web services.
    It features strong object-oriented principles, platform independence, and robust security features.
    """;

        String substring = text.substring(0, text.length() / 2);
        System.out.println(substring);
    }
}
