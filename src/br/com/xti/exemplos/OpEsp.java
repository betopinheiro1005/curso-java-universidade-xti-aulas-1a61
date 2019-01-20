package br.com.xti.exemplos;

/**
 * Testar operadores de atribuição.
 *
 * @author Roberto Pinheiro
 */
import java.util.Scanner;

public class OpEsp {

    public static void main(String[] args) {

        int idade = 6;
        String x = (idade >= 18) ? "Maior de idade" : "Menor de Idade";
        System.out.println("\n" + x);

        String sexo = "M", pais = "Brasil";
        System.out.println("\n" + sexo);
        System.out.println(pais);

        Scanner s = new Scanner(System.in);
        System.out.println("\nInforme o raio:");
        double raio = s.nextDouble();

        // Diametro = 2r
        // double raio = 10;
        double diametro = 2 * raio;
        System.out.println("\nDiametro = " + diametro);

        // Circunferencia = 2 PI r
        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("\nCircunferencia = " + circunferencia);

        // Area = PI r2
        double area = pi * (raio * raio);
        System.out.println("\nArea = " + area);

    }
}
