package br.com.xti.exemplos;

/**
 * Testar operadores de comparação.
 *
 * @author Roberto Pinheiro
 */
public class OpComp {

    public static void main(String[] args) {

        int x = 6;

        System.out.println("\nx igual a 6:");
        System.out.println(x == 6);

        System.out.println("\nx igual a 7:");
        System.out.println(x == 7);

        System.out.println("\nx diferente de 6:");
        System.out.println(x != 6);

        System.out.println("\nx diferente de 7:");
        System.out.println(x != 7);

        System.out.println("\nx maior que 7:");
        System.out.println(x > 7);

        System.out.println("\nx menor que 7:");
        System.out.println(x < 7);

        System.out.println("\nx maior ou igual a 6:");
        System.out.println(x >= 6);

        Integer y = 6;

        System.out.println("\ny é uma instancia da classe Integer?");
        System.out.println(y instanceof Integer);

        String nome = "Roberto";
        System.out.println("\nA variavel nome contem uma String?");
        System.out.println(nome instanceof String);

    }
}
