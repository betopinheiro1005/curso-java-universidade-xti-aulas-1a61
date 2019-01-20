package br.com.xti.exemplos;

public class Fluxo {

    public static void main(String[] args) {

        int idade = 10;
        if (idade < 18) {
            System.out.println("Menor de idade");
        }

        int numero = 11;
        if ((numero % 2) == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        idade = 51;
        if (idade <= 10) {
            System.out.println("\nCrianca");
        } else if (idade > 10 && idade <= 18) {
            System.out.println("\nAdolescente");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("\nAdulto");
        } else {
            System.out.println("\nIdoso");
        }

        double nota = 5.5;
        if (nota >= 7) {
            System.out.println("\nAprovado");
        } else {
            if (nota >= 5 && nota < 7) {
                System.out.println("\nExame");
            } else {
                System.out.println("\nReprovado");
            }
        }

    }
}
